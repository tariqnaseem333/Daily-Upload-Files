package assignmentSet2;

public class KycUser extends User {
	
//	Instance Variable
	private int rewardPoints;
	
//	Constructor
	public KycUser( int id, String userName, String email, double walletBalance ) {
		super( id, userName, email, walletBalance );
	}

//	Methods
	@Override
	public boolean makePayment( double billAmount ) {
		if( super.makePayment(billAmount) ) {
			this.setRewardPoints( this.getRewardPoints() + ( (int)(billAmount*10 / 100.0) ) );
			return true;
		}
		return false;
	}

	
//	Getters and Setters
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}
