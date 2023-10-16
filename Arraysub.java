import java.util.Scanner;
class Arraysub
{
public static void main(String args[])
{
int[] subArray=new int[5];
int i;
int sum=0;
int avg;
Scanner input=new Scanner(System.in);
System.out.println("Enter subject marks= ");
for(i=0;i<5;i++)
    subArray[i]=input.nextInt();
for(i=0;i<subArray.length;i++)
    System.out.println("Subject[" +i+ "]="+subArray[i]);

    //System.out.println("Maths="+subArray[0]);
	//System.out.println("English="+subArray[1]);
	//System.out.println("Science="+subArray[2]);	
	//System.out.println("Computer="+subArray[3]);
	//System.out.println("Social Science="+subArray[4]);
for(i=0; i<subArray.length;i++){
	sum=sum+subArray[i];
}
 System.out.println("Total marks= " + sum); 
 avg=sum/5;
 System.out.println("Average of 5 subjects is= " + avg); 
}
}