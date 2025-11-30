import java.io.*;

public class FileInputOutputStream {
    public static void main(String[] args){
        String info = "The program make you familiar to fileoutputstream and fileinputstream ";
        try(FileOutputStream fos = new FileOutputStream("Sample.txt")){
            fos.write(info.getBytes());
            fos.close();
            System.out.println("Data is been writtend into the file successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
        try(FileInputStream fis = new FileInputStream("Sample.txt") ){
            int ch;
            while((ch=fis.read())!=-1)
                System.out.print((char)ch);
            
            System.out.println("\nData for the sample.txt file is been readed successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
