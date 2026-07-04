public class SeatMap {

    private final int ROWS = 5;
    private final int COLS = 6;

    private char[][] seats;

    public SeatMap() {

        seats = new char[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {

            for (int j = 0; j < COLS; j++) {

                seats[i][j] = 'O';

            }

        }

    }

    // Display Seat Map
    public void displaySeatMap() {

        System.out.println();
        System.out.println("============== SCREEN ==============");
        System.out.println();

        System.out.print("    ");

        for (int i = 1; i <= COLS; i++) {

            System.out.print(i + " ");

        }

        System.out.println();

        char rowLetter = 'A';

        for (int i = 0; i < ROWS; i++) {

            System.out.print(rowLetter + "   ");

            for (int j = 0; j < COLS; j++) {

                System.out.print(seats[i][j] + " ");

            }

            System.out.println();

            rowLetter++;

        }

        System.out.println();
        System.out.println("O = Available");
        System.out.println("X = Booked");
        System.out.println();

    }

    // Book Single Seat
    public boolean bookSeat(char row, int col) {

        int rowIndex = Character.toUpperCase(row) - 'A';
        int colIndex = col - 1;

        if (rowIndex < 0 || rowIndex >= ROWS || colIndex < 0 || colIndex >= COLS) {

            return false;

        }

        if (seats[rowIndex][colIndex] == 'X') {

            return false;

        }

        seats[rowIndex][colIndex] = 'X';

        return true;

    }

    // Cancel Seat
    public boolean cancelSeat(char row, int col) {

        int rowIndex = Character.toUpperCase(row) - 'A';
        int colIndex = col - 1;

        if (rowIndex < 0 || rowIndex >= ROWS || colIndex < 0 || colIndex >= COLS) {

            return false;

        }

        if (seats[rowIndex][colIndex] == 'O') {

            return false;

        }

        seats[rowIndex][colIndex] = 'O';

        return true;

    }

    // Book Group Seats (Contiguous)
    public String bookGroupSeats(int numberOfSeats) {

        if (numberOfSeats > COLS) {

            return "Group size exceeds row capacity.";

        }

        for (int i = 0; i < ROWS; i++) {

            int count = 0;

            for (int j = 0; j < COLS; j++) {

                if (seats[i][j] == 'O') {

                    count++;

                    if (count == numberOfSeats) {

                        int start = j - numberOfSeats + 1;

                        String allocatedSeats = "";

                        for (int k = start; k <= j; k++) {

                            seats[i][k] = 'X';

                            allocatedSeats += (char) ('A' + i) + "" + (k + 1) + " ";

                        }

                        return "Allocated Seats: " + allocatedSeats;

                    }

                } else {

                    count = 0;

                }

            }

        }

        return "No contiguous seats available.";

    }

    // Count Available Seats
    public int getAvailableSeats() {

        int count = 0;

        for (int i = 0; i < ROWS; i++) {

            for (int j = 0; j < COLS; j++) {

                if (seats[i][j] == 'O') {

                    count++;

                }

            }

        }

        return count;

    }

    // Count Booked Seats
    public int getBookedSeats() {

        int count = 0;

        for (int i = 0; i < ROWS; i++) {

            for (int j = 0; j < COLS; j++) {

                if (seats[i][j] == 'X') {

                    count++;

                }

            }

        }

        return count;

    }

    public int getTotalSeats() {

        return ROWS * COLS;

    }

}