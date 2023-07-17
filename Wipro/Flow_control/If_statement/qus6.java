package Flow_control.If_statement;
import java.util.Scanner;

public class qus6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String gender=s.nextLine();
        int age=s.nextInt();
        
        if(gender.equals("female"))
        {
            
              if(age>=1&&age<=58)
            {
                System.out.println("8.2");
            }
            else if(age>=59&&age<=100)
            {
                System.out.println("9.2");
            }

        }
        else
        {
            if(age>=1&&age<=58)
            {
                System.out.println("8.4");
            }
            else if(age>=59&&age<=100)
            {
                System.out.println("10.5");
            }
          
        }
    }
    
}
