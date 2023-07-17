import java.util.Scanner;
public class qus14 {
    static void biggest(int ar[][])
    {
        int a[]=new int[9];
        int inx=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[inx]=ar[i][j];
                inx++;
            }
        }
        int max=a[0];
        for(int i=1;i<9;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ar[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                ar[i][j]=s.nextInt();
            }
        }
        biggest(ar);
    }
}
