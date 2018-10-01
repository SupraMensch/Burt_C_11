// Christopher Burt
// Project # 11

//Write a Customer class that contains the following fields:

//- Name
//- Customer ID
//- Address
//- Phone Number

// The class should have two constructors:
//- A no-arg constructor that sets the fields to empty strings ("")
//- A constructor that accepts the four fields as arguments and assigns them to their appropriate fields in the class

//Write appropriate mutator methods to store values in the fields and accessor methods to return the values in the fields.

//Write a separate program that creates three Customer objects by entering the fields for each object from the keyboard.


package burt_C_11;

public class Burt_C_11
{
    //  Main method demonstrates class's function   
    public static void main(String[] args)
    {
        
        //Customer object 1
        Customer cust = new Customer();
        cust.setCustName("John adams");
        cust.setCustomerID("135");
        cust.setAddress("500 washington Avenue");
        cust.setPhoneNumber("3182647789");
        
        
        //Customer object 2
        Customer cust2 = new Customer();
        cust2.setCustName("John Jenkins");
        cust2.setCustomerID("139");
        cust2.setAddress("500 Apple Avenue");
        cust2.setPhoneNumber("3182647786");
        
        //Customer object 3
        Customer cust3 = new Customer();
        cust3.setCustName("Jerry Stephens");
        cust3.setCustomerID("142");
        cust3.setAddress("503 Parker St");
        cust3.setPhoneNumber("3182797769");
        
                
        System.out.print("The first customer's information is ");
        System.out.println(cust.getcustName() + " Customer ID: " + cust.getcustomerID());
        System.out.print("The customer's address and phone number: ");
        System.out.println(cust.getAddress() + " Phone Number: " + cust.getPhoneNumber() + "\n");
        
        System.out.print("The second customer's information is ");
        System.out.println(cust2.getcustName() + " Customer ID: " + cust2.getcustomerID());
        System.out.print("The customer's address and phone number: ");
        System.out.println(cust2.getAddress() + " Phone Number: " + cust2.getPhoneNumber() + "\n");
        
        System.out.print("The third customer's information is ");
        System.out.println(cust3.getcustName() + " Customer ID: " + cust3.getcustomerID());
        System.out.print("The customer's address and phone number: ");
        System.out.println(cust3.getAddress() + " Phone Number: " + cust3.getPhoneNumber());
    }
    
}