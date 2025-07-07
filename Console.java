public class Console {
    // ANSI Color codes


    static PrintColors green = PrintColors.GREEN ;
    static PrintColors red = PrintColors.RED ;
    static PrintColors yellow = PrintColors.YELLOW ;
    static PrintColors blue = PrintColors.BLUE ;
    static PrintColors white = PrintColors.WHITE ;
    static PrintColors reset = PrintColors.RESET ;

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
