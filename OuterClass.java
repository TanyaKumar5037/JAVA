public class OuterClass
{
private int x=10;
private static int y=20;
class Inner
{
public void mi()
{
System.out.println("Instance variable...."+x+" ,static variable..."+y);
}
}
public static void main(String args[])
{
OuterClass o=new OuterClass();
OuterClass.Inner in=o.new Inner();
in.ml();
}
}