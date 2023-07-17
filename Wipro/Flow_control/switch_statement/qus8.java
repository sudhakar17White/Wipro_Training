package Flow_control.switch_statement;
import java.util.Scanner;

public class qus8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char key=s.nextLine().charAt(0);
        switch (key) {
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
          
        }
    }
}
