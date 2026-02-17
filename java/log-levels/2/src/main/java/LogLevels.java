public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split("]:",0);
        return arr[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] arr = logLine.split("[\\[\\]]");
        return arr[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
