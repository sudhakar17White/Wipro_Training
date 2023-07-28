package Expection_Handling;
import java.util.Scanner;

public class qus1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of element in an array:");
        int len=s.nextInt();
        int ar[]=new int[len];
        System.out.println("Enter the element of arrays:");
        for(int i=0;i<len;i++)
        {
            ar[i]=s.nextInt();
        }
        
        try {
            System.out.println("Enter the element you want access:");
            System.out.println("The are of the element "+ar[s.nextInt()]);
            System.out.println("The element Sucessfully acessed");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }

        

    }
}
