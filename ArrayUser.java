import java.util.Scanner;

public class ArrayUser{

   public static void main(String args[]) {
      System.out.println("Enter the required size of the array :: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      System.out.println("Enter the elements of the array one by one ");
     
//Getting array values

      for(int i = 0; i<size; i++) {   
	 System.out.println("Enter the value for element "+(i+1));
         myArray[i] = s.nextInt();
     }

//Printing array values
      for(int i = 0; i<myArray.length; i++) {   
	 System.out.println("Value of "+(i+1)+"th element is "+myArray[i]);
     }
   }
}