package monday_04_dec;

public class Validator {
	
//	Methods
	public void validate(Applicant applicant) throws InfyBankException {
		if( !this.isValidName(applicant.getApplicantName()) ) {
			throw new InfyBankException("Invalid applicant name");
		}
		else if( !this.isValidAge(applicant.getApplicantAge()) ) {
			throw new InfyBankException("Invalid age");
		}
		else if( !this.isValidPost(applicant.getPostApplied()) ) {
			throw new InfyBankException("Invalid post");
		} 
		else {
			System.out.println("All the values are valid.");
		}
	}
	
	public boolean isValidName(String name) {
		if( !(name.isBlank() || name.isEmpty()) ) {
			return true;
		}
		return false;
	}
	
	public boolean isValidAge(int age) {
		if( age > 18 && age < 35 ) {
			return true;
		}
		return false;
	}
	
	public boolean isValidPost(String post) {
		if( post.equals("Probationary Officer") || post.equals("Assistant")
			|| post.equals("Special Cadre Officer")) {
			return true;
		}
		return false;
	}
	
}
