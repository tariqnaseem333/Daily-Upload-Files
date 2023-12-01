package friday_01_dec;

public class CrashCourseCertification extends RRTechnicalCertification implements Certification {

//	Constructor
	public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);
		this.generateRegistrationId();
	}
	
//	Methods
	public void generateRegistrationId() {
		if( counter % 2 == 0 ) {
			this.setRegistrationId(counter);
		} else {
			this.setRegistrationId(++counter);
		}
		counter++;
	}
	@Override
	public double calculateFee() {
		double discount = 0;
		if( this.getAdmissionTestMarks() >= 90 && this.getAdmissionTestMarks() <= 100) {
			discount = 10;
		} else if( this.getAdmissionTestMarks() >= 75 && this.getAdmissionTestMarks() <= 89) {
			discount = 5;
		}
		double discountedFee = CRASH_COURSE_FEE * ( 1 - (discount/100.0) );
		double serviceTax = 12.36;
		return (discountedFee * ( 1 + (serviceTax/100.0) ) );
	}
	
	
	
}
