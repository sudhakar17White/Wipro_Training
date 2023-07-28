package Io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class file_output {
    public static void main(String[] args) throws IOException {
        
        FileOutputStream fout=new FileOutputStream("notu.txt");
        byte[] ar="sudhakar It".getBytes();
        fout.write(ar);
        FileInputStream fin=new FileInputStream("notu.txt");
        int i=0;
        while((i=fin.read())!=-1)
        {
            System.out.print((char)i);
        }
        fin.close();
    }
}
