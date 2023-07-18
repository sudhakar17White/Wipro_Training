package OOPs.overriding_and_Poly;
class firuts
{

    void eat()
    {
        System.out.println("very sweet");
    }
   

}
class orange extends firuts
{
    void prize()
    {
        System.out.println("120");
    }

}
class apple extends firuts
{
    void prize()
    {
        System.out.println("150");
    }

}

public class qus1 {
    public static void main(String[] args) {
        orange or=new orange();
        System.out.println("Orange");
        or.eat();
        
        or.prize();
        System.out.println("Apple");
        apple ap=new apple();
        ap.eat();
        
        ap.prize();
        
    }
}
