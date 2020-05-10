public class StringOperations {
	public static void main(String arg[]){
		char letter = 'a';   
		String string1= "Hello"; 
		String string2 = "World";
		String string3 = "";
		String result="";

		String d = new String ("Bad Practice");
		string3 = string1 + string2;//Concatenate strings
		System.out.println("Output: " + string3 + " " + letter);
		result = string3+d;
		System.out.println("Result = "+result);
		
		string3 = "Hello".concat(string2);
		System.out.println("string3: " + string3);
		System.out.println("Length: " + 	string1.length());
		System.out.println("Sub: " +  string3.substring(0, 5));
		System.out.println("Upper: " + string3.toUpperCase()); 

		String s = "Hello World";
		String s2 = s.substring(4,8);
		System.out.println(s.compareTo(s2));   

		String shirts = "Blue Shirt,Red Shirt,Black Shirt,Maroon Shirt";      
      		String[] results = shirts.split(",");
       		for(int k=0;k<results.length-1;k++)
		{
            		System.out.println(results[k]);
        	}    
	   }    
}

