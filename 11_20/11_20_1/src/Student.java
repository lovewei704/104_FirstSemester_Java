import java.util.Scanner;

public class Student {

	Scanner KeyIn = new Scanner(System.in);

	private String name;
	private double average; 
	private int count = 0;
	
	public Student(String name,double average)
	{
		setName(name);
		setAverage(average);
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAverage(double average)
	{
		if(average>0 && average<=100)	this.average=average;
		else
		{
			while( average < 0 || average > 100)
			{
				System.out.println("輸入錯誤 請重新輸入");
				average = Double.parseDouble(KeyIn.nextLine());
				count++;
				
				if(count==5)
				{
					System.out.println("超過輸入次數，關閉程式");
					System.exit(0);
				}
			}
		}
	}
	
	public double getAverage()
	{
		return average;
	}
	
	public String getLevel()
	{
		String level =	"";
		
		switch((int)(average/10))
		{
		case 9 : 
			level = "A";
			break;
		case 8 : 
			level = "B";
			break;
		case 7 : 
			level = "C";
			break;
		case 6 : 
			level = "D";
			break;
		default : 
			level = "F";				
		}
		
		return level;
	}
	
}
