import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
   {
   int n, r=0, remainder;
    Scanner input=new Scanner(System.in);
	   System.out.println("Enter n=");
	   n=input.nextInt();
	   
	   while(n!=0)
	   {
	   remainder= n%10;
	   r= r* 10 + remainder;
    n /= 10;
	}
	System.out.println("Reverse of number is "+r);
	}
}
