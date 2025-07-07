public class Console {
    // ANSI Color codes
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String WHITE = "\u001B[37m";
    private static final String RESET = "\u001B[0m";

    public static void log(String message) {
        System.out.println(GREEN + "[LOG]" + RESET + " " + WHITE + message + RESET);
    }

    public static void error(String message) {
        System.err.println(RED + "[ERROR]" + RESET + " " + WHITE + message + RESET);
    }

    public static void warn(String message) {
        System.out.println(YELLOW + "[WARNING]" + RESET + " " + WHITE + message + RESET);
    }

    public static void info(String message) {
        System.out.println(BLUE + "[INFO]" + RESET + " " + WHITE + message + RESET);
    }

    public static void success(String message) {
        System.out.println(GREEN + "[SUCCESS]" + RESET + " " + WHITE + message + RESET);
    }
}
