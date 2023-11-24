package assignmentSet2;

public class CrashCourseCertification extends RRTechnicalCertification  {

//	Constructor
	public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);
		this.generateRegistrationId();
	}
	
//	Methods
	@Override
	public void generateRegistrationId() {
		if( counter % 2 != 0 ) {
			counter++;
			this.setRegistrationId(counter);
		}
		this.setRegistrationId(counter);
		counter++;
	}
	@Override
	public double calculateFee() {
		double discount = 0;
		if( this.getAdmissionTestMarks() >= 90 ) {
			discount = 10;
		} else if( this.getAdmissionTestMarks() >= 75 && this.getAdmissionTestMarks() <= 89 ) {
			discount = 5;
		} else {
			discount = 0;
		}
		double discountedFee = Certification.CRASH_COURSE_FEE * ( 1 - discount / 100.0);
		double serviceTax = 12.36;
		return discountedFee * ( 1 + serviceTax / 100.0 );
	}
	
	
	
}
