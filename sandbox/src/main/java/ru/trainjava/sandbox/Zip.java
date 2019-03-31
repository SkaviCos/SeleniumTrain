package ru.trainjava.sandbox;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Zip {
    public static void main(String[] args)throws Exception {

        Zip zipObj = new Zip();
        zipObj.gzipMyFile();
        //GZipExample zipExm = new GZipExample();
        //zipExm.gzipMyFile();
    }
    public void gzipMyFile() {
        byte[] buffer = new byte[1024];

        try {
            GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("C:\\Users\\Константин\\Downloads\\testtest.gz"));
            FileInputStream fis  =new FileInputStream("C:\\Users\\Константин\\Downloads\\testtest.txt");

            int length;
            while((length = fis.read(buffer))>0){
                gos.write(buffer,0,length);
            }
            fis.close();
            gos.finish();
            gos.close();
            System.out.println("File ok");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
