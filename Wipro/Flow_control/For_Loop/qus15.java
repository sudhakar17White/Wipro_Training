package Flow_control.For_Loop;
import java.util.Scanner;

public class qus15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    
}
