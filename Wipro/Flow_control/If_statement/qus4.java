package Flow_control.If_statement;
import java.util.Scanner;
public class qus4 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System. in);
        
        int a=(int)s.nextLine().charAt(0);
        int b=(int)s.nextLine().charAt(0);
        
        
        if(a<b)
        {
            System. out.println((char)a+","+(char)b);
        }
        else
        {
            System. out.println((char)b+","+(char)a);
        }
        
        
    }
    
}