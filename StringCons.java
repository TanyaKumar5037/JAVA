import java.util.Scanner;
public class StringCons
{
public static void main(String args[])
       {
	     char[] charArray={'H','i',' ','j','a','v','a'};
		 byte[] ascii={65,66,68,69,70};
		 String str="Welcome";
		 String str1=new String("Welcome to Java");
		 String str2=new String(charArray);
		 String str3=new String(charArray,3,2);
		 String str4=new String(ascii);
		 String str5=new String(ascii,2,3);
		 String str6=new String();
		 String str7=new String(str);
		 System.out.println("str = "+str);
		 System.out.println("str = "+str1);
		 System.out.println("str = "+str2);
		 System.out.println("str = "+str3);
		 System.out.println("str = "+str4);
		 System.out.println("str = "+str5);
		 System.out.println("str = "+str6);
		 System.out.println("str = "+str7);
		 str+=" World';
		 System.out.println("str = "+str);
		 }
		 }