package com.company.blackjava.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MyChannelBuffer {
    public static void main(String[] args) {
        try (
                RandomAccessFile file = new RandomAccessFile("text10.txt", "rw");
                FileChannel channel = file.getChannel()
        ) {
            ByteBuffer buffer = ByteBuffer.allocate(10);
            int firstLetter = channel.read(buffer);
            StringBuilder builder = new StringBuilder();

            while (firstLetter > 0) {

            buffer.flip();
                while (buffer.hasRemaining()) {
                    builder.append((char) buffer.get());
                }
                buffer.clear();
                firstLetter = channel.read(buffer);
            }
            System.out.println(builder);





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
