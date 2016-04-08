package kvtproject2;

//Class that defines the LineItem
public class LineItem {
	//Declare class variables
	private Product jvzProduct;
	private int jvzQuantity;
	
	//Constructor with parameters variables
	public LineItem(Product aProduct, int aQuantity){
		jvzProduct = aProduct;
		jvzQuantity = aQuantity;
	}
	//-----------------------------------------------
	//	Getter and Setter for Product
	//-----------------------------------------------
	public Product getJvzProduct(){
		//TODO 
		//Write the code necessary for this method
		return jvzProduct;
	}
	public void setJvzProduct(Product jvzProduct){
		//TODO 
		//Write the code necessary for this method
		this.jvzProduct = jvzProduct;
	}
	//-----------------------------------------------
	//	Getter and Setter for Quantity
	//-----------------------------------------------
	public int getJvzQuantity(){
		//TODO 
		//Write the code necessary for this method
		return jvzQuantity;
	}
	public void setJvzQuantity(int jvzQuantity) {
		//TODO 
		//Write the code necessary for this method
		this.jvzQuantity = jvzQuantity;
	}
	//-----------------------------------------------
	//	Getter for LineTotal
	//-----------------------------------------------
	public double getJvzLineTotal(){
		double total = jvzQuantity * jvzProduct.getPrice();
		return total;
	}
	//-----------------------------------------------
	//	Getter for OrderDescription
	//-----------------------------------------------
	public String getJvzOrderDescription(){
		String orderDescription = jvzProduct.getDescription();
		return orderDescription;
	}
	
}//End of LineItem class