package com.egarduno.GPAcalc;
import java.util.ArrayList;

/*__________________________________

	Emilio Garduno
	08/07/2013
	GPA Calculator
__________________________________*/

public class GPAcalculator{
  	private ArrayList<Grades> gradeList;
		
		public GPAcalculator(){
			gradeList = new ArrayList<Grades>();
		}
		
		public void add(Grades g){
			gradeList.add(g);
		}
		
		public double getGPA(){
			double GPA = 0;
			double totalcr=0;
			double weight=0;
			for(Grades g:gradeList){
				totalcr += g.getCredits();
				weight += g.getCredits() * g.getGP();
			}
			GPA = weight/totalcr;
			return GPA;
		}
		
		
}//End class GPAcalculator










/*		//CONSOLE DISPLAY------------------------------------------------------------
		//variable declarations (put these in the 'public class GPAcalculator')
		double numCourses = 0;
		double totalGrade = 0;
		double totalCreditValue = 0;
		char keepGoing = 'Y';
*/		//--------------------------------------------------------------------------------


/*		//CONSOLE DISPLAY------------------------------------------------------------
  		//Scanner keysIn = new Scanner(System.in);
		
		//ask the user for their scores and ask if they want to keep going
		while (keepGoing == 'Y')
		{
			//get grade - grade cannot be negative or more than 110%
			String grade = (getValidNumber(grade, 0, 110)).toString();
            double grades = Double.parseDouble(grade);
			
            //add the grade to the total grade
            totalGrade += grades;
            
			//get grade value - value cannot be negative or more than 9
			String value = (getPoints(keysIn, "Enter Credit Value: ",0, 9)).toString();
			double credits=Double.parseDouble(value);
			
			//add the value to the total credit value
			totalCreditValue += credits;
			
			System.out.print("Do you wish to add another? (Y/N) ");
			keepGoing = Character.toUpperCase(keysIn.next().charAt(0));
			
			//add one to the # of course recorded
			numCourses++;
			
			//output
			double avgGrade = totalGrade / numCourses;
			System.out.printf("\nAverage Grade: %.2f",avgGrade);
			
			double gpa  = totalCreditValue / numCourses;
			System.out.printf("\nGPA: %.2f %n", gpa);
		}

	//method getValidNumber
	public Double getValidNumber(double grade, double min, double max){
		
		//System.out.print(prompt);
		Double value = grade;
		while (value <= min || value > max){
			//System.out.println("Grades must be between " + min + " and " + max + ".");
			//System.out.print(prompt);
			value = grade;
		}
		return value;
	}

	//method getPoints
	public Double getPoints(double credits, double min, double max){
		//System.out.print(prompt);
		Double value = credits;
		while (value <= min || value > max){
			//System.out.println("Values must be between " + min + " and " + max + ".");
			//System.out.print(prompt);
			value = credits;
		}
		return value;
	}
*/	//--------------------------------------------------------------------------------
