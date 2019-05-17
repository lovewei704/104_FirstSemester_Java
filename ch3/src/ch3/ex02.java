package ch3;

public class ex02 {

	public static void main(String[] args) {

		int x=3 , y=3 , z=3 ;
		
		z += ++x*y++;

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

}
