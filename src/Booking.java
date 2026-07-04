public class Booking {

    private String customerName;
    private String seatNumber;

    // Constructor
    public Booking(String customerName, String seatNumber) {
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    // Getter for customer name
    public String getCustomerName() {
        return customerName;
    }

    // Getter for seat number
    public String getSeatNumber() {
        return seatNumber;
    }

    // Setter for customer name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Setter for seat number
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Display booking details
    public void displayBooking() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Seat Number   : " + seatNumber);
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + " | Seat: " + seatNumber;
    }

}