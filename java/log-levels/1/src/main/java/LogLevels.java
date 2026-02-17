public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split("]:",0);
        String msg = arr[1].trim();
        return msg;
    }

    public static String logLevel(String logLine) {
        String regex = "[\\[\\]]";
        String[] arr = logLine.split(regex);
        return arr[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
