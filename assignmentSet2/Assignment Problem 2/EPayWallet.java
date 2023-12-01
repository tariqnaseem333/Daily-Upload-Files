package friday_01_dec;

public class EPayWallet {
	
//	Method
	public static void processPaymentByUser( User user, double billAmount ) {
		if( user.makePayement(billAmount) ) {
			System.out.println("Congratulations " + user.getUserName() + ", payment of " + billAmount + " was successful");
			System.out.println("Your wallet balance is " + user.getWalletBalance());
			if( user instanceof KYCUser ) {
				System.out.println("You have " + ((KYCUser)user).getRewardPoints() + " reward points");
			}
			System.out.println("--------------------------------------------");
		} else {
			System.out.println("Sorry " + user.getUserName() + ", not enough balance to make payment");
			System.out.println("Your wallet balance is " + user.getWalletBalance());
			if( user instanceof KYCUser ) {
				System.out.println("You have " + ((KYCUser)user).getRewardPoints() + " reward points");
			}
			System.out.println("--------------------------------------------");
		}
		
	}

}
