import java.util.Scanner;
public class qus3 {
    static void search(int ar[],int len,int ser)
    {
        int i=0;
        for(i=0;i<len;i++)
        {
            if(ar[i]==ser)
            {
                break;
            }
        }
        if(i!=len)
        {
            System.out.println(i);
        }
        else
        {
            System.out.println("-1");
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
        search(ar,len,s.nextInt());
    }
}
