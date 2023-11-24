package assignmentSet2;

public class RRTechnicalCertificationTester {

	public static void main(String[] args) {
		
//		Regular Course
		RegularCourseCertification regularCourse = new RegularCourseCertification( "Rakesh", "J2EE", 85, 5 );
		regularCourse.displayDetails();
		
//		Crash Course
		CrashCourseCertification crashCourse = new CrashCourseCertification( "Roshan", "Angular", 71 );
		crashCourse.displayDetails();
		
		
		
		
	}

}
