import java.util.Scanner;

public class BookingSystem {

    private SeatMap seatMap;
    private Scanner scanner;

    public BookingSystem() {
        seatMap = new SeatMap();
        scanner = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("     CINEMA SEAT ALLOCATION SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Display Seat Map");
            System.out.println("2. Book Single Seat");
            System.out.println("3. Book Group Seats");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Show Statistics");
            System.out.println("6. Exit");
            System.out.println("======================================");

            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    seatMap.displaySeatMap();
                    break;

                case 2:
                    bookSingleSeat();
                    break;

                case 3:
                    bookGroupSeats();
                    break;

                case 4:
                    cancelBooking();
                    break;

                case 5:
                    showStatistics();
                    break;

                case 6:
                    System.out.println("\nThank you for using the Cinema Seat Allocation System.");
                    break;

                default:
                    System.out.println("Invalid choice!");

            }

        } while (choice != 6);

    }

    // ---------------- BOOK SINGLE SEAT ----------------

    private void bookSingleSeat() {

        System.out.print("Enter Row (A-E): ");
        char row = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter Seat Number (1-6): ");
        int col = scanner.nextInt();

        if (seatMap.bookSeat(row, col)) {

            System.out.println("Seat " + row + col + " booked successfully.");

        } else {

            System.out.println("Booking failed.");
            System.out.println("Seat may already be booked or invalid.");

        }

    }

    // ---------------- BOOK GROUP ----------------

    private void bookGroupSeats() {

        System.out.print("Enter number of seats required: ");

        int seats = scanner.nextInt();

        String result = seatMap.bookGroupSeats(seats);

        System.out.println(result);

    }

    // ---------------- CANCEL ----------------

    private void cancelBooking() {

        System.out.print("Enter Row (A-E): ");

        char row = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter Seat Number (1-6): ");

        int col = scanner.nextInt();

        if (seatMap.cancelSeat(row, col)) {

            System.out.println("Booking cancelled successfully.");

        } else {

            System.out.println("Cancellation failed.");
            System.out.println("Seat already available or invalid.");

        }

    }

    // ---------------- STATISTICS ----------------

    private void showStatistics() {

        int booked = seatMap.getBookedSeats();

        int available = seatMap.getAvailableSeats();

        int total = seatMap.getTotalSeats();

        double occupancy = ((double) booked / total) * 100;

        System.out.println("\n========== Statistics ==========");
        System.out.println("Total Seats      : " + total);
        System.out.println("Booked Seats     : " + booked);
        System.out.println("Available Seats  : " + available);
        System.out.printf("Occupancy        : %.2f%%\n", occupancy);

    }

}