import java.util.Scanner;
class Average
       {
	   public static void main(String args[])
	   {
	   int n, num, sum=0,i;
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter n=");
	   n=input.nextInt();
	   System.out.println("Enter Elements=");
	   for(i=1;i<=n;i++)
	   {
	   num=input.nextInt();
	   sum+=num;
	   }
	   double average=(double)sum/n;
	   System.out.println("Average of "+n+"numbers is "+average);
	   }
	   }
