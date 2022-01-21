/** Pearson Revel Chapter 10: Programming question 1
 * @author Brandon Tenorio `
 */
import java.util.Scanner;
class Person {
    private String name;
    private String address;
    private String telephoneNumber;

    /**
     * No-arg constructor. Initializes every class attribute to an empty String.
     */
    public Person(){
        this.name = "";
        this.address = "";
        this.telephoneNumber = "";
    }

    /**
     * Parameterized constructor. Initializes name, address, and telephoneNumber, to the parameters passed to it.
     * @param name Name of the person
     * @param address Address of the person
     * @param telephoneNumber Telephone number of the person
     */
    public Person(String name, String address, String telephoneNumber){
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * Mutator method. Initializes name class attribute
     * @param name Name of the person
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Accesor method. Returns String referenced by name class attribute.
     * @return Name of the person
     */
    public String getName(){
        return name;
    }

    /**
     * Mutator method. Initializes address class attribute
     * @param address The person's address.
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * Accessor method. Returns String referenced by address class attribute
     * @return The person's address
     */
    public String getAddress(){
        return address;
    }

    /**
     * Mutator method. Initializes telephoneNumber class attribute
     * @param telephoneNumber The person's telephone number
     */
    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * Accessor method. Returns String referenced by telephoneNumber class attribute.
     * @return The person's telephone number.
     */
    public String getTelephoneNumber(){
        return telephoneNumber;
    }
}

class Customer extends Person{
    private String customerNumber;
    private boolean mailingListStatus;

    /**
     * No-arg constructor. Initializes customerNumber to an empty String, mailingListStatus to false
     */
    public Customer(){
        this.customerNumber = "";
        this.mailingListStatus = false;
    }

    /**
     * Parameterized constructor. Constructor initializes customerNumber and mailingListStatus to parameters passed to it
     * @param name Name of the customer
     * @param address Customer's address
     * @param telephoneNumber Customer's telephone number
     * @param customerNumber Number of customer
     * @param mailingListStatus Whether the customer wants to be added to the mailing list or not
     */
    public Customer(String name, String address, String telephoneNumber, String customerNumber, boolean mailingListStatus){
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.mailingListStatus = mailingListStatus;
    }

    /**
     * Mutator method. Initializes customerNumber to parameter passed to this method
     * @param customerNumber The customer's number
     */
    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }

    /**
     * Accessor method. Returns String referenced by customerNumber
     * @return The customer's number
     */
    public String getCustomerNumber(){
        return customerNumber;
    }

    /**
     * Mutator method. Initializes mailingListStatus with parameter passed to it
     * @param mailingListStatus Whether the customer wants to be a part of the mailing list or not
     */
    public void setMailingListStatus(boolean mailingListStatus){
        this.mailingListStatus = mailingListStatus;
    }

    /**
     * Accessor method. Returns true if customer wants to be a part of the mailing list
     * @return Whether the customer wants to be included in the mailing list or not
     */
    public boolean getMailingListStatus(){
        return mailingListStatus;
    }

}

class Driver{
    public static void main(String[] args){
        String name, address, telephoneNumber, customerNumber;
        String customerAnswer;  // To save the customer's answer to whether or not they want to be added to the mailing list
        boolean mailingListStatus;
        Scanner k = new Scanner(System.in);

        System.out.print("Enter name of customer: ");
        name = k.nextLine();

        System.out.print("Enter address of customer: ");
        address = k.nextLine();

        System.out.print("Enter phone number of customer: ");
        telephoneNumber = k.nextLine();

        System.out.print("Enter number of customer: ");
        customerNumber = k.nextLine();

        System.out.print("Does the customer want to receive mail? (Enter yes/no) ");
        customerAnswer = k.nextLine();

        mailingListStatus = customerAnswer.toLowerCase().startsWith("y");

        String formattedTelephoneNumber = telephoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        Customer customer = new Customer(name, address, formattedTelephoneNumber, customerNumber, mailingListStatus);

        if (customer.getMailingListStatus())
            customerAnswer = "yes";
        System.out.println();
        System.out.println("\nCustomer: " +
                "\nName: " + customer.getName() +
                "\nAddress: " + customer.getAddress() +
                "\nPhone number: " + customer.getTelephoneNumber() +
                "\nCustomer number: " + customer.getCustomerNumber() +
                "\nReceive mail? " + customerAnswer);
    }
}
