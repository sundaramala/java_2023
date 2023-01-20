package day06_condition;
import java.util.Scanner;
public class scanner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Enter value a:- ");
		int a=x.nextInt();
		System.out.println("Enter value b:-");
		int b=x.nextInt();
		x.close();
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else if(b>a)
		{
			System.out.println("b is greater");
		}
		else if(a==b)
		{
			System.out.println("a & b are equal");
		}


	}

}
