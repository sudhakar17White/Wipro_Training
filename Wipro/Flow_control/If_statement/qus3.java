package Flow_control.If_statement;
import java.util.Scanner;

public class qus3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String word=s.nextLine();

        if(word.length()==0)
        {
            System.out.println("No Value");
        }
        else
        {
            char ar[]=word.toCharArray();

            for(int i=0;i<ar.length;i++)
            {
                if(ar[i]==' ')
                {
                    System.out.print(",");
                    i++;
                }
                System.out.print(ar[i]);
            }

        }

    }
}
