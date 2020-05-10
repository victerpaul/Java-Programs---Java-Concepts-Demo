class Animal
{  
Animal(){
System.out.println("Creating Animal Object...");
}
void eat(){
System.out.println("eating...");
} }  

class Dog extends Animal
{
Dog(){
System.out.println("Creating Dog Object...");
}
void bark(){
System.out.println("barking...");
} }  

class Cat extends Animal
{
Cat(){
System.out.println("Creating Cat Object...");
}  
void meow(){System.out.println("meowing...");
}  } 

class HeirarchicalInheritance{  
	public static void main(String args[]){  
	Cat c=new Cat();  
	c.meow();  
	c.eat();   
    }
}  