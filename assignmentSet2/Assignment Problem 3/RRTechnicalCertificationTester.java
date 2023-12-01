package friday_01_dec;

public class RRTechnicalCertificationTester {

	public static void main(String[] args) {
		
//		Regular Course
		RegularCourseCertification regularCourse = new RegularCourseCertification( "Rakesh", "J2EE", 85 );
		regularCourse.setCourseDuration(5);
		regularCourse.displayCourseDetails();
		
//		Crash Course
		CrashCourseCertification crashCourse = new CrashCourseCertification( "Roshan", "Angular", 71 );
		crashCourse.displayCourseDetails();

	}

}
