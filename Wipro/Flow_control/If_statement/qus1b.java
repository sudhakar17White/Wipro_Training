package Flow_control.If_statement;
import java.util.Scanner;

public class qus1b {

    static void lastdigit(int fi,int sec)
    {
        if((fi%10)==(sec%10))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        lastdigit(s.nextInt(),s.nextInt());

    }
    
}
