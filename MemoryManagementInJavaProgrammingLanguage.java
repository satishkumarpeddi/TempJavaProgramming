class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "Name : "+name+" Age : "+age;
    }
}
public class MemoryManagementInJavaProgrammingLanguage {

     static void createStudentInfo(){
        Student temp = new Student("Rahul", 14);
        System.out.println(temp.toString());
         // When method ends -> temp removed from stack
        // Object becomes eligible for GC if no other reference exists
    }
    public static void main(String[] args){
        //STACK : st1 (Reference ) created
        //Heap : Student object created
        Student st1 = new Student("Mark", 10);
        Student st2 = new Student("John",13);
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        st1=null; //the line of code remove the reference to the st1 object --> eligible for Garbage Collection
        System.gc();
        createStudentInfo();//Another object of student is created in background
    }
   
    
}
