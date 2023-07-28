package Io;
import java.io.*;
import java.util.Scanner;

public class qus2 {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter File Name to copy:");
        FileInputStream fi=new FileInputStream(s.nextLine());  
        System.out.println("Enter File to paste:");     
        FileOutputStream fo=new FileOutputStream(s.nextLine());
        int i=0;
        while((i=fi.read())!=-1)
        {
            fo.write((char)i);
        } 
        System.out.println("sucessfully copy");
    }
}
