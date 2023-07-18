package OOPs.String;
import java.util.Scanner;
public class qus3 {
    static void repeat(String word)
    {
        String f=word.substring(0, 2);
        for(int i=0;i<word.length();i++)
        {
            System.out.print(f);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        repeat(s.nextLine());
    }
}
