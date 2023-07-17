import java.util.Scanner;
public class qus13 {
    static int digit(int num)
    {
        int val=0;
        while(num!=0)
        {
            int a=num%10;
            val++;
            num=num/10;
        }
        return val;
    }
    static void reverse(int num)
    {
        if(digit(num)==4)
        {
        int rev=0;
        int ch=0;
        while(num!=0)
        {
            int a=num%10;
            if(ch==2)
            {
                System.out.println(" ");
            }
            System.out.print(a+" ");
            
            num=num/10;
            ch++;
        }
    }
    else
    {
        System.out.println("enter four digit ");
    }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int number=s.nextInt();
        reverse(number);

    }
}
