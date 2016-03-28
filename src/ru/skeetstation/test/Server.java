package ru.skeetstation.test;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(81);
        while (true) {
            Socket socket = serverSocket.accept();
            try (InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream()) {
                //READ report
                byte[] request = HttpUtils.readFullRequest(in);
                System.out.println(request);
                //WRITE response
                byte[] response = new Date().toString().getBytes("ISO-8859-1");
                out.write(response);
            }
            finally {
                socket.close();
            }
        }

    }
}
