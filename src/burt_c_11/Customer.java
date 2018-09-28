// Christopher Burt
// Project # 11

//Write a Customer class that contains the following fields:

//- Name
//- Customer ID
//- Address
//- Phone Number

//The class should have two constructors:
//- A no-arg constructor that sets the fields to empty strings ("")
//- A constructor that accepts the four fields as arguments and assigns them to their appropriate fields in the class

//Write appropriate mutator methods to store values in the fields and accessor methods to return the values in the fields.

//Write a separate program that creates three Customer objects by entering the fields for each object from the keyboard.

package burt_C_11;

public class Customer
{
    private String custName;
    private String customerID;
    private String address;
    private String phoneNumber;
         
    public Customer() 
    {
        custName = "";
        customerID = "";
        address = "";
        phoneNumber = "";
    }
    
    public Customer(Customer c) 
    {
        custName = new String(c.custName);
        customerID = new String(c.customerID);
        address = new String(c.address);
        phoneNumber = new String(c.phoneNumber);
    }

    public Customer(String cun, String cid)
    {
        custName = cun;
        customerID = cid;
        address = "";
        phoneNumber = "";
    }

    public Customer(String cun, String cid, String ad, String pn) {
        custName = cun;
        customerID = cid;
        address = ad;
        phoneNumber = pn;
    }
    
    public String getcustName() {
        return custName;
    }
    
    public String getcustomerID() {
        return customerID;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setCustName(String cun) {
        custName = cun;
    }
    
    public void setCustomerID(String cid) {
        customerID = cid;
    }
    
    public void setAddress(String ad) {
        address = ad;
    }
    
    public void setPhoneNumber(String pn) {
        phoneNumber = pn;
    }
}
