import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;
public class NIO {
    public static void main(String[] args)throws Exception{
        AsynchronousFileChannel channel = AsynchronousFileChannel.open(Paths.get("sample.txt"),StandardOpenOption.READ);
        //Allocate a memory of 1KB 
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        Future<Integer> result = channel.read(buffer,0);
        //Asynchronous Work flow
        while(!result.isDone()){
            System.out.println("Processing other tasks...");
        }
        buffer.flip();
        while(buffer.hasRemaining()){
            System.out.print((char)buffer.get());
        }
        channel.close();
    }
}

//Flip Usecase's 
/*
    ByteBuffer buffer = ByteBuffer.allocate(10);
    buffer.put((byte)'A'); // Position = 1;
    buffer.put((byte)'B'); // Position = 2;
    buffer.put((byte)'C'); // Position = 3;
    buffer.flip(); // Now Position = 0,limit = 3
 */