package OOPs.classObject;
import java.util.Scanner;

class box
{
    
    int len,wid,heg;
    box(int  le,int wi,int hi)
    {
        len=le;
        wid=wi;
        heg=hi;

    }
    void volumebox()
    {
        System.out.println((len*wid*heg));
    }


}


public class qus1 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        box bx=new box(s.nextInt(),s.nextInt(),s.nextInt());
        bx.volumebox();
    }    
}
