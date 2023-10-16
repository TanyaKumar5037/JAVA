import java.util.*;
class Student2
 {
      Scanner sc=new Scanner(System.in);
      String name;
      int total=0;
      int ca[]=new int[3];
      void get()
        {
      System.out.print("Enter the name of the student:");
      name=sc.nextLine();
      System.out.println("Enter the marks of all subjects:");
      for(int i=0;i<3;i++)
        {
      ca[i]=sc.nextInt();
 }
      for(int i=0;i<3;i++)
      {
      total=total+ca[i];
}
}
void print()
{
System.out.println("Name of the student is "+name+", ");
System.out.print(" Total marks of Student is "+total);
}
}


public class Stu
      {
	  public static void main(String args[])
	  {
	  
	Student2 []s=new Student2[5];
	for(int i=0;i<5;i++)
	  {
	  s[i]= new Student2();
	  }
	for(int i=0;i<5;i++)
	  {
	  System.out.println("Enter student"+(i+1));
	  s[i].get();
	  }
	  for(int i=0;i<5;i++)
	  {
		  s[i].print();
	  }
	  }
	  }
	  