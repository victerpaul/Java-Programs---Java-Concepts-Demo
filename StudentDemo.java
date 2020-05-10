import java.util.*;

class Student
{
int id;
String name;
int m1,m2,m3;
int avg;
static int count;

void setter(int a,String b)
{
id=a;
name=b;

}

void getMark(){
Scanner sc=new Scanner(System.in);
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
}

void calAvg()
{
avg=(m1+m2+m3)/3;
System.out.println("Average of student "+id+" is "+ avg);
}

void display()
{
System.out.println("ID:"+id);
System.out.println("Name:"+name);
System.out.println(count);
}
}


class StudentDemo
{

static void create()
{

}
public static void main(String[] args)
{
Student s1=new Student();
Student.count++;
s1.setter(5,"ABCD");
s1.getMark();
s1.calAvg();
s1.display();

create();
Student s2=new Student();
Student.count++;
s2.setter(6,"WXYZ");
s2.display();

}

}