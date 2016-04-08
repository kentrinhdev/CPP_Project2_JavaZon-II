package kvtproject2;

//Class that defines customer that inherits from Person class
public class Customer extends Person {
	String memberShipID; 

	//Constructor for the Customer class
	public Customer(String firstName, String lastName, String anAddress,
			String city, String state, String zip, String phone, String aMemberShipID) {
		
		super(firstName, lastName, anAddress, city, state, zip, phone);
		
		memberShipID = aMemberShipID;
	}
	
	//Method to retuen summary about object
	public String toString(){
		String result="";
		
		result += "Member ID: " + memberShipID + "\n";
		result += super.toString();
		
		return result;
	}

}//End of Customer class