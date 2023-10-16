import java.util.Scanner;
class SampleOne1
    {
public static void main(String args[])
       {
		   int a,b,c;
		   Scanner input = new Scanner(System.in);
		   a=input.nextInt();
		   b=input.nextInt();
		   c=a;
            a=b;
            b=c;			
System.out.println("a="+a+"b="+b);
       }
    }