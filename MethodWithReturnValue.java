class Test
{
	int x,y;
	public int sum(int x, int y)
	{
		return x+y;
	}
}

class MethodWithReturnValue
{
public static void main(String a[])
	{
	   int result;
	   Test mat=new Test();
	   result = mat.sum(11,22);
	   System.out.print(result);
	}
}