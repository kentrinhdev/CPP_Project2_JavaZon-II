package kvtproject2;

//Class that defines person
public class Person {
	private String address;
	private String city;
	private String firstName;
	private String lastName;
	private String phone;
	private String state;
	private String zip; 

	//Constructor for Person class
	public Person(String aFirstName, String aLastName, String anAddress, String aCity, String aState, String aZip, String aPhone){
		firstName = aFirstName;
		lastName = aLastName;
		address = anAddress;
		city = aCity;
		state = aState;
		zip = aZip;
		phone = aPhone;
	}
	
	public String toString(){
		String result="";
		
		result += "Name: " + firstName + " " + lastName + "\n";
		result += "Phone: " + phone + "\n\n";
		result += "Address\n" ;
		result += address + "\n";
		result += city + ", " + state + ", " + zip + "\n";

		return result;
	}

	//-----------------------------------------------------------
	// Getter and Setter for address
	//-----------------------------------------------------------
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//-----------------------------------------------------------
	// Getter and Setter for city
	//-----------------------------------------------------------
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//-----------------------------------------------------------
	// Getter and Setter for first name
	//-----------------------------------------------------------
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//-----------------------------------------------------------
	// Getter and Setter for last name
	//-----------------------------------------------------------
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//-----------------------------------------------------------
	// Getter and Setter for phone
	//-----------------------------------------------------------
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//-----------------------------------------------------------
	// Getter and Setter for state
	//-----------------------------------------------------------
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//-----------------------------------------------------------
	// Getter and Setter for zip
	//-----------------------------------------------------------
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}//End of Person class