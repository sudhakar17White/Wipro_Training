import java.util.Scanner;
public class qus2 {
    static void minmax(int ar[],int len)
    {
        int min=ar[0],max=ar[0];
        for(int i=1;i<len;i++)
        {
            if(ar[i]<min)
            {
                min=ar[i];
                
            }
        }
        System.out.println("Minmum Number:"+min);
        for(int i=1;i<len;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
                
            }
        }
         System.out.println("Maximum Number:"+max);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        int ar[]=new int[len];
        for(int i=0;i<len;i++)
        {
            ar[i]=s.nextInt();
        }
        minmax(ar, len);
        
    }
}
