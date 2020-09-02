import java.io.*;
import java.net.*;
import java.lang.Thread;

public class EchoServer {
    public static void main (String[] args) {
        try {
            ServerSocket server = new ServerSocket(5566);
            while (true) {
                Socket client = server.accept();

                //Assign a thread for every incoming client so many clients can connect simultaneously
                Thread thread = new EchoHandler(client);

                thread.start();
            }
        }
        catch (Exception e) {
            System.err.println("Exception caught:" + e);
        }
    }
}

