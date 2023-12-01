package friday_01_dec;

public class RegularCourseCertification extends RRTechnicalCertification implements Certification {
	
//	Instance Variables
	private int courseDuration;
	
//	Constructor
	public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks) {
		super(studentName, courseName, admissionTestMarks);
		this.generateRegistrationId();
	}
	
//	Methods
	@Override
	public void generateRegistrationId() {
		if( counter % 2 != 0 ) {
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
		return REGULAR_COURSE_FEE * this.getCourseDuration() *( 1 - (discount/100.0) );
	}
	
//	Getters and Setters
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	
}
