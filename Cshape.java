# homework1


```java
interface Shape{
    public abstact double getArea();
}
class Rectangle implements Shape{
    double width,height;
    public Rectangle(int w,int h){
        width=w;
        height=h;
    }
    public void getArea(){
        System.out.println("area="+width*height);
    }
    public void toString(){

    }
}
class Triangle implements Shape{
    double base,height;
    public Rectangle(int w,int h){
        width=w;
        height=h;
    }
    public void getArea(){
        System.out.println("area="+base*height/2);
    }
    public void toString(){
        
    }
}
``` 
