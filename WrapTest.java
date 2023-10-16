class Wrap1{
   private int i;
   Wrap1()
   {}
   Wrap1(int i)
   { 
     this.i=i;
   }
    
   public void setValue(int i)
   { 
      this.i=i;
   }
   @Override
   public String toString() {
     return Integer.toString(i);
	}
	}
	
	public class WrapTest{
	public static void main(String[] args){
	Wrap1 j=new Wrap1(10);
	System.out.println(j);
	}
	}