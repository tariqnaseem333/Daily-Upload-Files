package thursday_23_nov;

public class StudentTester{
	
	public static void main(String[] args) {
		
		UndergraduateStudent junior = new UndergraduateStudent("Mehul");
		junior.setTestScore(0, 70);
		junior.setTestScore(1, 69);
		junior.setTestScore(2, 71);
		junior.setTestScore(3, 55);
		junior.generateResult();
		System.out.println("Name: " + junior.getName());
		System.out.println("Result: " + junior.getResult());
		System.out.println();
		
		GraduateStudent senior = new GraduateStudent("Ajay");
		senior.setTestScore(0, 70);
		senior.setTestScore(1, 69);
		senior.setTestScore(2, 71);
		senior.setTestScore(3, 55);
		senior.generateResult();
		System.out.println("Name: " + senior.getName());
		System.out.println("Result: " + senior.getResult());
		System.out.println();
		

		
	}
	
}
