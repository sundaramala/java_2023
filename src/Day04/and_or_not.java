package Day04;

public class and_or_not 
{

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		// TODO Auto-generated method stub
		System.out.println(a<b && b==c);
		System.out.println(a<b || b==c);
		System.out.println((b<c && a<b));
		System.out.println(!(b<c && a<b));
		
	}

}
