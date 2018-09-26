package burt_C_11;

public class Customer
{
    private String lastName;
    private String firstName;
    private String address;
    private String phoneNumber;
   

    
    public Customer() 
    {
        lastName = "";
        firstName = "";
        address = "";
        phoneNumber = "";
    }
    
    public Customer(Customer c) 
    {
        lastName = new String(c.lastName);
        firstName = new String(c.firstName);
        address = new String(c.address);
        phoneNumber = new String(c.phoneNumber);
    }

    public Customer(String ln, String fn)
    {
        lastName = ln;
        firstName = fn;
        address = "";
        phoneNumber = "";
    }

    public Customer(String ln, String fn, String ad, String pn) {
        lastName = ln;
        firstName = fn;
        address = ad;
        phoneNumber = pn;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setLastName(String ln) {
        lastName = ln;
    }
    
    public void setFirstName(String fn) {
        firstName = fn;
    }
    
    public void setAddress(String ad) {
        address = ad;
    }
    
    public void setPhoneNumber(String pn) {
        phoneNumber = pn;
    }
}
