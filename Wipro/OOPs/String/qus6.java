package OOPs.String;
import java.util.Scanner;;

public class qus6 {
    static void strconcatenate(String one,String two)
    {
        if(one.length()>two.length())
        {
            System.out.println((two+one+two));
        }
        else
        {
            System.out.println((one+two+one));
            
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        strconcatenate(s.nextLine(),s.nextLine());
    }
}
