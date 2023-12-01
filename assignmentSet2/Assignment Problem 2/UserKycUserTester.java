package friday_01_dec;

public class UserKYCUserTester {
	
	public static void main(String[] args) {
		
		User user = new User( 101, "Jack", "jack@infy.com", 1000 );
		User kycUser = new KYCUser( 201, "Jill", "jill@infy.com", 3000 );
		
		EPayWallet.processPaymentByUser(user, 700);
		EPayWallet.processPaymentByUser(kycUser, 1500);
		EPayWallet.processPaymentByUser(kycUser, 800);
		EPayWallet.processPaymentByUser(kycUser, 1200);

		
	}
}
