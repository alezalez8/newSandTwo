package com.company.blackjava.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (java.io.RandomAccessFile file =
                     new RandomAccessFile("text10.txt", "rw");
                     //new RandomAccessFile("test2.txt", "rw");
             FileChannel channel = file.getChannel()
        ) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stih = new StringBuilder();
           // System.out.println(file.length());

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("read " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stih.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);

            }
            System.out.println(stih);
            String text = "\nThere are only two ways to live your life." +
                    " One is as though nothing is a miracle. The other is as" +
                    " though everything is a miracle";


            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);
/*
            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
            buffer2.put(text.getBytes());
            buffer2.flip();
            channel.write(buffer2);
*/



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
