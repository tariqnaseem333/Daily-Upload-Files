package thursday_23_nov;

public class Intern implements StudentInterface {
	
//	Instance Variables
	private int marksSecured;
	private int projectMarks;
	
//	Constructor
	public Intern( int marksSecured, int projectMarks ) {
		this.marksSecured = marksSecured;
		this.projectMarks = projectMarks;
	}
	
//	Method
	public void calcPercentage() {
		if( this.marksSecured > 300 || this.projectMarks > 100 ) {
			System.out.println("Please enter the correct marks");
			return;
		}
		double percentage = ((this.marksSecured + this.projectMarks) / (double)StudentInterface.TOTAL_MAXIMUM_MARKS) * 100.0;
		System.out.println("The total aggregate percentage secured by the intern is " + percentage);
	}

}
