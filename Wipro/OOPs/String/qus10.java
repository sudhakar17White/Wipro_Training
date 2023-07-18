package OOPs.String;
import java.util.Scanner;

public class qus10 {
    static void printwithInt(String word,int num)
    {
        String f=word.substring(num-1, word.length());
        int i=0;
        while(i!=3)
        {
            System.out.print(f+"");
            i++;
        }
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        printwithInt(s.nextLine(),s.nextInt());
    }
}
