import java.util.Scanner;
class Rectangle
{ 
int length,breadth;
void setData(int l, int b)
{
length=l;
breadth=b;
}
int Area()
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
Rectangle firstRect=new Rectangle();
firstRect.setData(5,6);
int result=firstRect.area();
System.out.println("Area of Rectangle= "+result);
}
}

