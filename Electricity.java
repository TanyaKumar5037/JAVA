//define a class where you have to take unit consumption,customer name,
import java.util.*;
class Elec
{
String customer_name;
int customer_number;
int units;

   void show()
      {
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter Customer Name=");
		customer_name=input.nextLine();
		System.out.println("Enter Customer Number=");
		customer_number=input.nextInt();
		System.out.println("Enter Units Consumed=");
		units=input.nextInt();
	  }
	  void print()
	  {
	    System.out.println("Customer Name="+customer_name);
		System.out.println("Customer Number="+customer_number);
		System.out.println("Units="+units);
	  }
	  double billcalculate(){
		  double total_bill;
	    if(units>100)
		{
		 total_bill=units*2;
		}
		else if((units>100)&&(units<=200))
        {
         total_bill=100*2+((units-100)*3);
        }
        else
		{
         total_bill=100*2+100*3+((units-200)*4);
        }
		return total_bill;
		      }
}
  
class Electricity{
    public static void main(String args[]){
      Elec E1=new Elec();
      E1.show();
	  E1.print();
	  double billPay=E1.billcalculate();
	  System.out.println("Bill to pay="+billPay);
	}
}
		
		
		
