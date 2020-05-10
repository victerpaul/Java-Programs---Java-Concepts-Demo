
class overLoading1
{	
	public void swap(int x, int y)
	{
		int temp = x;
		x = y;
		y = temp;
		System.out.println(" Int X = "+x+", Y = "+y);
	}
	public void swap(float x, float y)
	{
		float temp = x;
		x = y;
		y = temp;
		System.out.println(" Float X = "+x+", Y = "+y);
	}
	public void swap(char x, char y)
	{
		char temp = x;
		x = y;
		y = temp;
		System.out.println("Character X = "+x+", Y = "+y);
	}
	public static void main(String... args)
	{
		overLoading1 ol = new overLoading1();
		ol.swap(1,1);
		ol.swap(3.0f,2.0f);
		ol.swap('a','b');
	}
}