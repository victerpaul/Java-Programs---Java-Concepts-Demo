
public class TryCatchEx2 {  
      
        public static void main(String[] args) {  
             
	try 
	  {
	    System.out.println("Inside Try");
            int data=50/1;
    	    int a[] = new int[2];
            System.out.println(a[3]);
	  }
	  catch(ArithmeticException e)
	  {
	     System.out.println("Inside Catch1");
	  }
	  catch(ArrayIndexOutOfBoundsException e1)
	  {
	     System.out.println("Inside Catch2");
	  }
              
          System.out.println("Rest of the code");      
        }  
    }  