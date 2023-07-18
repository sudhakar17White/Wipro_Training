package OOPs.String;
import java.util.Scanner;
public class qus4 {
    static void half(String word)
    {
        if(word.length()%2==0)
        {
            System.out.println(word.substring(0, word.length()/2));
        }
        else
        {
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        half(s.nextLine());
    }
}
