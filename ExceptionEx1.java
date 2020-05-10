public class ExceptionEx1{  
      
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
	     System.out.println("Inside Catch");
	  }
              
          System.out.println("Rest of the code");  
               
        }  
          
    }  