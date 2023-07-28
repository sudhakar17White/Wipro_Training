package Expection_Handling;
import java.util.*;
import java.io.*;

class rangeExpection extends Exception
{
    rangeExpection(String name)
    {
        super(name);
    }
}

public class qus3 {
    public static void main(String[] args) throws rangeExpection{
        Scanner s=new Scanner(System.in);
        int m1=s.nextInt();
        int m2=s.nextInt();
        int m3=s.nextInt();

        try {
            if((m1<=0||m1>100)||(m2<=0||m2>100)||(m3<=0||m3>100))
            {
                throw new rangeExpection("Mark out of Range.Check the Marks");
            }
            else
            {
                System.out.println((m1+m2+m3)/3);
            }
            
        } catch (rangeExpection rg) {
            System.out.println(rg);
        }

    }
    
}
