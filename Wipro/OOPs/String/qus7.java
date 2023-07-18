package OOPs.String;
import java.util.Scanner;

public class qus7 {
    static void changex(String word)
    {
            if(word.charAt(0)=='x'&&word.charAt(word.length()-1)=='x')
            {
                System.out.println(word.substring(1, word.length()-1));
            }
            else
            {
                System.out.println(word);    
            }
     }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        changex(s.nextLine());
    }
}
