import java.util.Scanner;
public class qus4 {
    static void ascii(int ar[],int len)
    {
        for(int i=0;i<len;i++)
        {
            System.out.print((char)ar[i]+" ");
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
        ascii(ar,len);
    }
}
