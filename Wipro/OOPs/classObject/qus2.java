package OOPs.classObject;
import java.util.Scanner;

public class qus2 {
    static int powerint(int n1,int n2)
    {
        int pow=1;
        for(int i=1;i<=n2;i++)
        {
            pow=pow*n1;
        }
        
        return pow;
    }
    static Double powerdouble(Double n1,int n2)
    {
        Double po=1.0;
        for(int i=1;i<=n2;i++)
        {
            po=po*n1;
        }
        return po;
    }
    static void power(Double n1,Double n2)
    {
        System.out.println(Math.pow(n1, n2));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(powerint(s.nextInt(),s.nextInt()));
        System.out.println(powerdouble(s.nextDouble(),s.nextInt()));
        power(s.nextDouble(),s.nextDouble());
    }
}
