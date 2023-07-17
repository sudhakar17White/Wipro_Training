import java.util.Arrays;
import java.util.Scanner;
public class qus5 {
    static void smalltwo(int ar[],int len)
    {
        int i=0;
        int r=0;
        int small=ar[0];
        while(i!=2)
        {
            for(int j=1;j<len;j++)
            {
                if(ar[j]!=0)
                {
                    
                  if(ar[j]<small)
                    {
                    

                     small=ar[j];
                     r=j;
                     
                    }
                }
                
            }
            System.out.print((i+1)+" Small Number "+small+" ");
            System.out.println(Arrays.toString(ar));
            ar[r]=0;
            small=ar[0];
            i++;
        }
    }
    static void bigtwo(int ar[],int len)
    {
        int i=0;
        int r=0;
        int small=ar[0];
        while(i!=2)
        {
            for(int j=1;j<len;j++)
            {
                if(ar[j]!=0)
                {
                    
                  if(ar[j]>small)
                    {
                    

                     small=ar[j];
                     r=j;
                     
                    }
                }
                
            }
            System.out.print((i+1)+" Big Number "+small+" ");
            System.out.println(Arrays.toString(ar));
            ar[r]=0;
            small=ar[0];
            i++;
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
        smalltwo(ar,len);
        bigtwo(ar,len);

    }
}
