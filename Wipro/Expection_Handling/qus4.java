package Expection_Handling;
import java.util.*;

class countyvalid extends Exception
{
    countyvalid(String con)
    {
        super(con);
    }


}


public class qus4 {
    public static void main(String[] args) throws countyvalid{
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        String contry=s.nextLine();
        try {
            if(contry!="India")
            {
                throw new countyvalid("OOPs user outside County can't Registor");
            }
            else
            {
                System.out.println(name+","+contry);
                System.out.println("Registor done sucessfully..");
                
            }

        } catch (countyvalid c) {
            System.out.println(c);
        
        }
    }
}
