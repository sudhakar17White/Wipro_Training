package Io;
import java.io.*;
import java.util.Scanner;
public class qus1 {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner s=new Scanner(System.in);
       
       System.out.println("Enter File Name:");
       String fname=s.nextLine();
       FileInputStream fi=new FileInputStream(fname);
       char a=s.nextLine().charAt(0);
       int i=0,count=0;
       try {
            while((i=fi.read())!=-1)
            {
                if((char)i==a)
                {
                    count++;
                }
            }
            System.out.println("File "+fname+" has "+count+" insetance of letter "+a);
       } catch (Exception e) {
        // TODO: handle exception
       }

    }
}
