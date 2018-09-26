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

public class Burt_C_11
{
       
    public static void main(String[] args)
    {
        
        Customer cust = new Customer();
        cust.setLastName("Jones");
        cust.setFirstName("Bob");
        
        System.out.print("This customer is ");
        System.out.println(cust.getFirstName() + " " + cust.getLastName());
    }
    
}