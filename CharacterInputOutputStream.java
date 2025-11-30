import java.io.*;
public class CharacterInputOutputStream {
    public static void main(String[] args){
        try(FileWriter writer = new FileWriter("Sample1.txt")){
            writer.write("Hello this is a demo for the implemention of character stream");
            writer.close();
            System.out.println("Data is successfully loaded into the file.");
        }catch(Exception e){
            e.printStackTrace();
        }
        try(FileReader fr = new FileReader("Sample1.txt")){
            int ch;
            while((ch=fr.read())!=-1)
                System.out.print((char)ch);
            System.out.println("\nData is successfully printed on the terimal.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
