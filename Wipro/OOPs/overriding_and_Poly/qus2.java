package OOPs.overriding_and_Poly;
class shape
{
    void draw()
    {
        System.out.println("drawing...");
    }
    void erase()
    {
        System.out.println("Eraseing...");
    }
}
class circle extends shape
{

    void draw()
    {
        System.out.println("Circle draw");
    }
    void erase()
    {
        System.out.println("Circle erase");
    }
}
class tirangle extends shape
{

    void draw()
    {
        System.out.println("Triangle draw");
    }
    void erase()
    {
        System.out.println("Triangle erase");
    }

}
class square extends shape
{

    void draw()
    {
        System.out.println("Square draw");
    }
    void erase()
    {
        System.out.println("Square erase");
    }

}
public class qus2 {
    public static void main(String[] args) {
        shape s1=new circle();
        s1.draw();
        s1.erase();
        shape s2=new tirangle();
        s2.draw();
        s2.erase();
        shape s3=new square();
        s3.draw();
        s3.erase();
    }
}
