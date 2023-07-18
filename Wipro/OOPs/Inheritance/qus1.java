package OOPs.Inheritance;

class animal
{

    void eat()
    {
        System.out.println("eating...");
    }
    void sleep()
    {
        System.out.println("sleeping...");
    }

}
class birds extends animal
{

    void fly()
    {
        System.out.println("Bird will fly high");
    }

}

public class qus1 {
    public static void main(String[] args) {
        System.out.println("animal class");
        animal an=new animal();
        an.eat();
        an.sleep();
        System.out.println("Bird class");
        birds br=new birds();
        br.fly();
        br.eat();
        br.sleep();
    }
    
}
