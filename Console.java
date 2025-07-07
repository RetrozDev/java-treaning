public class Console {
    // ANSI Color codes


    static String green = PrintColors.GREEN.getColorCode();
    static String red = PrintColors.RED.getColorCode();
    static String yellow = PrintColors.YELLOW.getColorCode();
    static String blue = PrintColors.BLUE.getColorCode();
    static String white = PrintColors.WHITE.getColorCode();
    static String reset = PrintColors.RESET.getColorCode();
    


    public static void log(String message) {
        System.out.println(green + "[LOG]" + reset + " " + white + message + reset);
    }

    public static void error(String message) {
        System.err.println(red  + "[ERROR]" + reset + " " + white + message + reset);
    }

    public static void warn(String message) {
        System.out.println(yellow + "[WARNING]" + reset + " " + white + message + reset);
    }

    public static void info(String message) {
        System.out.println(blue + "[INFO]" + reset + " " + white + message + reset);
    }

    public static void success(String message) {
        System.out.println(green + "[SUCCESS]" + reset + " " + white + message + reset);
    }
}
