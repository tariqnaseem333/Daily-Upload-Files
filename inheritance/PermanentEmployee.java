package friday_17_nov;

public class PermanentEmployee extends Employee{
	
//	Instance Variables
	private double basicPay;
	private double hra;
	private int experience;
	
//	Constructor
	public PermanentEmployee( int empId, String name, double basicPay, double hra, int experience ) {
		super( empId, name );
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	
//	Methods
	public void calculateSalary() {
		double variableComponent = 0;
		if( this.getExperience() >= 10 ) {
			variableComponent = ( 12 * this.getBasicPay() ) / 100.0;	
		} else if( this.getExperience() >= 5 && this.getExperience() < 10 ) {
			variableComponent = ( 7 * this.getBasicPay() ) / 100.0;
		} else if( this.getExperience() >= 3 && this.getExperience() < 5 ) {
			variableComponent = ( 5 * this.getBasicPay() ) / 100.0;
		}  else if( this.getExperience() < 3 ) {
			variableComponent = ( 0 * this.getBasicPay() ) / 100.0;
		} else {
			variableComponent = 0;
		}
		double salary = variableComponent + this.getBasicPay() + this.getHra();
		this.setSalary(salary);
	}
	
//	Getters and Setters
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
