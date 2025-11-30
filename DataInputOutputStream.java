import java.io.*;
public class DataInputOutputStream {
    public static void main(String[] args){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("sample3.txt"))){
            dos.writeInt(100);
            dos.writeDouble(100.23493);
            dos.writeUTF("Hello -->  DataOutputStream");
            dos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        try(DataInputStream dis = new DataInputStream(new FileInputStream("sample3.txt"))){
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            dis.close();
            System.out.println("Data is printed on the cmd successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
