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

class BabyDog extends Dog{  
BabyDog(){
System.out.println("Creating BabyDog Object...");
}
void weep(){System.out.println("weeping...");}  
}  

class MultilevelInheritance{  
	public static void main(String args[]){  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
    }
}  