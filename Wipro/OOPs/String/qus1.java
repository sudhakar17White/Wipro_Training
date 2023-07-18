package OOPs.String;
import java.util.Scanner;

public class qus1 {
    static void palindrome(String word)
    {
        String res="";
        for(int i=word.length()-1;i>=0;i--)
        {
            res=res+word.charAt(i);
        }
        System.out.println((word.equals(res)? "palindrome":"Not Palaindrome"));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        palindrome(s.nextLine());
    }
}
