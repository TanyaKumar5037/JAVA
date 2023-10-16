import java.util.Scanner;
public class Rev
{
public static void main(String args[]){
int[] num={5,12,15,34,60};
System.out.print("Elements in array");
for(int i=0;i<num.length;i++)
       System.out.println(num[i]+" ");
int[] result=reverse(num);
System.out.println("\nElements in new array");
for(int i=0;i<result.length;i++)
System.out.println(result[i]+" ");
}
static int[] reverse(int[] orgArray){
int[] temp=new int[orgArray.length];
int j=0;
for(int i=orgArray.length-1;i>=0;i--,j++)
temp[j]=orgArray[i];
return temp;
}
}