/**
 * A class to represent a customer in a waiting line
 * @author Brandon Tenorio
 */
public class Customer {

    private int arrivalTime, transactionTime, customerNumber;

    public Customer(int arrivalTime, int transactionTime, int customerNumber){
        this.arrivalTime = arrivalTime;
        this.transactionTime = transactionTime;
        this. customerNumber = customerNumber;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getTransactionTime() {
        return transactionTime;
    }
}
