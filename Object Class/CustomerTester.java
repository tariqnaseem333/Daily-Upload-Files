package wednesday_22_nov;

public class CustomerTester {
	
	 public static void main(String[] args) {
	     Customer c1 = new Customer(105, "Max", "8574637281");
	     Customer c2 = new Customer(109, "Nick", "9453281756");
	     Customer c3 = new Customer(109, "Nick", "9453281756");
	     
	     Customer[] cArray = { c1, c2, c3 };
	     
	     Customer uniqueValue = null;
	     for( int i = 0; i < cArray.length; i++ ) {
	    	    uniqueValue = cArray[i];
	            for( int j = 0; j < cArray.length; j++ ) {
	                if( i == j ) {
	                    continue;
	                }
	                if( cArray[i].equals(cArray[j]) ) {
	                	uniqueValue = null;
	                    break;
	                }
	            }
	            if( uniqueValue != null ) {
	            	System.out.println(cArray[i]);
	            }
	            
	     }
	     

	 }

}
