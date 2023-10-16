import java.util.Scanner;
class Rectangle
{ 
int length,breadth;
void setData(int l, int b)
{
length=l;
breadth=b;
}
void Area()
{ 
int rectArea;
rectArea=length*breadth;
System.out.println("Area of Rectangle= "+rectArea);
}

class RectangleArea
{
public static void main(String args[])
{
Rectangle firstRect=new Rectangle();
firstRect.setData(5,6);
firstRect.area();
}
}
}

