package week3.day1;

public class OverLoading{

	public static void add(int a,int b)
	{ 
		System.out.println("Sum 2 int is " +(a+b));
		System.out.println("2 Ints");
		
		
	}
	public void add(int a,int b, int c)
	{ 
		System.out.println("Sum is " +(a+b+c));
		System.out.println("3 Ints");
	}
	public void add(float a, float b)
	{
		this.add(6, 7, 8);
		System.out.println("2 Floats");
		
	}
	public static void add(float a)
		{
		System.out.println("1 Float");
	
		}
	
	public void add(int a)
	{
		this.add(8, 9);
		System.out.println("1 Int");
		
	}
	public static void main(String args[])
	{
		OverLoading ol=new OverLoading();
		add(5, 5);
		ol.add(6, 6, 6);
		ol.add(4.4F, 4.4F);
		add(4.4F);
		ol.add(5);
		
		
		
	}
}

