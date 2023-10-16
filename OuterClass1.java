public class OuterClass1
{
  private int x=10;
  private static int y=20;
   class Inner
   {
    public void ml()
	{
	 System.out.println("instance variable...."+x+" ,static variable...."+y);
	}
   }
public static void main(String args[])
{
    OuterClass1 o=new OuterClass1();
	
	OuterClass1.Inner in=o.new Inner();
	in.ml();
}
}