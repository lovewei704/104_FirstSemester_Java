package ch3;

public class ex01 
{
	public static void main(String[] args)
	{
		int x=1,y=1,z=1;
	
	//	z = ++x - y++;
		x = x + 1 ;
		z = x - y ;
		y = y + 1 ;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
		x=1;
		y=1;
		z=1;
		
		System.out.println("---------------------");
		
	//	z = z + x++ + ++y;
		y = y + 1;
		z = z + x + y ;
		x = x + 1;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);

	}
	
}