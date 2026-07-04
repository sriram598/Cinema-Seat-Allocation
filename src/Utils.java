public class Utils {

    // Print Application Header
    public static void printHeader() {

        System.out.println();
        System.out.println("================================================");
        System.out.println("         CINEMA SEAT ALLOCATION SYSTEM");
        System.out.println("================================================");
        System.out.println();

    }

    // Print Section Title
    public static void printTitle(String title) {

        System.out.println();
        System.out.println("--------------- " + title + " ---------------");

    }

    // Print Line
    public static void printLine() {

        System.out.println("------------------------------------------------");

    }

    // Print Success Message
    public static void printSuccess(String message) {

        System.out.println("[SUCCESS] " + message);

    }

    // Print Error Message
    public static void printError(String message) {

        System.out.println("[ERROR] " + message);

    }

}