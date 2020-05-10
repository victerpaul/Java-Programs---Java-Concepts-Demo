public class TryCatchEx1 {  
      
        public static void main(String[] args) {  
             
	try 
	  {
	    System.out.println("Inside Try");
            int data=50/0;
	  }
	  catch(ArithmeticException e)
	  {
	     System.out.println("Inside Catch");
	  }
              
          System.out.println("Rest of the code");  
              
        }  
          
    }  