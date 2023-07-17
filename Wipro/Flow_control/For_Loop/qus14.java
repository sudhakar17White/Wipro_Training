package Flow_control.For_Loop;
import java.util.Scanner;

public class qus14 {
    static int sumdigit(int num)
    {
        int sum=0;
        
        while(num!=0)
        {
            int a=num%10;
            sum=sum+a;
            num=num/10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(sumdigit(num));
    }
    
}
