import java.util.*;
class Inp
     {
	   int s1;
	   float s2;
	   int Int_User_Input(int num1)
	   {
	     s1=num1;
		 return s1;
	    }
		  float Float_User_Input(float f1)
	   {
	      s2=f1;
		  return s2;
		}
		   void User_Display()
		{
		  System.out.println("Integer Input "+s1);
		  System.out.println("Float Input "+s2);
		  }
		 }
public class Newprog1
{
  public static void main(String args[])
  {
  Inp b=new Inp();
  int opt;
  }
  do
     {
	    System.out.println("Do you want to enter int input or float input ");
		System.out.println("Press 1 for Integer Input ");
		System.out.println("Press 2 for Float Input");
		System.out.println("Press 3 for Display");
		System.out.println("Press 4 for Exit");
		opt=input.nextInt();
		
		  if(opt==1)
		  {
		    int res1;
			res1=b.Int_User_Input(5);
			System.out.println("Integer Input "+res1);
			}
			else if(opt==2)
			{
			  float res2;
			  res2=b.Float_User_Input(5.5f);
			  System.out,println("Float Input "+res2);
			  }
			    else if(opt==3)
				 {
				 b.User_Display();
				 }
	 }
				 
		
	   
	   