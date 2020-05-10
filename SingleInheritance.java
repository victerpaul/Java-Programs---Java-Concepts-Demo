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

class SingleInheritance{  
	public static void main(String args[]){  
	Dog d=new Dog();  
	d.bark();  
	d.eat();  
    }
}  