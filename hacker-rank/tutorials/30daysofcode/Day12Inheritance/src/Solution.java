import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    public Student(String firstName, String lastName, int idNumber, int[] testScores){
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }
    
    public char calculate(){
        char grade = 'T';
        int totalScore = 0;
        double meanScore = 0;
        
        for (int score : testScores){
            totalScore += score;    
        }
        
        if (testScores.length != 0){
            meanScore = (double)totalScore / (double)testScores.length;
        }
        
        if (90 <= meanScore && meanScore <= 100){
            grade = 'O';
        } else if (80 <= meanScore && meanScore < 90){
            grade = 'E';
        } else if (70 <= meanScore && meanScore < 80){
            grade = 'A';
        } else if (55 <= meanScore && meanScore < 70){
            grade = 'P';
        } else if (40 <= meanScore && meanScore < 55){
            grade = 'D';
        } else {
            grade = 'T';
        }
        
        return grade;
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}