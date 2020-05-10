class Test
{
	int a;

	Test(int x)
	{
		a=x; 
	}

	public Test incrementValue()   //method with return type as object
	{
		Test temp = new Test(a+10);  // creating new object constructor
		return temp;        // return newly created object
	}

}

class MethodReturnObject
{
public static void main(String a[])
	{
		Test ob1 = new Test(2); //object creation by constructor
		Test ob2;  
		ob2 = ob1.incrementValue(); //object creation by method

		System.out.println("ob1.a: " + ob1.a);

		System.out.println("ob2.a: " + ob2.a);
	}
}

