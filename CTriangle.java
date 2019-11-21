# homework1

```java
abstract class CShape{
  protected String color;
  public void setColor(String str){
    color=str;
  }
public abstract void show();

}
class CTriangle extends CShape{
  ptotected double width1,width2,width3;
  public CTriangle(double a,double b,double c){
    width1=a;
    width2=b;
    width3=c;
  
  }
  public show(){
    System.out.print("color="+color+",");
    System.out.println("area="+0.5*a*b);  
  }

}
public class hw_1{
  public static void main(String args[]){
    CTriangle tri=new CTriangle(3,4,5);
    tri.setColor("red");
    tri.show();
  
  
  }


}
``` 
