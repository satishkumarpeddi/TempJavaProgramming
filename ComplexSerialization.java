import java.util.*;
import java.io.*;
class Address implements Serializable{
    private static final long serialVersionUID = 1001L;
    private String city;
    private String state;
    private int pinCode;
    public Address(String city,String state,int pinCode){
        this.city=city;
        this.state=state;
        this.pinCode=pinCode;
    }
    @Override
    public String toString(){
        return "City : "+city+" State : "+state+" PinCode : "+pinCode;
    }
}
class Person implements Serializable{
    private static final long serialVersionUID = 2002L;
    protected String name;
    protected int age;
    protected Address address;
    public Person(String name,int age,Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
class Student extends Person{
    private double marks;
    private String course;
    private   transient String secretNote;
    public Student(double marks,String course,Address address,String name,int age){
            super(name,age,address);
            this.course=course;
            this.marks=marks;
    }
    private void writeObject(ObjectOutputStream oss)throws IOException{
        oss.defaultWriteObject();
        oss.writeUTF("MASKED");
    }
    private void readObject(ObjectInputStream ois)throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        this.secretNote = ois.readUTF();
    }
    @Override
    public String toString(){
        return "Name : "+name+" Age : "+age+" Course : "+course+" Marks : "+marks;
    }
}
public class ComplexSerialization {
    public static void main(String[] args)throws IOException{
        Address  address = new Address("Guntur","AP" , 5220001);
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student(98.0, "CSE", address, "Satish Kumar Peddi ", 19);
        list.add(student);
        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("Student.txt"))){
            oss.writeObject(list);
            System.out.println("Serialization is done .");
        }catch(Exception e){
            e.printStackTrace();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"))){
            ArrayList<Student> listResult= (ArrayList<Student>)ois.readObject();
            for(Student listSub:listResult){
                System.out.println(listSub);
            }
            System.out.println("De-Serialization is done successfully.");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
