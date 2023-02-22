package Dummy;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your percentage: ");
		double percentage=scanner.nextDouble();
		GradeCalc gc=(per)->
		{
			if((per>=85)&&(per<=100))
			{
				return "A";
			}
			else if((per>=70)&&(per<85))
			{
				return "B";
			}
			else if((per>=55)&&(per<70))
			{
				return "C";
			}
			else if((per>=40)&&(per<55))
			{
				return "D";
			}
			else
			{
				return "Fail";
			}
		};
		String result=gc.grade(percentage);
		System.out.println(result);
		scanner.close();
	}

}
interface GradeCalc
{
	String grade(double per);
}