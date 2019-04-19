package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/
public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream fileOutputStream;

    public AmigoOutputStream(FileOutputStream fOS) throws FileNotFoundException
    {
        super(fileName);
        this.fileOutputStream = fOS;
    }

    @Override
    public void close() throws IOException
    {
        fileOutputStream.flush();
        fileOutputStream.write(new String("JavaRush © All rights reserved.").getBytes());
        fileOutputStream.close();
    }
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public void write(int b) throws IOException{
        fileOutputStream.write(b);
    }


    public void write(byte[] b) throws IOException{
        fileOutputStream.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException{
        fileOutputStream.write(b,off,len);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
}