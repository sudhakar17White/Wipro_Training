package OOPs.String;
import java.util.Scanner;

public class qus5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        System.out.println(word.substring(1, word.length()-1));
    }
}
