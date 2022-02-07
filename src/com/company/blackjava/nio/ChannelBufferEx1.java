package com.company.blackjava.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (java.io.RandomAccessFile file =
                     new RandomAccessFile("text10.txt", "rw");
             FileChannel channel = file.getChannel()
        ) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stih = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("read " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stih.append((char) buffer.get());

                    buffer.clear();
                    byteRead = channel.read(buffer);
                }
            }
            System.out.println(stih);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
