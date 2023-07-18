package OOPs.String;
import java.util.Scanner;

public class qus2 {
    static void concatenate(String word)
    {
        String f="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==',')
            {
                if(word.charAt(i-1)==word.charAt(i+1))
                {
                    f=word.substring(0, i-1)+""+word.substring(i+1, word.length());
                    break;
                }
                else
                {
                    f=f+" "+word.substring(i+1, word.length());
                    break;
                }
            }
            f=f+word.charAt(i);
        }
        System.out.println(f);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        concatenate(s.nextLine());
    }
}
