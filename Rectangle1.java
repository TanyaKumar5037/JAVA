import java.util.Scanner;
class Rectangle1
{
int length;
int breadth;
{
length=l;
breadth=b;
}
Rectangle1(int x)
{
length=x;
breadth=x;
}
/* void setData
{
length=l;
breadth=b;
}*/
int area()
{
int rectArea;
rectArea=length*breadth;
return rectArea;
}
}
class RectangleArea
{
public static void main(String args[])
{
Rectangle firstRect=new Rectangle1(5,6);
Rectangle firstRect1=new Rectangle1(6);
//firstRect=firstRect.area();
int result1=firstRect.area();
System.out.println("Area of rectangles= "+result1);
int result2=firstRect1.area();
System.out.println("Area of rectangle= "+result2);
}
}