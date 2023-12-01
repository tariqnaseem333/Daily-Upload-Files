package friday_01_dec;

public class KYCUser extends User {
	
//	Instance Variables
	private int rewardPoints;
	
//	Constructor
	public KYCUser(int id, String userName, String email, double walletBalance) {
		super(id, userName, email, walletBalance);
	}

//	Method
	@Override
	public boolean makePayement( double billAmount ) {
		if( super.makePayement(billAmount) ) {
			this.setRewardPoints( this.getRewardPoints() + (int)(billAmount * (10/100.0)) );
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
