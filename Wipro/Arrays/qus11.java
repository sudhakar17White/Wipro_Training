import java.util.Scanner;
public class qus11 {
    static void only14(int ar[],int len)
    {
        int ch=0;
        for(int i=0;i<len;i++)
        {
            if(ar[i]==1||ar[i]==4)
            {
                ch++;
            }
        }
        if(ch==len)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        int ar[]=new int[len];
        for(int i=0;i<len;i++)
        {
            ar[i]=s.nextInt();
        }
        only14(ar,len);
    }
}
