package test.register_user;

public class Report {

    // Display full report of all sent messages
    public static String displaySentReport() {
        if (Message.sentMessages.isEmpty()) {
            return "\nNo sent messages to report ";
        }

        String result = "\n=== Sent Messages Report ===";

        for (int i = 0; i < Message.sentMessages.size(); i++) {
            Message m = Message.sentMessages.get(i);

            result += "\n[" + (i + 1) + "]";
            result += "\nMessage Hash: " + m.getMessageHash();
            result += "\nRecipient: " + m.getRecipient();
            result += "\nMessage: " + m.getMessageText();
            result += "\n====================";
        }

        return result;
    }

    // Display full report of all stored messages
    public static String displayStoredReport() {
        if (Message.storedMessages.isEmpty()) {
            return "No stored messages to report";
        }

        String result = "\n=== Stored Messages Report ===";

        for (int i = 0; i < Message.storedMessages.size(); i++) {
            Message m = Message.storedMessages.get(i);

            result += "\n[" + (i + 1) + "]";
            result += "\nMessage Hash: " + m.getMessageHash();
            result += "\nRecipient: " + m.getRecipient();
            result += "\nMessage: " + m.getMessageText();
            result += "\n====================";
        }

        return result;
    }

    // Display full report of all disregarded messages
    public static String displayDisregardedReport() {
        if (Message.disregardedMessages.isEmpty()) {
            return "\n No disregarded messages to report";
        }

        String result = "\n=== Disregarded Messages Report ===";

        for (int i = 0; i < Message.disregardedMessages.size(); i++) {
            Message m = Message.disregardedMessages.get(i);

            result += "\n[" + (i + 1) + "]";
            result += "\nMessage Hash: " + m.getMessageHash();
            result += "\nRecipient: " + m.getRecipient();
            result += "\nMessage: " + m.getMessageText();
            result += "\n====================";
        }

        return result;
    }

    // Display full report of ALL messages
    public static String displayFullReport() {
        String result = "\n========= Full Message Report ========";

        result += displaySentReport();
        result += displayStoredReport();
        result += displayDisregardedReport();

        return result;
    }
}