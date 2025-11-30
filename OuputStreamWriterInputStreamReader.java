import java.io.*;
public class OuputStreamWriterInputStreamReader {
    public static void main(String[] args){
        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Sample5.txt"))){
            osw.write("Hello this is demo of visualization of OuputStreamWriter inorder to load data into the file.");
            osw.close();
            System.out.println("Successfully loaded the data into the file using OutputStreamWriter");
        }catch(Exception e){
            e.printStackTrace();
        }
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("Sample5.txt"))){
             int ch;
             while((ch=isr.read())!=-1){
                System.out.print((char)ch);
             }
             System.out.println("\nSuccessfully printed the data onto the cmd using InputStreamReader");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
