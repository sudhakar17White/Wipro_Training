import java.util.Scanner;
public class qus1 {
    static void sumavg(int ar[],int len)
    {
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("Total:"+sum);
        System.out.println("Avarage:"+sum/len);

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        int ar[]=new int[len];

        for(int i=0;i<len;i++)
        {
            ar[i]=s.nextInt();
        }
        sumavg(ar,len);
    }
}
