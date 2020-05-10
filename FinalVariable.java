
class FinalVariable
{
	final int X=10;
	public FinalVariable(int x)
	{
		this.X=x;// it will throw an error
		System.out.println(x);
	}
	public static void main(String a[])
	{
		FinalVariable f=new FinalVariable(20);
		// X=20;
	}
}