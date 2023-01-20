package Day04;

public class test_return {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x = addfunction(10,20);
		System.out.println(x);
		double r = subfunction(10.19,8.08);
		System.out.println(r);

	}
	public static int addfunction(int a,int b)
	{
		return(a+b);
	}
	public static double subfunction(double s,double p)
	{
		return(s-p);
	}
}
