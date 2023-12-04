package monday_04_dec;

public class ApplicantValidatorTester {

	public static void main(String[] args) {
		
		Applicant applicant = new Applicant();
		applicant.setApplicantName("Jason");
		applicant.setApplicantAge(32);
		applicant.setPostApplied("Assistant");
		
		try {
			Validator validation = new Validator();
			validation.validate(applicant);
		} catch( InfyBankException e ) {
			System.out.println(e.getMessage());
		}

		
	}

}
