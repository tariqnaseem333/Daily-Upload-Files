package thursday_23_nov;

public class Trainee implements StudentInterface {
	
//	Instance Variables
	private int marksSecured;
	
//	Constructor
	public Trainee( int marksSecured ) {
		this.marksSecured = marksSecured;
	}
	
//	Method
	public void calcPercentage() {
		if( this.marksSecured > 400 ) {
			System.out.println("Please enter the correct marks");
			return;
		}
		double percentage =  (this.marksSecured / (double)StudentInterface.TOTAL_MAXIMUM_MARKS) * 100.0;
		System.out.println("The total aggregate percentage secured by the trainee is " + percentage);
	}

}
