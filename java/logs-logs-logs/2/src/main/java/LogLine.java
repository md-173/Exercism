public class LogLine {
    private final String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String token = logLine.substring(1, 4);
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
        String msg = logLine.substring(7);
        LogLevel typeLog = this.getLogLevel();
        return typeLog.getLevel() + ":" + msg;
        
    }
}
