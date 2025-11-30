import java.io.*;
public class PrintWriterBufferedReader {

    public static void main(String[] args){
        try(PrintWriter printWriter = new PrintWriter("Sample5.txt")){
            printWriter.println("Hello this is a demo of loading data into the file using PrintWriter.");
            printWriter.println("--> More Easier Compare to other stream's in character ");
            System.out.println("----------------------------------------------------------");
            printWriter.close();
            System.out.println("Successfully loaded data into the file using PrintWriter");
        }catch(Exception e){
            e.printStackTrace();
        }
        try(BufferedReader bf = new BufferedReader(new FileReader("Sample5.txt"))){
            String line;
            while((line=bf.readLine())!=null)
                System.out.println(line);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Successfully loaded data onto the cmd using BufferedReader");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
