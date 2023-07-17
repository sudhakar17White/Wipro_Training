package Flow_control.If_statement;
import java.util.Scanner;

public class qus7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        char a=s.nextLine().charAt(0);

        if(a>='a'&&a<='b')
        {
            System.out.println((a+"").toUpperCase());
        }
        else
        {
            System.out.println((a+"").toLowerCase());
            
        }

    }
    
}
