package OOPs.Encapusaltion;
class athuor
{
    String name;
    String email;
    char gender;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    athuor(String name,String email,char gen)
    {
        this.name=name;
        this.email=email;
        this.gender=gen;
    }
    

}
class book
{

    String name;
    String author;
    Double price;
    int qut;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQut() {
        return qut;
    }

    public void setQut(int qut) {
        this.qut = qut;
    }

    book(String name,String auth,Double pr,int q)
    {
        this.name=name;
        this.author=auth;
        this.price=pr;
        this.qut=q;
    }

}


public class qus1 {
    public static void main(String[] args) {
        
        athuor at=new athuor("notu", "gamil.com", 'm');
        book bk=new book("gta","notugal",23.56,12);
        System.out.println(at.getName());
        System.out.println(at.getEmail());
        System.out.println(at.getGender());

        System.out.println(bk.getName());

        System.out.println(bk.getAuthor());

        System.out.println(bk.getPrice());

        System.out.println(bk.getQut());

    }
}
