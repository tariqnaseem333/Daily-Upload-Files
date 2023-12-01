package friday_01_dec;

public class Trainee implements Student {
	
//	Instance Variables
	private int marksSecured;
	
//	Constructor
	public Trainee( int marksSecured ) {
		this.marksSecured = marksSecured;
	}
	
//	Method
	@Override
	public void calcPercentage() {
		if( this.marksSecured > 400 ) {
			System.out.println("Please enter the correct marks");
			return;
		}
		double percentage =  ( (double)this.marksSecured / Student.TOTAL_MAXIMUM_MARKS) * 100.0;
		System.out.println("The total aggregate percentage secured by the trainee is " + percentage);
	}

}
