package OOPs.Inheritance;

import java.net.Socket;

class person
{

    String name="sudhakar";
    int age=21;
   

}
class empolyee extends person
{
    Double slary;
    int yearwork;
    String insurancenum;
   
    
    public Double getSlary() {
        return slary;
    }

    public void setSlary(Double slary) {
        this.slary = slary;
    }

    public int getYearwork() {
        return yearwork;
    }

    public void setYearwork(int yearwork) {
        this.yearwork = yearwork;
    }

    public String getInsurancenum() {
        return insurancenum;
    }

    public void setInsurancenum(String insurancenum) {
        this.insurancenum = insurancenum;
    }

    
    empolyee(Double slary,int year,String insrunce) {
     
        this.slary=slary;
  
       this.yearwork=year;
    
       this.insurancenum=insrunce;
        
    }



}

public class qus2 {
    public static void main(String[] args) {
        empolyee emp=new empolyee(32000.50, 3, "13212434123");
        System.out.println(emp.name);
        System.out.println(emp.age);
        System.out.println(emp.slary);
        System.out.println(emp.yearwork);
        System.out.println(emp.insurancenum);
    }
}
