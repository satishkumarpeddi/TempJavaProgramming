import java.io.*;
public class BufferedInputOutputStream {
    public static void main(String[] args){
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Sample4.txt"))){
            bos.write(("Hello demo of using BufferedOutputStream").getBytes());
            bos.close();
            System.out.println("Successfully loaded the data into the file using BufferedOutputStream");
        }catch(Exception e){
            e.printStackTrace();
        }
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Sample4.txt"))){
            
            int bytesRead;
            while((bytesRead=bis.read())!=-1){
                System.out.print((char)bytesRead);
            }
            System.out.println("\nData is printed on to the cmd successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
