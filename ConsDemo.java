import java.util.*;

class Rectangle{

int length;
int breadth;

Rectangle()
{
length=5;
breadth=10;
}
Rectangle(int l, int b)
{
length=l;
breadth=b;
}
Rectangle(Rectangle obj)
{
System.out.println("Copy Constructor Invoked");
length=obj.length;
breadth=obj.breadth;
}
int area()
{
return(length*breadth);
}
}
class ConsDemo{
public static void main(String args[])
{
Rectangle firstRect=new Rectangle(5,6);
Rectangle secondRect=new Rectangle(firstRect);
Rectangle third=new Rectangle();
System.out.println("Area of first rectangle= "+firstRect.area());
System.out.println("Area of second rectangle= "+secondRect.area());
System.out.println("Area of third rectangle= "+third.area());
}
}
