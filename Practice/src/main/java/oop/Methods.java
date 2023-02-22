package oop;

public class Methods 
{
	static void Mymethod()// we created a static method, which means that it can be accessed without creating an object of the class, unlike public
	{
		System.out.println("Hello Swathi");

		System.out.println("Static method no need to create object");
	}

	public void MyPublicMethod()
	{
		System.out.println("Public method must create object");
	}
	public static void main(String[] args) 
	{
		Mymethod();
		
		Methods m = new Methods();
		
		m.MyPublicMethod();
	}

}
