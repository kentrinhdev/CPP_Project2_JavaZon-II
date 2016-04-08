package kvtproject2;

//Class that defines Product
public class Product {
	
	//Declare variables
	private String sku;
	private String type;
	private String description;
	private double price;
	
	//Constructor with string and double variables
	public Product(String aSku, String aType, String aDesc, double aPrice){
		sku = aSku;
		type = aType;
		description = aDesc;
		price = aPrice;
	}

	//-----------------------------------------------
	//	Getter and Setter for Sku
	//-----------------------------------------------
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	//-----------------------------------------------
	//	Getter and Setter for Type
	//-----------------------------------------------
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	//-----------------------------------------------
	//	Getter and Setter for Description
	//-----------------------------------------------
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	//-----------------------------------------------
	//	Getter and Setter for Price
	//-----------------------------------------------
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}//End Product class