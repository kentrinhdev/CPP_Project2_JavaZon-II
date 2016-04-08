package kvtproject2;
//Import Java text formatting
import java.text.NumberFormat;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.io.*;

//Class that defines the JavaZonFrame that inherits from JFrame and
// then interfaces with ActionListener and ItemListener
public class JavaZonFrame extends javax.swing.JFrame implements ActionListener, ItemListener {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Declare variables
	private JPanel jPanel1;
	private Menu menu;
	private JavaZon jz;
	private LineItem iLine;
	//---------------------------------------------------------------------------------
	//Rows 1, 2, 3, 4
	//---------------------------------------------------------------------------------
	private JLabel lblTitle,lblOrderID,lblFirstName,lblLastName,lblMemberShip,lblPhone;
	private JTextField txtOrderID,txtFirstName,txtLastName,txtMemberShip,txtPhone;
	//---------------------------------------------------------------------------------
	//Rows 5, 6
	//---------------------------------------------------------------------------------
	private JLabel lblStreet,lblCity,lblState,lblZip;
	private JTextField txtStreet,txtCity,txtState,txtZip;
	//---------------------------------------------------------------------------------
	//Row 7
	//---------------------------------------------------------------------------------
	private JLabel lblProduct,lblQty,lblPrice,lblLineTotal;
	private JComboBox cboItem1,cboItem2,cboItem3;
	private JTextField txtQty1,txtQty2,txtQty3;
	private JTextField txtPrice1,txtPrice2,txtPrice3;
	private JTextField txtLineTotal1,txtLineTotal2,txtLineTotal3;
	//---------------------------------------------------------------------------------
	//Rows 11, 12, 13
	//---------------------------------------------------------------------------------
	private JLabel lblSubtotal,lblTax,lblTotal;
	private JTextField txtSubtotal,txtTax,txtTotal;
	//---------------------------------------------------------------------------------
	//Row 14
	//---------------------------------------------------------------------------------
	private JButton btnAdd,btnDelete,btnFind,btnList,btnClear,btnReset,btnUpdate;
	//---------------------------------------------------------------------------------
	//Row 15
	//---------------------------------------------------------------------------------
	private JLabel lblFileOptions;
	private JButton btnImport;
	private JButton btnExport;
	private JButton btnExit;
	
	//Constructor for JavaZonFrame
	public JavaZonFrame(){		
		//Try and catch method
		try {
			//Instantiate new instance of GridLayout object called thisLayout
			GridLayout thisLayout = new GridLayout(1,1);
			//Set number of columns
			thisLayout.setColumns(1);
			//Set horizontal and vertical gaps
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
			jz = new JavaZon();
			menu = new Menu();
			//String menuItems[] = menu.getMenuDescriptions();
			iLine = new LineItem(null, getDefaultCloseOperation());
			
			//Set the layout for the objects to be placed into the panel
			getContentPane().setLayout(thisLayout);
			//Set up panel by creating a new JPanel object
			jPanel1 = new JPanel();
			getContentPane().add(jPanel1);
			GridBagLayout jPanel1Layout = new GridBagLayout();
			jPanel1Layout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1};
			jPanel1Layout.rowHeights = new int[] {20, 20, 7, 7, 7, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 7, 20, 20};
			jPanel1Layout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1};
			jPanel1Layout.columnWidths = new int[] {20, 7, 7, 7, 7, 20, 20, 20, 20};
			
			jPanel1.setLayout(jPanel1Layout);
			jPanel1.setPreferredSize(new java.awt.Dimension(499, 426));
			
			//----------------------------------------------------------------------------------
			//Label for the header title of the application
			//----------------------------------------------------------------------------------
			lblTitle = new JLabel();
			jPanel1.add(lblTitle, new GridBagConstraints(2, 1, 3, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			lblTitle.setText("Welcome to JAVAZON II");
			//----------------------------------------------------------------------------------
			//Top of the form
			//----------------------------------------------------------------------------------
			//Label and Text field for Order ID
			//----------------------------------------------------------------------------------
			lblOrderID = new JLabel();
			jPanel1.add(lblOrderID, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblOrderID.setText("Order ID:");

			txtOrderID = new JTextField();
			jPanel1.add(txtOrderID, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtOrderID.setPreferredSize(new java.awt.Dimension(110, 24));
			//----------------------------------------------------------------------------------
			//Label and Text field for First Name
			//----------------------------------------------------------------------------------
			lblFirstName = new JLabel();
			jPanel1.add(lblFirstName, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblFirstName.setText("First Name:");
			
			txtFirstName = new JTextField();
			jPanel1.add(txtFirstName, new GridBagConstraints(2, 3, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtFirstName.setPreferredSize(new java.awt.Dimension(175, 24));
			//----------------------------------------------------------------------------------
			//Label and Text field for Last Name
			//----------------------------------------------------------------------------------
			lblLastName = new JLabel();
			jPanel1.add(lblLastName, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblLastName.setText("Last Name:");
			
			txtLastName = new JTextField();
			jPanel1.add(txtLastName, new GridBagConstraints(5, 3, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtLastName.setPreferredSize(new java.awt.Dimension(175, 24));
			//----------------------------------------------------------------------------------
			//Label and Text field for MemberShip
			//----------------------------------------------------------------------------------
			lblMemberShip = new JLabel();
			jPanel1.add(lblMemberShip, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblMemberShip.setText("MemberShip:");
			
			txtMemberShip = new JTextField();
			jPanel1.add(txtMemberShip, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtMemberShip.setPreferredSize(new java.awt.Dimension(110, 24));
			//----------------------------------------------------------------------------------
			//Label and Text field for Phone
			//----------------------------------------------------------------------------------			
			lblPhone = new JLabel();
			jPanel1.add(lblPhone, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblPhone.setText("Phone:");
			
			txtPhone = new JTextField();
			jPanel1.add(txtPhone, new GridBagConstraints(5, 4, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtPhone.setPreferredSize(new java.awt.Dimension(175, 24));
			//----------------------------------------------------------------------------------
			//Label and Text field for Street
			//----------------------------------------------------------------------------------
			lblStreet = new JLabel();
			jPanel1.add(lblStreet, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblStreet.setText("Street:");
			
			txtStreet = new JTextField();
			jPanel1.add(txtStreet, new GridBagConstraints(2, 5, 2, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtStreet.setPreferredSize(new java.awt.Dimension(175, 24));			
			//----------------------------------------------------------------------------------
			//Label and Text field for City
			//----------------------------------------------------------------------------------
			lblCity = new JLabel();
			jPanel1.add(lblCity, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblCity.setText("City:");
			
			txtCity = new JTextField();
			jPanel1.add(txtCity, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtCity.setPreferredSize(new java.awt.Dimension(110, 24));
			//----------------------------------------------------------------------------------
			//Label and Text field for State
			//----------------------------------------------------------------------------------
			lblState = new JLabel();
			jPanel1.add(lblState, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblState.setText("State:");
			
			txtState = new JTextField();
			jPanel1.add(txtState, new GridBagConstraints(4, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtState.setPreferredSize(new java.awt.Dimension(110, 24));
			//----------------------------------------------------------------------------------
			//Label and Text field for Zip
			//----------------------------------------------------------------------------------
			lblZip = new JLabel();
			jPanel1.add(lblZip, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblZip.setText("Zip:");
			
			txtZip = new JTextField();
			jPanel1.add(txtZip, new GridBagConstraints(6, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtZip.setPreferredSize(new java.awt.Dimension(110, 24));
			//----------------------------------------------------------------------------------
			//Label and Combo Boxes for Product
			//----------------------------------------------------------------------------------
			lblProduct = new JLabel();
			jPanel1.add(lblProduct, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblProduct.setText("Product:");
			
			cboItem1 = new JComboBox(menu.getMenuDescriptions());
			jPanel1.add(cboItem1, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			cboItem1.setPreferredSize(new java.awt.Dimension(110, 24));
			
			cboItem2 = new JComboBox(menu.getMenuDescriptions());
			jPanel1.add(cboItem2, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			cboItem2.setPreferredSize(new java.awt.Dimension(110, 24));
			
			cboItem3 = new JComboBox(menu.getMenuDescriptions());
			jPanel1.add(cboItem3, new GridBagConstraints(2, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			cboItem3.setPreferredSize(new java.awt.Dimension(110, 24));
			//----------------------------------------------------------------------------------
			//Label and Text fields for Quantity
			//----------------------------------------------------------------------------------
			lblQty = new JLabel();
			jPanel1.add(lblQty, new GridBagConstraints(3, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblQty.setText("Quantity:");
			
			txtQty1 = new JTextField();
			jPanel1.add(txtQty1, new GridBagConstraints(3, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtQty1.setPreferredSize(new java.awt.Dimension(110, 24));			
			
			txtQty2 = new JTextField();
			jPanel1.add(txtQty2, new GridBagConstraints(3, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtQty2.setPreferredSize(new java.awt.Dimension(110, 24));	
			
			txtQty3 = new JTextField();
			jPanel1.add(txtQty3, new GridBagConstraints(3, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtQty3.setPreferredSize(new java.awt.Dimension(110, 24));	
			//----------------------------------------------------------------------------------
			//Label and Text fields for Price
			//----------------------------------------------------------------------------------
			lblPrice = new JLabel();
			jPanel1.add(lblPrice, new GridBagConstraints(4, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblPrice.setText("Price:");
			
			txtPrice1 = new JTextField();
			jPanel1.add(txtPrice1, new GridBagConstraints(4, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtPrice1.setPreferredSize(new java.awt.Dimension(110, 24));			
			
			txtPrice2 = new JTextField();
			jPanel1.add(txtPrice2, new GridBagConstraints(4, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtPrice2.setPreferredSize(new java.awt.Dimension(110, 24));	
			
			txtPrice3 = new JTextField();
			jPanel1.add(txtPrice3, new GridBagConstraints(4, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtPrice3.setPreferredSize(new java.awt.Dimension(110, 24));	
			//----------------------------------------------------------------------------------
			//Label and Text fields for Line Total
			//----------------------------------------------------------------------------------
			lblLineTotal = new JLabel();
			jPanel1.add(lblLineTotal, new GridBagConstraints(5, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblLineTotal.setText("Line Total:");
			
			txtLineTotal1 = new JTextField();
			jPanel1.add(txtLineTotal1, new GridBagConstraints(5, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtLineTotal1.setPreferredSize(new java.awt.Dimension(110, 24));			
			
			txtLineTotal2 = new JTextField();
			jPanel1.add(txtLineTotal2, new GridBagConstraints(5, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtLineTotal2.setPreferredSize(new java.awt.Dimension(110, 24));	
			
			txtLineTotal3 = new JTextField();
			jPanel1.add(txtLineTotal3, new GridBagConstraints(5, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtLineTotal3.setPreferredSize(new java.awt.Dimension(110, 24));	
			//----------------------------------------------------------------------------------
			//Label and Text field for Subtotal
			//----------------------------------------------------------------------------------			
			lblSubtotal = new JLabel();
			jPanel1.add(lblSubtotal, new GridBagConstraints(4, 11, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblSubtotal.setText("Subtotal:");
			
			txtSubtotal = new JTextField();
			jPanel1.add(txtSubtotal, new GridBagConstraints(5, 11, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtSubtotal.setPreferredSize(new java.awt.Dimension(110, 24));
			//----------------------------------------------------------------------------------
			//Label and Text field for Tax
			//----------------------------------------------------------------------------------			
			lblTax = new JLabel();
			jPanel1.add(lblTax, new GridBagConstraints(4, 12, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblTax.setText("Tax:");
			
			txtTax = new JTextField();
			jPanel1.add(txtTax, new GridBagConstraints(5, 12, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtTax.setPreferredSize(new java.awt.Dimension(110, 24));			
			//----------------------------------------------------------------------------------
			//Label and Text field for Total
			//----------------------------------------------------------------------------------			
			lblTotal = new JLabel();
			jPanel1.add(lblTotal, new GridBagConstraints(4, 13, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblTotal.setText("Total:");
			
			txtTotal = new JTextField();
			jPanel1.add(txtTotal, new GridBagConstraints(5, 13, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			txtTotal.setPreferredSize(new java.awt.Dimension(110, 24));				
			//----------------------------------------------------------------------------------
			//Buttons at the bottom of the form
			//----------------------------------------------------------------------------------
			btnAdd = new JButton();
			jPanel1.add(btnAdd, new GridBagConstraints(1, 14, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnAdd.setText("Add");
			btnAdd.addActionListener(this);
			
			btnDelete = new JButton();
			jPanel1.add(btnDelete, new GridBagConstraints(2, 14, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnDelete.setText("Delete");
			btnDelete.addActionListener(this);
	
			btnFind = new JButton();
			jPanel1.add(btnFind, new GridBagConstraints(3, 14, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnFind.setText("Find");
			btnFind.addActionListener(this);
		
			btnList = new JButton();
			jPanel1.add(btnList, new GridBagConstraints(4, 14, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnList.setText("List");
			btnList.addActionListener(this);
		
			btnClear = new JButton();
			jPanel1.add(btnClear, new GridBagConstraints(5, 14, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnClear.setText("Clear");
			btnClear.addActionListener(this);
		
			btnReset = new JButton();
			jPanel1.add(btnReset, new GridBagConstraints(6, 14, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnReset.setText("Reset");
			btnReset.addActionListener(this);
			
			btnUpdate = new JButton();
			jPanel1.add(btnUpdate, new GridBagConstraints(7, 14, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnUpdate.setText("Update");
			btnUpdate.addActionListener(this);
			//----------------------------------------------------------------------------------
			//Label for File Options
			//----------------------------------------------------------------------------------
			lblFileOptions = new JLabel();
			jPanel1.add(lblFileOptions, new GridBagConstraints(3, 15, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
			lblFileOptions.setText("File Options");
			//----------------------------------------------------------------------------------
			//Button for Import
			//----------------------------------------------------------------------------------
			btnImport = new JButton();
			jPanel1.add(btnImport, new GridBagConstraints(4, 15, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnImport.setText("Import");
			btnImport.addActionListener(this);
			//----------------------------------------------------------------------------------
			//Button for Export
			//----------------------------------------------------------------------------------
			btnExport = new JButton();
			jPanel1.add(btnExport, new GridBagConstraints(5, 15, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnExport.setText("Export");
			btnExport.addActionListener(this);
			//----------------------------------------------------------------------------------
			//Button to Exit the application
			//----------------------------------------------------------------------------------
			btnExit = new JButton();
			jPanel1.add(btnExit, new GridBagConstraints(7, 16, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
			btnExit.setText("Exit");
			btnExit.addActionListener(this);
			
			//TODO ADD THE REST OF THE CONTROLS
			//REFER TO HANDOUT FOR THE CONTROLS NEEDED
			//AND THE LOCATION OF EACH ITEM
			pack();
			this.setSize(600, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//End of JavaZonFrame constructor
	
	//Responses to any actions
	public void actionPerformed(ActionEvent e) {
		
		//based on the object that triggered the event
		// call the appropriate method
		Object o = e.getSource();
		
		//If Add button is clicked Call addOrder
	    if (o == this.btnAdd) {
	    	addOrder();
		}
	    //If Delete button is clicked Call deleteOrder
	    else if (o == this.btnDelete) {
		    deleteOrder();
	    }
	    //If Find button is clicked Call findOrder
	    else if (o == this.btnFind) {
		    findOrder();
		} 
	    //If List button is clicked Call listOrders
		else if (o == this.btnList) {
		    listOrders();
		}
		//If Clear button is clicked Call clearOrders
		else if (o == this.btnClear) {
		    clearOrders();
		} 
	    //If Reset button is clicked Call resetForm
		else if (o == this.btnReset) {
		    resetForm();
		}
	    //If Update button is clicked Call updateOrder
		else if (o == this.btnUpdate) {
		    updateOrder();
		}
	    //If Import button is clicked Call importOrder
		else if (o == this.btnImport) {
			importOrder();
		}
	    //If Export button is clicked Call exportOrder
	    else if (o == this.btnExport) {
	      	try {
				exportOrder();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    //If Exit button is clicked Call exitApp
	    else if (o == this.btnExit) {
	      	exitApp();
	    } 
	}//End actionPerformed method
	
	//Return prices based on which combo box item is selected
	public void itemStateChanged(ItemEvent e) {
		//example of method to display the price of the product
		//based on what item was selected
		
		//TODO add code to display the price 
		//for the other combo boxes and text fields for the line item price
		Object o = e.getSource();
		if (o == cboItem1){
			if(cboItem1.getSelectedIndex() != -1)
				txtPrice1.setText(menu.getPrice(cboItem1.getSelectedIndex()));
		}else if (o == cboItem2) {
			if (cboItem2.getSelectedIndex() != -1)
		          txtPrice2.setText(menu.getPrice(cboItem2.getSelectedIndex()));
		}else if (o == cboItem3) {
		    if (cboItem3.getSelectedIndex() != -1)
		          txtPrice3.setText(menu.getPrice(cboItem3.getSelectedIndex()));
		}
	}//End of itemStateChanged method
	
	private void addOrder(){
		// NumberFormat object creation as well as GUI variables declared.
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		//Clear errors
		//	before we start processing we clear any errors
		Validator.clearError();
		
		//CREATE VARIABLES TO HOLD INPUT
		//TODO
		//PASS THE INPUT TO THE VALIDATOR\
		//THE ONLY VALIDATION IN THIS PROJECT
		//IS THAT STRING VALUES ARE NOT BLANK
		//AND NUMERICAL VALUES ARE THE CORRECT TYPE
		//FOR EXAMPLE QUANTITY SHOULD BE INTEGER
		//PRICE SHOULD BE DOUBLE
		//EVERYTHING ELSE IS OK
		
		//Validate Order ID and First Name fields
		//add the other variables to hold your values from the validator in here
		//see below what variables you will need to create a customer object and an order object
		//Validate Last Name, Street, City, State, Zip, Phone, and Membership fields
		String orderID = Validator.getOrderID(txtOrderID.getText());
		String firstName = Validator.getFirstName(txtFirstName.getText());
		String lastName = Validator.getLastName(txtLastName.getText());
		String membership = Validator.getMemberShip(txtMemberShip.getText());
		String phone = Validator.getPhone(txtPhone.getText());
	    String street = Validator.getStreet(txtStreet.getText());
	    String city = Validator.getCity(txtCity.getText());
	    String state = Validator.getState(txtState.getText());
	    String zip = Validator.getZip(txtZip.getText());
		
	    //Validate combo boxes
		//Example of how to validate the combobox from the validator
		//After you create the validation method called getQuantity in the validator
		//uncomment the Validator.getQuantity... line
		//do the same thing for the other 2 comboboxes
		if(this.cboItem1.getSelectedIndex() != -1){
			Validator.getQuantity(txtQty1.getText());
		}
	    if (this.cboItem2.getSelectedIndex() != -1) {
	        Validator.getQuantity(txtQty2.getText());
	    }
	    if (this.cboItem3.getSelectedIndex() != -1) {
	        Validator.getQuantity(txtQty3.getText());
	    }
		if(this.cboItem1.getSelectedIndex() != -1){
			txtPrice1.getText();
		}
		if(this.cboItem2.getSelectedIndex() != -1){
			txtPrice2.getText();
		}
		if(this.cboItem3.getSelectedIndex() != -1){
			txtPrice3.getText();
		}
		
	    //Validate errors found, alert user, then stop
		//if there are errors then display them to the user
		//otherwise start creating the objects for the order
		if (Validator.getError().length() != 0){
			JOptionPane.showMessageDialog(null, "An Error Occured:\n\n" + Validator.getError());
		}
		else{
			//No errors found
			Customer customer = new Customer(firstName, lastName, street, city,state, zip, phone, membership);
			
			Order order = new Order(orderID);
			order.setOrderCustomer(customer);	
			
			//Get the price of each item selected
			if(this.cboItem1.getSelectedIndex() != -1){
				int i = cboItem1.getSelectedIndex();
				this.txtPrice1.setText(menu.getPrice(i));
			}
			if(this.cboItem2.getSelectedIndex() != -1){
				int i = cboItem2.getSelectedIndex();
				this.txtPrice2.setText(menu.getPrice(i));
			}
			if(this.cboItem3.getSelectedIndex() != -1){
				int i = cboItem3.getSelectedIndex();
				this.txtPrice3.setText(menu.getPrice(i));
			}
			
			//Get the LineTotal : cboItem1 provided as an example
			//do the same for the other 2 comboboxes
			if(this.cboItem1.getSelectedIndex() != -1){
				Product product1 = menu.getMenu()[this.cboItem1.getSelectedIndex()];
				order.setOrderProduct(product1, Integer.parseInt(txtQty1.getText()));
				this.txtLineTotal1.setText(nf.format(order.getLineTotal(0)));
			}
			
		    if (this.cboItem2.getSelectedIndex() != -1) {
		        Product product2 = menu.getMenu()[this.cboItem2.getSelectedIndex()];
		        order.setOrderProduct(product2, Integer.parseInt(txtQty2.getText()));
		        this.txtLineTotal2.setText(nf.format(order.getLineTotal(1)));
		    }

		    if (this.cboItem3.getSelectedIndex() != -1) {
		        Product product3 = menu.getMenu()[this.cboItem3.getSelectedIndex()];
		        order.setOrderProduct(product3, Integer.parseInt(txtQty3.getText()));
		        this.txtLineTotal3.setText(nf.format(order.getLineTotal(2)));
		    }
			
			jz.addOrder(order);
			jz.setClerk(orderID);
			jz.processOrder(orderID);
			
			//TODO
			//INSTEAD OF GET RECEIPT YOU NEED TO CREATE METHODS THAT
			//WILL RETURN INDIVIDUAL VALUES
			//FOR EACH LINE ITEM RETRIEVE THE TOTALS
			//FOR THE WHOLE ORDER RETRIEVE THE SUBTOTAL, TAX, TOTAL
			//DISPLAY THESE RESULTS IN THE APPROPRIATE BOXES INSTEAD OF THE JOPTIONPANE BOX
		    txtSubtotal.setText(nf.format(order.subtotal));
		    txtTax.setText(nf.format(order.tax));
		    txtTotal.setText(nf.format(order.total));
			
			//JOptionPane.showMessageDialog(null, jz.getReceipt(orderID));
			JOptionPane.showMessageDialog(null,"Order ID: [" + orderID + "] was added and saved!");
		}
		
		//ADD code here to reset the form to a blank state
		if (Validator.getError().length() == 0){
			for (java.awt.Component c : this.jPanel1.getComponents()) {
		        if (c instanceof JTextField) {
		          JTextField tx = (JTextField) c;
		          tx.setText("");
		        } else if (c instanceof JComboBox) {
		          try {
		            JComboBox cb = (JComboBox) c;
		            cb.setSelectedIndex(-1);
		          }catch (Exception ex) {
		        }
		      }
			
			txtOrderID.setText("");
			txtFirstName.setText("");
			txtLastName.setText("");
			
			try{
				this.cboItem1.setSelectedIndex(-1);
				this.cboItem2.setSelectedIndex(-1);
				this.cboItem3.setSelectedIndex(-1);
			}catch(Exception ex){
				//ignore error
			}
		  }
		}
	}//End of addOrder method
	
	//Delete an order
	private  void deleteOrder(){
		String orderID = JOptionPane.showInputDialog("Enter Order ID to Delete a particular order");
		if(orderID == null){
			JOptionPane.showMessageDialog(null,"Order ID cannot be blank!");
		}
		else{
			jz.deleteOrder(orderID);
			JOptionPane.showMessageDialog(null,"Order ID: [" + orderID + "] has been deleted!");
		}
		
		//ADD code here to reset the form to a blank state
		if (Validator.getError().length() == 0){
			for (java.awt.Component c : this.jPanel1.getComponents()) {
		        if (c instanceof JTextField) {
		          JTextField tx = (JTextField) c;
		          tx.setText("");
		        } else if (c instanceof JComboBox) {
		          try {
		            JComboBox cb = (JComboBox) c;
		            cb.setSelectedIndex(-1);
		          }catch (Exception ex) {
		        }
		      }
			
			txtOrderID.setText("");
			txtFirstName.setText("");
			txtLastName.setText("");
			
			try{
				this.cboItem1.setSelectedIndex(-1);
				this.cboItem2.setSelectedIndex(-1);
				this.cboItem3.setSelectedIndex(-1);
			}catch(Exception ex){
				//ignore error
			}
		  }
		}
	}//End of deleteOrder method
	
	//Method to find orders
	private  void findOrder(){
		
		//NumberFormat object creation as well as GUI variables declared
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		//TODO
		//Fill the screen with the order that was retrieved
		//All the fields should be blanked out and filled with the values from the new order
		String orderID = JOptionPane.showInputDialog("Enter Order ID to Find a particular order");
		Order foundOrder = jz.findOrder(orderID);
		
		if (foundOrder != null){
			Customer foundCustomer = foundOrder.getCustomer();
			
			txtOrderID.setText(foundOrder.getOrderID());
			txtFirstName.setText(foundCustomer.getFirstName());
			txtLastName.setText(foundCustomer.getLastName());
			txtMemberShip.setText(foundCustomer.memberShipID);
			txtStreet.setText(foundCustomer.getAddress());
			txtCity.setText(foundCustomer.getCity());
			txtState.setText(foundCustomer.getState());
			txtZip.setText(foundCustomer.getZip());
			txtPhone.setText(foundCustomer.getPhone());
			txtSubtotal.setText(nf.format(foundOrder.subtotal));
			txtTotal.setText(nf.format(foundOrder.total));
			txtTax.setText(nf.format(foundOrder.tax));
		    txtLineTotal1.setText(nf.format(foundOrder.getLineTotal(0)));
		    txtLineTotal2.setText(nf.format(foundOrder.getLineTotal(1)));
		    txtLineTotal3.setText(nf.format(foundOrder.getLineTotal(2)));
		    
		    //--------------------------------------------------------------------------
			// Set product drop down value from found line items to product combo boxes
			//--------------------------------------------------------------------------
		    this.cboItem1.setSelectedItem(foundOrder.getOrderDescription(0));	
		    this.cboItem2.setSelectedItem(foundOrder.getOrderDescription(1));
		    this.cboItem3.setSelectedItem(foundOrder.getOrderDescription(2));
		    //--------------------------------------------------------------------------
			// Set quantity value from found line items to quantity text fields
		    //--------------------------------------------------------------------------
		    
		    this.txtQty1.setText(foundOrder.getNumberItemsSold(0));
		    this.txtQty2.setText(foundOrder.getNumberItemsSold(1));
		    this.txtQty3.setText(foundOrder.getNumberItemsSold(2));
		    
			//--------------------------------------------------------------------------
			// Set price value from found line items to price fields
			//--------------------------------------------------------------------------
			if(this.cboItem1.getSelectedIndex() != -1){
				int i1 = cboItem1.getSelectedIndex();
				txtPrice1.setText(menu.getPrice(i1));
			}
			if(this.cboItem2.getSelectedIndex() != -1){
				int i2 = cboItem2.getSelectedIndex();
				txtPrice2.setText(menu.getPrice(i2));
		    }
			if(this.cboItem3.getSelectedIndex() != -1){
				int i3 = cboItem3.getSelectedIndex();
				txtPrice3.setText(menu.getPrice(i3));
		    }
			else {
				JOptionPane.showMessageDialog(null, "The product Price was not found!");
			}
			//--------------------------------------------------------------------------
			//
			//--------------------------------------------------------------------------
			
		} else{
				JOptionPane.showMessageDialog(null, "The Order ID: [" + orderID + "] was not found!");
			  }
	}//End of findOrder method
	
	//Method to clear orders
	private  void clearOrders(){
		//clear orders
		jz.clearOrders();
		JOptionPane.showMessageDialog(null, "Orders Cleared!");
		
		//ADD code here to reset the form to a blank state
		if (Validator.getError().length() == 0){
			for (java.awt.Component c : this.jPanel1.getComponents()) {
		        if (c instanceof JTextField) {
		          JTextField tx = (JTextField) c;
		          tx.setText("");
		        } else if (c instanceof JComboBox) {
		          try {
		            JComboBox cb = (JComboBox) c;
		            cb.setSelectedIndex(-1);
		          }catch (Exception ex) {
		        }
		      }
			
			txtOrderID.setText("");
			txtFirstName.setText("");
			txtLastName.setText("");
			
			try{
				this.cboItem1.setSelectedIndex(-1);
				this.cboItem2.setSelectedIndex(-1);
				this.cboItem3.setSelectedIndex(-1);
			}catch(Exception ex){
				//ignore error
			}
		  }
		}
	}//End of clearOrders method
	
	//Method to list orders
	private void listOrders(){
		//list summary of orders
		String result = jz.getOrdersSummary();
		//Check to make sure that the order summary does or does not have any stored summaries
		// if the order summary is empty then show message that there is nothing to list
		if (result != ""){
			JOptionPane.showMessageDialog(null,result);
		}
		else{
			JOptionPane.showMessageDialog(null, "No more orders are available to List!");
		}
	}//End of listOrders method
	
	//Method to reset the form
	public void resetForm(){
		//TODO
		//ADD code here to reset the form to a blank state
	    for (java.awt.Component c : this.jPanel1.getComponents()) {
	        if (c instanceof JTextField) {
	          JTextField tx = (JTextField) c;
	          tx.setText("");
	        } else if (c instanceof JComboBox) {
	          try {
	            JComboBox cb = (JComboBox) c;
	            cb.setSelectedIndex(-1);
	          }catch (Exception ex) {
	        }
	      }
		
		txtOrderID.setText("");
		txtFirstName.setText("");
		txtLastName.setText("");
		
		try{
			this.cboItem1.setSelectedIndex(-1);
			this.cboItem2.setSelectedIndex(-1);
			this.cboItem3.setSelectedIndex(-1);
		}catch(Exception ex){
			//ignore error
		}
	  }
	}//End of resetForm method
	
	private void updateOrder() {
		//NumberFormat object creation as well as GUI variables declared
		NumberFormat nf = NumberFormat.getCurrencyInstance();
				
		//Validate all text fields
		String orderID = Validator.getOrderID(txtOrderID.getText());
		String firstName = Validator.getFirstName(txtFirstName.getText());
		String lastName = Validator.getLastName(txtLastName.getText());
		String membership = Validator.getMemberShip(txtMemberShip.getText());
		String phone = Validator.getPhone(txtPhone.getText());
	    String street = Validator.getStreet(txtStreet.getText());
	    String city = Validator.getCity(txtCity.getText());
	    String state = Validator.getState(txtState.getText());
	    String zip = Validator.getZip(txtZip.getText());
	    
	    //Validate combo boxes
		//Example of how to validate the combobox from the validator
		//After you create the validation method called getQuantity in the validator
		if(this.cboItem1.getSelectedIndex() != -1){
			Validator.getQuantity(txtQty1.getText());
		}
	    if (this.cboItem2.getSelectedIndex() != -1) {
	        Validator.getQuantity(txtQty2.getText());
	    }
	    if (this.cboItem3.getSelectedIndex() != -1) {
	        Validator.getQuantity(txtQty3.getText());
	    }
		
	    //Validate errors found, alert user, then stop
		//if there are errors then display them to the user
		//otherwise start creating the objects for the order
		if (Validator.getError().length() != 0){
			JOptionPane.showMessageDialog(null, "An Error Occured:\n\n" + Validator.getError());
			Validator.clearError();
		}
		else{
			//Code block when there are no errors found
			Customer customer = new Customer(firstName, lastName, street, city,state, zip, phone, membership);
			
			Order order = new Order(orderID);
			order.setOrderCustomer(customer);	
			
			//Get the LineTotal
			if(this.cboItem1.getSelectedIndex() != -1){
				Product product1 = menu.getMenu()[this.cboItem1.getSelectedIndex()];
				order.setOrderProduct(product1, Integer.parseInt(txtQty1.getText()));
				this.txtLineTotal1.setText(nf.format(order.getLineTotal(0)));
			}
		    if (this.cboItem2.getSelectedIndex() != -1) {
		        Product product2 = menu.getMenu()[this.cboItem2.getSelectedIndex()];
		        order.setOrderProduct(product2, Integer.parseInt(txtQty2.getText()));
		        this.txtLineTotal2.setText(nf.format(order.getLineTotal(1)));
		    }
		    if (this.cboItem3.getSelectedIndex() != -1) {
		        Product product3 = menu.getMenu()[this.cboItem3.getSelectedIndex()];
		        order.setOrderProduct(product3, Integer.parseInt(txtQty3.getText()));
		        this.txtLineTotal3.setText(nf.format(order.getLineTotal(2)));
		    }
			
			jz.addOrder(order);
			jz.setClerk(orderID);
			jz.processOrder(orderID);
			
			//TODO
			//INSTEAD OF GET RECEIPT YOU NEED TO GREATE METHODS THAT
			//WILL RETURN INDIVIDUAL VALUES
			//FOR EACH LINE ITEM RETRIEVE THE TOTALS
			//FOR THE WHOLE ORDER RETRIEVE THE SUBTOTAL, TAX, TOTAL
			//DISPLAY THESE RESULTS IN THE APPROPRIATE BOXES INSTEAD OF THE JOPTIONPANE BOX
		    txtSubtotal.setText(nf.format(order.subtotal));
		    txtTax.setText(nf.format(order.tax));
		    txtTotal.setText(nf.format(order.total));
			
			//JOptionPane.showMessageDialog(null, jz.getReceipt(orderID));
			JOptionPane.showMessageDialog(null,"Order [" + orderID + "] information has been updated!");
			}
	}//End of updateOrder class
	    
		//Method to import orders
	    public void importOrder(){
	    	String fileName = "C:\\in\\ImportOrder.txt";
			FileReader fr = null;
			BufferedReader br =  null;
			
			//Declare local variables
			String orderID = "";
			String firstName = "";
			String lastName = "";
			String membership = "";
			String phone = "";
		    String street = "";
		    String city = "";
		    String state = "";
		    String zip = "";
			String product1 = "";
			String product2 = "";
			String product3 = "";
			String quantity1 = "";
			String quantity2 = "";
			String quantity3 = "";
		    
			//Code block when there are no errors found
			try {
				//initialize the file reader
				fr = new FileReader(fileName);
				//initialize the buffered reader
				br = new BufferedReader(fr);
				
				//Read each text file line then store it in a variable called input
				//read from buffer to a line
				String input = br.readLine();
				String line = "";
				
				//Check if text file contains data
				if(input != null){
					//Take each line from text file then split it per line
					// then assign it to the Hash Map called lineHash
					String[] lineHash = input.split(",");
					//Call the applicable key from lineHash with its associated value
					// then assign it to the applicable variable
					orderID = lineHash[0];
					firstName = lineHash[1];
					lastName = lineHash[2];
					membership = lineHash[3];
					phone = lineHash[4];
					street = lineHash[5];
					city = lineHash[6];
					state = lineHash[7];
					zip = lineHash[8];
					product1 = lineHash[9];
					product2 = lineHash[10];
					product3 = lineHash[11];
					quantity1 = lineHash[12];
					quantity2 = lineHash[13];
					quantity3 = lineHash[14];
					
					//Set the stored variable value from lineHash to the applicable text fields
					txtOrderID.setText(orderID);
					txtFirstName.setText(firstName);
					txtLastName.setText(lastName);
					txtMemberShip.setText(membership);
					txtPhone.setText(phone);
					txtStreet.setText(street);
					txtCity.setText(city);
					txtState.setText(state);
					txtZip.setText(zip);
					this.cboItem1.setSelectedItem(product1);
					this.cboItem2.setSelectedItem(product2);
					this.cboItem3.setSelectedItem(product3);
					this.txtQty1.setText(quantity1);
					this.txtQty2.setText(quantity2);
					this.txtQty3.setText(quantity3);
					
					//Show successful import message
					JOptionPane.showMessageDialog(null, "New data has been Inported successfully! "
							+ "\nVerify that the correct information Imported.\n"
							+ "Once verified, click OK to add and save the Imported order.");
					line += input + "Import Message";
					
					//Call method to add the order
					this.addOrder();
				}
				else{
					//display line read from file
					JOptionPane.showMessageDialog(null, line);
				}//End of the While Loop
				
			} catch (IOException ioEx) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, ioEx.getMessage());
			}finally{
				//Close any opened files
				try {
					br.close();
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    }//End of importOrder method
	    
	    //Method to export orders
	    public void exportOrder() throws IOException{
	    	String exportFile = "C:\\out\\ExportedOrder.txt";
			FileWriter fw = null;
			PrintWriter pw = null;
			BufferedWriter bw = null;
			
			//Call the findOrder method
			findOrder();
			String orderID = txtOrderID.getText();
			Order foundOrder = jz.findOrder(orderID);
			
			//display line write to file then set it to append data to file
			try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(exportFile,true), "utf-8"))){

				//Check if the order exists
				if (foundOrder != null){
					//Get the values then assign it
					String oid = txtOrderID.getText();
					String fname = txtFirstName.getText();
					String lname = txtLastName.getText();
					String mship = txtMemberShip.getText();
					String phn = txtPhone.getText();
					String str = txtStreet.getText();
					String city = txtCity.getText();
					String state = txtState.getText();
					String zip = txtZip.getText();
					Object pd1 = cboItem1.getSelectedItem();
					Object pd2 = cboItem2.getSelectedItem();
					Object pd3 = cboItem3.getSelectedItem();
					String q1 = txtQty1.getText();
					String q2 = txtQty2.getText();
					String q3 = txtQty3.getText();
					String pr1 = txtPrice1.getText();
					String pr2 = txtPrice2.getText();
					String pr3 = txtPrice3.getText();
					String t1 = txtLineTotal1.getText();
					String t2 = txtLineTotal2.getText();
					String t3 = txtLineTotal3.getText();
					String total = txtTotal.getText();
					
					//--------------------------------------------------------------------------------------------------------------------------------------------------
					// Export and append all of the order detail to a text file
					//--------------------------------------------------------------------------------------------------------------------------------------------------
					writer.append("\r\nOrder ID: " + oid + "\r\nCustomer Name: " + fname + " " + lname 
								+ "\r\nMembership Number: " + mship + "\r\nPhone Number: " + phn 
								+ "\r\nShipping Address: " + str + ", " + city + ", " + state + ", " + zip 
								+ "\r\nProduct 1: " + pd1 + " @ a Quantity of: " + q1 + " @ Price: " + pr1 + " for a Total = " + t1
								+ "\r\nProduct 2: " + pd2 + " @ a Quantity of: " + q2 + " @ Price: " + pr2 + " for a Total = " + t2 
								+ "\r\nProduct 3: " + pd3 + " @ a Quantity of: " + q3 + " @ Price: " + pr3 + " for a Total = " + t3
								+ "\r\nGrand Total = " + total + "\r\n");

					//Export completes then show a success message
					JOptionPane.showMessageDialog(null,"EXPORT COMPLETE! \nThe Text File for Order ID: [" + oid + "] has been exported to C:\\out\\ExportedOrder.txt.");
					//--------------------------------------------------------------------------------------------------------------------------------------------------
					
				} else{
						JOptionPane.showMessageDialog(null, "The Order ID: [" + orderID + "] was not found!");
					  }
			}catch(IOException ioEx){
				JOptionPane.showMessageDialog(null, ioEx);
			}
			finally{
				try{
					pw.close();
					bw.close();
					fw.close();
				}catch(Exception ex){
				}
			}
	    }//End of exportOrder method
	    
	    //--------------------------------------------------------------------------
	    //Method to exit the application
	    //--------------------------------------------------------------------------
	    public void exitApp(){
	    	JOptionPane.showMessageDialog(null, "Thank you for using the JavaZon II Application!");
	    	System.exit(0);
	    }//End of exitApp method

}//End of JavaZonFrame class