package assignmentSet2;

public class EPayWallet {
	
//	Method
	public static void processPaymentByUser( User user, double billAmount ) {
		
		if( user.makePayment(billAmount) ) {
			System.out.println("Congratulations " + user.getUserName() + " , payment of " + billAmount + " was successful");
			System.out.println("Your wallet balance is " + user.getWalletBalance());
			if( user instanceof KycUser ) {
				System.out.println("You have " + ((KycUser) user).getRewardPoints()  + " reward points");
			}
			System.out.println("--------------------------------------------");
		} else {
			System.out.println("Sorry " + user.getUserName() + ", not enough balance to make payment");
			System.out.println("Your wallet balance is " + user.getWalletBalance());
			if( user instanceof KycUser ) {
				System.out.println("You have " + ((KycUser) user).getRewardPoints()  + " reward points");
			}
			System.out.println("--------------------------------------------");
		}

	}

}
