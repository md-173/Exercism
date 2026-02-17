public class LogLine {
    private final String logText;
    
    public LogLine(String logLine) {
        this.logText = logLine;
    }

    public LogLevel getLogLevel() {
        String token = logText.substring(1, 4);
        switch(token) {
            case "TRC" :
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        int endIdx = logText.length();
        String msg = logText.substring(7,endIdx);
        return this.getLogLevel().level + ":" + msg;
        
    }
}
