package fig07_18_19;

import java.util.Scanner;

// Fig. 7.19: GradeBookTest.java
// GradeBookTest creates GradeBook object using a two-dimensional array  
// of grades, then invokes method processGrades to analyze them.
public class GradeBookTest
{
   // main method begins program execution
   public static void main(String[] args)
   {
	   Scanner input = new Scanner(System.in);
      // two-dimensional array of student grades
      int[][] gradesArray = new int[5][3];
      
      for(int i=0 ; i<gradesArray.length ; i++)
      {
    	  for(int j=0 ; j<gradesArray[i].length ; j++)
    	  {
    		  
    		  System.out.printf("請輸入第 " + (i + 1) + "人的第 " + (j + 1) + "個成績：");
    		  gradesArray[i][j] = -1;
    		  
    		  while(gradesArray[i][j]<0 || gradesArray[i][j]>100)
    		  {
    			  try
    			  {
    			  gradesArray[i][j] = Integer.parseInt(input.nextLine());
    			  
    			  if(gradesArray[i][j]<0 || gradesArray[i][j]>100) 
    				  System.out.printf("成績須介於０～１００，輸入錯誤！%n請重新輸入：");		  
    			  }
    			  catch(Exception e)
    			  {
    				  
    			  }
    		  }

    	  }
      }
      
      GradeBook myGradeBook = new GradeBook(
         "CS101 Introduction to Java Programming", gradesArray);
      System.out.printf("Welcome to the grade book for%n%s%n%n", 
         myGradeBook.getCourseName());
      myGradeBook.processGrades();
   } 
} // end class GradeBookTest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
