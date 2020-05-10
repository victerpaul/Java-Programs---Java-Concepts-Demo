
class Student
{
int id;
String name;
static int c=0;

public static void main(String[] args)
{
Student s1=new Student();
System.out.println(c);
s1.id=5;
s1.name="ABCD";
c=c+1;
System.out.println("ID:"+s1.id);
System.out.println("Name:"+s1.name);
System.out.println(c);
}

}