package kvtproject2;

//Class that defines the validator
public class Validator {
	//TODO - CODE THE VALIDATOR
	//add the method that will validate all the input
	//collected from the form
	
	//static variable to hold any error that occurs
	private static String errorMessage = "";
	
	//-------------------------------------------------------------------------------------------------
	//	Validate the Order ID
	//-------------------------------------------------------------------------------------------------
	public static String getOrderID(String anID){
		//run the validation
		//add any errors to the error message
		if (anID.length() == 0){
			errorMessage += "The Order ID [" + anID + "] cannot be blank! Re-Enter the Order ID \n";
		}
		return anID;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the First Name
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidFirstName(String aFirstName){
		boolean result = false;
		//TODO add your code here
		if(aFirstName.matches("[a-zA-Z ,]+") && aFirstName != null && aFirstName.length() >= 2){
			result = true;
		}
		return result;
	}
	public static String getFirstName(String aFirstName){
		if(isValidFirstName(aFirstName) == false){
			errorMessage += "The First Name entered: [" + aFirstName + "] is invalid! Re-Enter the First Name \n";
		}
		return aFirstName;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Last Name
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidLastName(String aLastName){
		boolean result = false;
		//TODO add your code here
		if(aLastName.matches("[a-zA-Z ,]+") && aLastName != null && aLastName.length() >= 2){
			result = true;
		}
		return result;
	}
	public static String getLastName(String aLastName){
		if(isValidLastName(aLastName) == false){
			errorMessage += "The Last Name entered: [" + aLastName + "] is invalid! Re-Enter the Last Name \n";
		}
		return aLastName;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Membership
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidMembership(String aMemberShip){
		boolean result = false;
		//TODO add your code here
		if(aMemberShip.matches("[a-zA-Z]{2,2}[0-9]{4,4}") && aMemberShip != null && aMemberShip.length() == 6){
			result = true;
		}
		return result;
	}
	public static String getMemberShip(String aMemberShip){
		if(isValidMembership(aMemberShip) == false){
			errorMessage += "The Membership number entered: [" + aMemberShip + "] is invalid! Re-Enter the 2-letter 4-digit Membership number \n";
		}
		return aMemberShip;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Phone
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidPhone(String aPhone){
		boolean result = false;
		//TODO add your code here
		if(aPhone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}") && aPhone != null && aPhone.length() == 12){
			result = true;
		}
		return result;
	}
	public static String getPhone(String aPhone){
		if(isValidPhone(aPhone) == false){
			errorMessage += "The Phone number entered: [" + aPhone + "] is invalid! Re-Enter the 10-digit Phone number with dashes \n";
		}
		return aPhone;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Street
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidStreet(String aStreet){
		boolean result = false;
		//TODO add your code here
		if(aStreet.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)") && aStreet != null && aStreet.length() > 2){
			result = true;
		}
		return result;
	}
	public static String getStreet(String aStreet){
		if(isValidStreet(aStreet) == false){
			errorMessage += "The Street Address entered: [" + aStreet + "] is invalid! Re-Enter the Street Address \n";
		}
		return aStreet;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the City
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidCity(String aCity){
		boolean result = false;
		//TODO add your code here
		if(aCity.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)") && aCity != null && aCity.length() > 2){
			result = true;
		}
		return result;
	}
	public static String getCity(String aCity){
		if(isValidCity(aCity) == false){
			errorMessage += "The City entered: [" + aCity + "] is invalid! Re-Enter the City \n";
		}
		return aCity;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the State
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidState(String aState){
		boolean result = false;
		//TODO add your code here
		if(aState.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)") && aState != null && aState.length() == 2){
			result = true;
		}
		return result;
	}
	public static String getState(String aState){
		if(isValidState(aState) == false){
			errorMessage += "The State code entered: [" + aState + "] is invalid! Re-Enter the 2-letter State code \n";
		}
		return aState;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Zip
	//-------------------------------------------------------------------------------------------------
	private static boolean isValidZip(String aZip){
		boolean result = false;
		//TODO add your code here
		if(aZip.matches("\\d{5}") && aZip != null && aZip.length() == 5){
			result = true;
		}
		return result;
	}
	public static String getZip(String aZip){
		if(isValidZip(aZip) == false){
			errorMessage += "The Zip code entered: [" + aZip + "] is invalid! Re-Enter the 5-digit Zip code \n";
		}
		return aZip;
	}
	//-------------------------------------------------------------------------------------------------
	//	Validate the Quantity
	//-------------------------------------------------------------------------------------------------
	public static boolean isValidQuantity(String aString){
		boolean result = false;
		
		try{
			//test input is a valid integer
			int aQuantity = Integer.parseInt(aString);
			
			//test input is greater than 0
			if(aQuantity > 0){
				//only then set the result of this method to true
				result = true;
			}
		}
		catch(Exception ex){
			result = false;
		}
		return result;
	}
	public static String getQuantity(String aQuantity){
		if(isValidQuantity(aQuantity) == false){
			errorMessage += "The Quantity entered: [" + aQuantity + "] is invalid! Re-Enter a Quantity of 1 or greater: \n";
		}
		return aQuantity;
	}
	//-------------------------------------------------------------------------------------------------
	//	Create method for Getter
	//-------------------------------------------------------------------------------------------------
	//method to Get and return the error message	
	public static String getError(){
		return errorMessage;
	}
	//-------------------------------------------------------------------------------------------------
	//	Create method to clear out error messages
	//-------------------------------------------------------------------------------------------------
	//method to clear the error message
	public static void clearError(){
		errorMessage = "";
	}
	
}//End of Validator class