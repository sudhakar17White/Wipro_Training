package Expection_Handling;
import java.util.Scanner;;
public class qus2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        int ar[]=new int[len];
         for(int i=0;i<len;i++)
        {
            ar[i]=s.nextInt();
        }
        try {
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum=sum+ar[i];
        }
        
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
