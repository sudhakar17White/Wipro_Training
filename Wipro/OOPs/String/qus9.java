package OOPs.String;
import java.util.Scanner;

public class qus9 {
    static void fise(String fi,String se)
    {
        for(int i=0;i<fi.length();i++)
        {
            System.out.print(fi.charAt(i)+""+se.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        fise(s.nextLine(),s.nextLine());
    }
}
