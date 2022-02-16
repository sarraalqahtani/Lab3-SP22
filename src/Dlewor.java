public class Dlewor {

    // constants to allow colored text and backgrounds
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        // print welcome message
        System.out.println("Welcome to Dlewor(TM)");

        // Hello World for colored text and background
        System.out.print(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Hello ");
        System.out.print(ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "World");
        System.out.print(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "!");
        System.out.println(ANSI_RESET);
    }
}
