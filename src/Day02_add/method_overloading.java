package Day02_add;

public class method_overloading {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		numadd(10,10);
		numadd(10.10,10.10);
		numadd(10,10,50);
	}
	public static void numadd(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void numadd(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void numadd(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
