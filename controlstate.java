import java.util.Scanner;
class controlstate
{
public static void main(String args[])
{
	int a, b, c, d;
	Scanner input=new Scanner(System.in);
	do{
	   System.out.println("Enter 1 for addition and 2 for subtraction and 3 for exit");
	   d=input.nextInt();
	   
	   if(d==1){
	   System.out.println("Enter a=");
	   a=input.nextInt();
	   System.out.println("Enter b=");
	   b=input.nextInt();
	   c=a+b;
	   System.out.println("Sum ="+c);
	   	}
	   else if(d==2){
	   System.out.println("Enter a=");
	   a=input.nextInt();
	   System.out.println("Enter b=");
	   b=input.nextInt();
	   c=a-b;
	   System.out.println("Difference ="+c);
	   }
	}
       while(d!=3);{
	   System.out.println("Exit");
       }	   
	   
}
}