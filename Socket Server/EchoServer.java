EXCLAIMER: THIS DOESN'T DO ANYTHING

package com.company;

import java.io.*;
import java.net.*;
import java.lang.Thread;

public class EchoServer {
    public static void main (String[] args) {
        try {
            ServerSocket server = new ServerSocket(5566);
            while (true) {
                Socket client = server.accept();
                EchoHandler handler = new EchoHandler(client);
                handler.start();
            }
        }
        catch (Exception e) {
            System.err.println("Exception caught:" + e);
        }
    }
}

class EchoHandler extends Thread {
    Socket client;
    EchoHandler (Socket client) {
        this.client = client;
    }

    public void run () {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
            writer.println("[type 'bye' to disconnect]");

            while (true) {
                String line = reader.readLine();
                if (line.trim().equals("bye")) {
                    writer.println("bye!");
                    break;
                }
                writer.println("[echo] " + line);
            }
        }
        catch (Exception e) {
            System.err.println("Exception caught: client disconnected.");
        }
        finally {
            try { client.close(); }
            catch (Exception e ){ ; }
        }
    }
}
