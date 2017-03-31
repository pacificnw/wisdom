import java.io.*;
import java.util.*;

public class Person {
    private int age;
    private final String AGE_NOT_VALID = "Age is not valid, setting age to 0.";
    private final String AGE_YOUNG = "You are young.";
    private final String AGE_TEENAGER = "You are a teenager.";
    private final String AGE_OLD = "You are old.";
  
	public Person(int initialAge) {
        
        if (initialAge < 0){
            System.out.println(AGE_NOT_VALID);
            this.age = 0;
        }
        else {
            this.age = initialAge;
        }
	}

	public void amIOld() {
        
        String ageStatement = "";
  		
        // Write code determining if this person's age is old and print the correct statement:
        if (0 <= age && age < 13){
            ageStatement = AGE_YOUNG;
        }
        else if (13 <= age && age < 18){
            ageStatement = AGE_TEENAGER;
        }
        else {
            ageStatement = AGE_OLD;
        }
            
        System.out.println(ageStatement);
	}   

	public void yearPasses() {
  		// Increment this person's age.
        this.age++;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }	
}