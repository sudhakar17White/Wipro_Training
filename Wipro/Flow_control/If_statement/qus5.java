package Flow_control.If_statement;
import java.util.Scanner;

public class qus5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char a=s.nextLine().charAt(0);
        if(a>='0'&&a<='9')
        {
            System.out.println("Digit");
        }
        else if(a>='a'&&a<='z')
        {
            System.out.println("Alphabhet");
        }
        else
        {
            System.out.println("Special character");
        }

    }
    
}
