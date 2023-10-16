import java.util.Scanner;
class Square
{ 
     int side;
	 void getData(int x)
	     { 
		   side=x;
		 }
		 int SquareArea()
		 { 
		   int area = side * side;
		   return (area);
		 }
		 
public class SArea
{
    public static void main(String args[])
    {
     Square firstSquare=new Square();
     firstSquare.getData(5);
     int result=firstSquare.area();
     System.out.println("Area of Square= "+result);
    }
}
}	