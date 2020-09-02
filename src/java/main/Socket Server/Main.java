// Packages

// Imports
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// Main Class
public class Main {

    // Private Static Variables
    private static final int PORT = 5056;

    // Main Function
    public static void main(String[] args) throws IOException {
        // Creating the Server
        ServerSocket listener = new ServerSocket(PORT);
        System.out.println("[SERVER] Checking for the Client...");
        Socket client = listener.accept();

        // Debugging
        System.out.println("[SERVER] Connected to the Client");

        // new thread for a client
        //thread = new EchoThread(socket).start();

        // Closed Servers
        if(listener == false) {
           
        System.out.println("[SERVER] Disconnected from the 
        } 
        // System.out.println("[SERVER] Disconnected from the client.");
        client.close();
        listener.close();

    }
}
