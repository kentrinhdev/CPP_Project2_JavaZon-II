package kvtproject2;
//Import Java utility for ArrayLists
import java.util.ArrayList;

//Class that defines an order
public class Order {
	//Declare class variables
	private Customer orderCustomer;
	private Clerk orderClerk;
	private Product[] orderProduct;
	private int[] orderQuantity;
	
	//Declare class variable for orderID
	private String orderID;
	String orderDescription;
	//Declare class variable for an ArrayList called lineItems
	private ArrayList<LineItem>lineItems;	
	//Define constant rate for tax
	private static double TAX_RATE = 0.0825;
	//Keep track of how many products were added
	private int productCount;
	
	//Declare class variables to store totals
	double subtotal;
	double tax;
	double total;
	
	//Constructor with a String variable called anID
	public Order(String anID){
		orderProduct = new Product[1];
		orderQuantity = new int[1];
		
		//Pass to public variables
		lineItems = new ArrayList<LineItem>();	
		orderID = anID;
		//Initialize variables with zero value
		subtotal = 0;
		tax = 0;
		total =0;
	}
	
	//Getter to get order ID
	public String getOrderID(){
		return orderID;
	}
	
	//Setter to assign OrderID
	public void setOrderID(String anID){
		//Pass value to variable called orderID
		orderID = anID;
	}
	//Setter to assign customer
	public void setOrderCustomer(Customer aCustomer){
		orderCustomer = aCustomer;
	}
	//Setter to assign clerk
	public void setOrderClerk(Clerk aClerk){
		orderClerk = aClerk;
	}
	
	public void setOrderProduct(Product aProduct, int aQty){		
		//TODO 
		//Write the code to create a new line item
		//based on the variables aProduct and aQty that are passed
		//add that line item to the LineItems arraylist
		productCount++;
		LineItem lineItem = new LineItem(aProduct, aQty);
	    lineItems.add(lineItem);
	}	
	public void calcSubtotal(){
		//FOR LOOP through LineItem arrayList
		for (LineItem li : lineItems){
			//Get the Quantity and Price from the LineItem class
			// multiply the Quantity and Price
			// store it in variable called subtotal
			subtotal +=  li.getJvzQuantity() * li.getJvzProduct().getPrice(); 
		}//End FOR LOOP
	}
	
	public void calcTax(){
		//Calculate tax by multiplying subtotal and TAX_RATE
		// then store it in variable called tax
		tax = subtotal * TAX_RATE;
	}
	
	public void calcTotal(){
		//Calculate the total by adding the subtotal and tax
		// then store it in a variable called total
		total = subtotal + tax;
	}
	
	/*
	public String toString(){
		// NumberFormat object creation as well as GUI variables declared.
		NumberFormat nf =  NumberFormat.getCurrencyInstance();
		
		String result = "blank";
		//-------------------------------------------------------------------------------------------------
		//	Cashier Information
		//-------------------------------------------------------------------------------------------------	
		result += "CASHIER @ REGISTER\n " + orderClerk.getFirstName() + " " + orderClerk.getLastName() +" @ " + orderClerk.getRegisterNbr() + "\n\n";
		//-------------------------------------------------------------------------------------------------
		//	OrderID Information
		//-------------------------------------------------------------------------------------------------	
		result += "Order # " + orderID + "\n\n";
		//-------------------------------------------------------------------------------------------------
		//	Customer Information
		//-------------------------------------------------------------------------------------------------	
		result += "CUSTOMER INFORMATION\n" + orderCustomer.toString() + "\n";
		//-------------------------------------------------------------------------------------------------
		//	Itemized list of all items purchased
		//-------------------------------------------------------------------------------------------------	
		result += "NUMBER OF ITEMS SOLD = " + getNumberItemsSold(0) + "\n\n";
		
		//FOR LOOP
		for (LineItem li : lineItems){
			result += li.getJvzQuantity() + "  @  " + nf.format(li.getJvzProduct().getPrice()) + " = " + nf.format(li.getJvzQuantity() * li.getJvzProduct().getPrice()) + "\n";
			result += "    "  + li.getJvzProduct().getDescription() + "\n\n";
		}//End FOR LOOP
		//-------------------------------------------------------------------------------------------------
		//	TOTALS for the Compiled Receipt
		//-------------------------------------------------------------------------------------------------	
		result += "TOTALS\n";
		result += "\t\t\tSubtotal: " + nf.format(subtotal) + "\n";
		result += "\t\t\tTax: " + nf.format(tax) + "\n";
		result += "\t\t\tTotal: " + nf.format(total) + "\n";
		
		return result;
	} 
	*/
	
	//Returns the number of items sold Quantity amounts for each line item
	public String getNumberItemsSold(int iLine){
		String totalQty = "";
		LineItem selectedItem = lineItems.get(iLine);
		totalQty = Integer.toString(selectedItem.getJvzQuantity());		
		return totalQty;
	}
	//Returns the total
	public double getTotal(){
		return total;
	}
	//Returns the customer
	public Customer getCustomer(){
		return orderCustomer;
	}
	//Returns the LineTotal from the LineItem class
	public double getLineTotal(int iLine){
		//Select the LineItem from the ArrayList
		LineItem selectedItem = lineItems.get(iLine);
		//Get the total for that item
		return selectedItem.getJvzLineTotal();
	}
	//Returns the OrderDescription from the LineItem class
	public String getOrderDescription(int iLine){
		//Select the LineItem from the ArrayList
		LineItem selectedItem = lineItems.get(iLine);
		orderDescription = selectedItem.getJvzOrderDescription();
		//Get the product description for the order		
		return orderDescription;
	}
	
}//End of Order class