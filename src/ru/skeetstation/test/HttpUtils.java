package ru.skeetstation.test;

import java.io.*;
import java.nio.channels.SocketChannel;

public class HttpUtils {
//    public static String readFullRequest(InputStream input) throws Exception {
//        String content = "";
//        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//        do {
//            content += (char) reader.read();
//        } while (reader.ready());
//        return content;
//    }
//
//    public static void writeResponse(String responseHeader, byte[] responseBody, OutputStream output) throws Exception {
//        BufferedOutputStream out = new BufferedOutputStream(output);
//        out.write(responseHeader.getBytes());
//        out.write("\n".getBytes());
//        out.write(responseBody);
//        out.close();
//    }

    public static boolean isRequestEnd(byte[] request, int length){
        if(length < 4) {
            return false;
        }
        return request[length - 4] == '\r' &&
                request[length - 3] == '\n' &&
                request[length - 2] == '\r' &&
                request[length - 1] == '\n';
    }

    public static byte[] readFullRequest(InputStream in) throws IOException {
        byte[] buff = new byte[1024];
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        while (true) {
            int count  = in.read(buff);
            result.write(buff, 0 , count);
            if (isRequestEnd(buff, count)) {
                return result.toByteArray();
            }
        }
    }

}