package ch4;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		Scanner Input = new Scanner(System.in);
		System.out.println("��J");
		int x = Integer.parseInt(Input.nextLine());
		
		
		for(int i=1; i <= Math.sqrt(x) ; i++)
		{
			if(x%i == 0) counter ++;
		}
		
		if(counter == 1) System.out.println("�O���");
		else System.out.println("���O���");
	}

}
