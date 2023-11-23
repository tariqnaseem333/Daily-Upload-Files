package thursday_23_nov;

public class StudentInternTraineeTester {
	
	public static void main(String[] args) {
		Trainee trainee = new Trainee(370);
		trainee.calcPercentage();
		
		Intern intern = new Intern( 283, 77 );
		intern.calcPercentage();
	}

}
