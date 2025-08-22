package LLD.chainResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(logProcessor.ERROR, "exception happens");
        logProcessor.log(logProcessor.DEBUG, "need to debug this");
        logProcessor.log(logProcessor.INFO, "just for info");
    }
}
