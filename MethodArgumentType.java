class Test
{
	int x,y;

	Test(int a,int b)
	{
		x=a;
		y=b;
	}

	public int sum(int x, int y)
	{
		return x+y;
	}
	public int sum(Test m)
	{
		int k=m.x+m.y;
		return k;
	}

	
}

class MethodArgumentType
{
public static void main(String a[])
	{
		int result;

		Test mat=new Test(20,30);

		result = mat.sum(11,22);  
		//pass by value

		System.out.println(result);

		result = mat.sum(mat);
		//pass by reference

		System.out.println(result);
	}
}

