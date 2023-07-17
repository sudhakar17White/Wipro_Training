package Flow_control.While_Loop;
import java.util.Scanner;

public class qus17 {
    static int reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int a=num%10;
            rev=(rev*10)+a;
            num=num/10;

        }
       return rev;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int re=reverse(num);
        if(num==re)
        {
            System.out.println(num+"is a palinrome");
        }
        else
        {
            System.out.println(num+"is a Not a palinrome");
   
        }
    }
    
}
