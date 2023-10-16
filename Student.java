import java.util.*;
class Student1
{
Scanner sc=new Scanner(System.in);
String name;
int total=0;
int ca[]=new int[3];
Student1()
        {
System.out.println("Enter the name of the student:");
name=sc.nextLine();
System.out.println("Enter the marks of all subjects:");
for(int i=0;i<3;i++)
       {
ca[i]=sc.nextInt();
       }
		}
		void calculate()
		{			
           for(int i=0;i<3;i++)
            {
              total=total+ca[i];
            }
        }
void print()
{
System.out.println("name of that student is "+name);
System.out.println("Total marks="+total);
}
}
class Student
{
	public static void main(String args[])
	{
		Student1 s1=new Student1();
		s1.calculate();
		s1.print();
		Student s2=new Student1();
		s2.calculator();
		s2.print();
	}
}

