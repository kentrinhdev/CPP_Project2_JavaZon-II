package kvtproject2;
//Import ArrayList utility
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
//Import Java text formatting
import java.text.NumberFormat;

import javax.swing.JOptionPane;

//Class that defines the JavaZon
public class JavaZon {

	//Arraylist to hold all the clerks
	private ArrayList<Clerk>clerksList;
	
	//Hashmap to hold orders the key pair value consists of (OrderID, Order Object)
	// OrderID is a String
	private HashMap<String,Order>jvzOrder;		
	
	//Constructor for JavaZon
	public JavaZon(){
		//initialize the Clerk ArrayList called clerksList
		clerksList = new ArrayList<Clerk>();
		//initialize the Orders Hash Map called jvzOrder
		jvzOrder = new HashMap<String,Order>();
		//load clerks
		loadClerkList();
	}
	//Method to add order
	public void addOrder(Order anOrder){
		//TODO: Code to add an order to the HashMap
		//USE THE jvzOrder object and add a new order to the hashmap
		//you need to use the orderid and the order object (anOrder)
		//The order id value is located in the order object
		this.jvzOrder.put(anOrder.getOrderID(), anOrder);
	}
	//Method to process order
	public void processOrder(String anID){
		Order selectedOrder = jvzOrder.get(anID);
		
		selectedOrder.calcSubtotal();
		selectedOrder.calcTax();
		selectedOrder.calcTotal();
	}
	
	//Method to load the clerk list
	public void loadClerkList(){
		
		Clerk musicClerk = new Clerk("EMP100",1, "Homer", "Simpson","243 North Main", "Spingfield", "CA", "98765", "909-987-6666");
		Clerk bookClerk = new Clerk("EMP200", 2,"Bart", "Simpson","454 North Euclid", "Spingfield", "CA", "98765", "909-987-4444");
		Clerk gameClerk = new Clerk("EMP300",3, "Lisa", "Simpson","767 North Holt", "Spingfield", "CA", "98765", "909-987-3333");
		
		clerksList.add(musicClerk);
		clerksList.add(bookClerk);
		clerksList.add(gameClerk);
	}
	//Method to set the clerk
	public void setClerk(String anID){
		Random rand = new Random();
		int i = rand.nextInt(3);
		
		Order selectedOrder = jvzOrder.get(anID);
		selectedOrder.setOrderClerk(clerksList.get(i));
	}
	
	public String getReceipt(String anID){
		String result;
		
		Order selectedOrder = jvzOrder.get(anID);
		
		result = "JAVAZON WHOLESALE STORE\n\n";
		result += "90404 CENTRAL AVE\n";
		result += "MONTCLAIR, CA, 91763\n";
		result += "  (909)345-9876\n\n";
		
		result += selectedOrder.toString();
		
		return result;
	}
	
	public String getOrdersSummary(){
		
		Order selectedOrder;
		Customer selectedCustomer;
		String orderID, firstName, lastName;
		double orderTotal;
		String result = "";
		//NumberFormat object creation as well as GUI variables declared
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		//TODO 
		//For Loop through the orders in the HashMap
		//Retrieve each order and store it in the selectedOrder object
		//retrieve the customer using the getCustomer method of the selectedOrder
		//Store the customer in the selectedCustomer object
		//retrieve the customer first/last name from the selectCustomer Object
		//retrieve the order total from the selectedOrder object
		//return a String result that has all the orders in the HashMap
		//See screen printout for an example of what the result should look like
		for(String anOrder : jvzOrder.keySet()) {
			//Get order information
			selectedOrder = jvzOrder.get(anOrder);
			orderID = selectedOrder.getOrderID();
			orderTotal = selectedOrder.getTotal();
			//Get customer information
			selectedCustomer = selectedOrder.getCustomer();
			firstName = selectedCustomer.getFirstName();
			lastName = selectedCustomer.getLastName();
			
			//Output message with order details
			/*
			JOptionPane.showMessageDialog(null,"Order ID: [" + orderID + "], Customer First and Last Name: [" + firstName 
					+ " " + lastName + "], Order Total: " + nf.format(orderTotal));
			*/
			result += "Order ID: [" + orderID + "], Customer First and Last Name: [" + firstName 
						+ " " + lastName + "], Order Total: " + nf.format(orderTotal) + "\r\n";
			//Set result back to null
			//result = null;
		}
		return result;
	}//End of getOrderSummary method
	
	//Method to delete order
	public String deleteOrder(String anID){
		
		String result = "";
		
		//TODO 
		//check if the HashMap contains the order
		//If it does then remove that order from the hashMap
		//Return a message that displays the OrderID has been
		//Deleted Or not found
		//put the result from the delete into the string result
		for (int i = 0; i < jvzOrder.size(); i++){
			if(jvzOrder.containsKey(anID)){
				jvzOrder.remove(anID);
				result = "The Order ID [" + anID + "] has been deleted!";	
			}
			else{
			    result = "Not able to delete. The Order ID [" + anID + "] was not found!";
			}
		}
		return result;
	}//End of deleteOrder method
	
	//Method to find order
	public Order findOrder(String anID){
		
		String result = "";
		Order selectedOrder = null;
		
		//TODO 
		//check if the HashMap contains the order
		//If it does then store the order in selectedOrder and return selectedOrder
		//If the order is not found then return a null
		/////// boolean orderExists = jvzOrder.containsValue(anID);
		for (int i = 0; i < jvzOrder.size(); i++){
			if(jvzOrder.containsKey(anID)){
				//selectedOrder = jvzOrder.get(findOrder(anID));
				selectedOrder = jvzOrder.getOrDefault(anID, selectedOrder);
				result = "The Order ID [" + anID + "] has been found!";	
			}
			else{
			selectedOrder = null;
			result = "Not able to find. The Order ID [" + anID + "] was not found!";
			}
		}
		return selectedOrder;
	}//End of findOrder method
	
	//Method to clear orders
	public void clearOrders(){
		//TODO 
		//Clear the Hash Map of all orders
		jvzOrder.clear();
	}//End of findOrder method
	
}//End of JavaZon class