package com.tek.sender;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class RtpSenderVideo {

    public static void main(String[] args) throws Exception {
        DatagramSocket client = new DatagramSocket();
        InetAddress addr = InetAddress.getByName("127.0.0.1");
        int port = 15180;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(
                new File("E:/repo/vlc-test/vlc-java/h264_1301.dat"))));
        String line = reader.readLine();
        int idx = 0;
        while(line != null) {
            idx++;
            String[] strBytes = line.split(" ");
            byte[] bytes = new byte[strBytes.length];
            for (int i = 0; i < strBytes.length; i++) {
                bytes[i] = convertByte(strBytes[i]);
            }
            DatagramPacket pkt = new DatagramPacket(bytes, bytes.length, addr, port);
            client.send(pkt);
            System.out.println("Send packate - " + idx + ", size - " + bytes.length);
            Thread.sleep(10);
            line = reader.readLine();
        }
        reader.close();
        client.close();
    }
    
    private static byte convertByte(String hexStr) {
        if (hexStr == null || hexStr.length() != 2) {
            throw new IllegalArgumentException("The hex string " + hexStr + " can't be converted to byte");
        }
        byte b0 = Byte.decode("0x" + hexStr.charAt(0));
        byte b1 = Byte.decode("0x" + hexStr.charAt(1));
        b0 = (byte) ((byte) b0 << 4);
        return (byte) (b0 | b1);
    }
}
