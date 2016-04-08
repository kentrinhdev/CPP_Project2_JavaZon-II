package kvtproject2;

//Class that defines a clerk that inherits from the Person class
public class Clerk extends Person {
	
	//Declare variables
	private String employeeID;
	private int registerNbr;
	
	//Constructor for the Clerk class
	public Clerk(String anID,int aRegister,
			String firstName,String lastName, String anAddress,
			String city, String state, String zip, String phone) {
		
		super(firstName, lastName, anAddress, city, state, zip, phone);
		
		employeeID = anID;
		registerNbr = aRegister;
	}
	
	//Method to return summary about object
	public String toString(){
		String result="";
		
		result += super.getFirstName();
		result += "EmployeeID:\t" + employeeID + "\n";
		
		return result;
	}

	//Getter for employee ID
	public String getEmployeeID() {
		return employeeID;
	}
	//Getter for register number
	public int getRegisterNbr() {
		return registerNbr;
	}

}//End of Clerk class