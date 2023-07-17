import java.util.Scanner;
public class qus8 {
    static void addarray(int ar[],int len)
    {
        int sum=0;
        int j;
        for(int i=0;i<len;i++)
        {
            if(ar[i]==6)
            {
                for(j=i+1;j<len;j++)
                {
                    if(ar[j]==7)
                    {
                        break;
                    }
                }
                i=j;
            }
            else
            {
                sum+=ar[i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        int ar[]=new int[len];
        for(int i=0;i<len;i++)
        {
            ar[i]=s.nextInt();
        }
        addarray(ar, len);
    }
}
