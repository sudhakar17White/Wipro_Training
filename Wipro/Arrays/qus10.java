import java.util.Arrays;
import java.util.Scanner;
public class qus10 {
    static void evenodd(int ar[],int len)
    {
        int ox=0,ex=0;
        int oinx[]=new int[len/2],einx[]=new int[len/2];
        for(int i=0;i<len;i++)
        {
            if(ar[i]%2==0)
            {
                oinx[ox]=ar[i];
                ox++;
            }
            else
            {
                einx[ex]=ar[i];
                ex++;
            }
        }
        System.out.println(Arrays.toString(einx));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        int ar[]=new int[len];
        for(int i=0;i<len;i++)
        {
            ar[i]=s.nextInt();
        }
        evenodd(ar,len);
    }
}
