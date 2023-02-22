package Dummy;

public class main4 {

	public static void main(String[] args) 
	{
            A a=()->{
            	System.out.println("show");
            };
	}

}
interface A
{
	abstract void show();//public abstact void method
}
//to reduce the complexity of the language, lambda expressions are limited to work with
//functional interfaces only.
//SAM : Single Abstract Method