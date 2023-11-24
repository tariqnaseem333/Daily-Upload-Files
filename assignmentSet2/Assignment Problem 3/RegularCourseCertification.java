package assignmentSet2;

public class RegularCourseCertification extends RRTechnicalCertification {
	
//	Instance Variable
	private int courseDuration;
	
//	Constructor
	public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
		super(studentName, courseName, admissionTestMarks);
		this.courseDuration = courseDuration;
		this.generateRegistrationId();
	}
	
//	Methods
	@Override
	public void generateRegistrationId() {
		if( counter % 2 == 0 ) {
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
		return Certification.REGULAR_COURSE_FEE * this.getCourseDuration() * ( 1 - discount / 100.0);
	}
	
//	Getters and Setters
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

}
