package ch4;

import java.security.SecureRandom;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecureRandom r = new SecureRandom();
		int x=0 , y=0 , z=0;
		int highest = 0;
		
		x= r.nextInt(101);
		y= r.nextInt(101);
		z= r.nextInt(101);

		if(x > highest) highest = x ;
		if(y > highest) highest = y ;
		if(z > highest) highest = z ;
		
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		System.out.println("z =" + z);
		System.out.println("³Ì¤j­È¬°" + highest);
		
	}

}
