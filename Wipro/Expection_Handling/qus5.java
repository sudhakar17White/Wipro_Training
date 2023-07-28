package Expection_Handling;

import java.util.*;
class agecheck extends Exception
{
    agecheck(String msg)
    {
        super(msg);
    }

}
public class qus5 {
    public static void main(String[] args) throws agecheck{
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        try {
            if(age<18||age>60)
            {
              throw new agecheck("Check and enter age");
            }
            else
            {
                System.out.println("sucessfuly enter age");
            }

        } catch (agecheck ag) {
            System.out.println(ag);
        }
        
    }
}
