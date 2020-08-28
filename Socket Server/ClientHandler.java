package com.company;

// Imports
import java.net.Socket;

public class ClientHandler implements Runnable {

    private Socket client;

    public ClientHandler(Socket clientSocket){
        this.client = clientSocket;

    }

    @Override
    public void run() {

    }
}
