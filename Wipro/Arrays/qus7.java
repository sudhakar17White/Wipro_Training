import java.util.Arrays;
import java.util.Scanner;
public class qus7 {
    static void duplicate(int ar[],int len)
    {
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(ar[i]==ar[j])
                {
                    ar[j]=0;
                }

            }
        }
     
        for(int i=0;i<len;i++)
        {
            if(ar[i]!=0)
            {
                System.out.print(ar[i]+" ");
            }
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
        duplicate(ar,len);
    }
}
