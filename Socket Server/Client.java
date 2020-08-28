// Packages
package com.company;

// Imports
import java.io.IOException;
import java.net.Socket;

// Main Class
public class Client {

    // Private Static Variables
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 9090;


    // Main Function
    public static void main(String[] args) throws IOException {
        // Creating the Client and Checking for Server Connection
        Socket socket = new Socket(SERVER_IP, SERVER_PORT); // Creating the Client
        System.out.println("[CLIENT] Looking for Server Connection."); // Debugging Purposes

        // Open the GUI Application
        System.out.println("[CLIENT] Connected to the Server.");
        app a = new app();
        a.chatapplication();


    }
}
