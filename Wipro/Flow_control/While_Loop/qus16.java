package Flow_control.While_Loop;
import java.util.Scanner;

public class qus16 {
    static void reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            int a=num%10;
            rev=(rev*10)+a;
            num=num/10;

        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        reverse(s.nextInt());
    }
}
