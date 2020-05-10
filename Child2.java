class Base
{
	int b1=100;
	private void display()
	{
		System.out.println("Method of Base Class");
	}
}
class Child2 extends Base
{
	int c1=200;	
	public void display()
	{
		System.out.println("Method of Child Class");
		System.out.println("b1= "+this.b1+" c1= "+this.c1);
	}
	public static void main(String a[])
	{
		Child2 ch=new Child2();
		ch.display();
	}
}