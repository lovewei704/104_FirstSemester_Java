
import java.lang.*;
import java.util.Scanner;

public class StudentTest {
		
public static void main(String[] args)
{
	Scanner KeyIn = new Scanner(System.in);
	Student[] Accounts = new Student[5];
	
	boolean check = false;
	int count = 0;
	// Student Account1 = new Student("AA",86.7);
	// Student Account2 = new Student("BB",62.5);
	
	String[] names = new String[5];
	Double[] averages = new Double[5];
	
	for(int i =1;i<=5;i++)
	{
		System.out.println("�п�J�� " + i + " �Ӿǥͪ��m�W");
		names[i-1] = KeyIn.nextLine();

		System.out.println("�п�J�� " + i + " �Ӿǥͪ����Z");
		averages[i-1] = Double.parseDouble(KeyIn.nextLine());

		Accounts[i-1] = new Student(names[i-1],averages[i-1]);
		
		if(i==5)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("%s'S grade is %s%n",Accounts[j-1].getName(),Accounts[j-1].getLevel());
			}
		}
		
	}
	
}	
}