package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter printWriter;
    private BufferedReader reader;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
        reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = reader.readLine();
        System.out.println(greeting);
    }
    public void stop() throws IOException {
        reader.close();
        printWriter.close();
        clientSocket.close();
        serverSocket.close();
    }

    public static void main(String args[]) throws IOException {
        Server server = new Server();
        server.start(6666);
    }

}
