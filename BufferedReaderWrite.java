import java.io.*;
public class BufferedReaderWrite {
    public static void main(String[] args){
        try(BufferedWriter bfw = new BufferedWriter(new FileWriter("sample2.txt"))){
            bfw.write("This is a demo of using bufferedwriter and bufferedreader");
            bfw.newLine();
            bfw.write("for faster implementation.");
            bfw.close();
            System.out.println("Data is writtend into the successfully using bufferedwriter.");
        }catch(Exception e){
            e.printStackTrace();
        }
        try(BufferedReader bfr = new BufferedReader(new FileReader("sample2.txt"))){
            String line;
            while((line=bfr.readLine())!=null)
                System.out.println(line);
            System.out.println("Data is printed on the terminal successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
