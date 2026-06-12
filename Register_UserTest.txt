package test.register_user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReportTest {

    @BeforeEach
    void setUp() {

        Message.resetMessages();

        // Message Sent - +27834557896, "Did you get the cake?"
        Message m1 = new Message();
        m1.setMessageID("111111");
        m1.setRecipient("+27834557896");
        m1.setMessageText("Did you get the cake?");
        m1.setMessageHash("11DIDCAKE");
        Message.sentMessages.add(m1);
        Message.totalMessages++;

        // Message  Stored - +27838884567, "Where are you? You are late! I have asked you to be on time."
        Message m2 = new Message();
        m2.setMessageID("222222");
        m2.setRecipient("+27838884567");
        m2.setMessageText("Where are you? You are late! I have asked you to be on time.");
        m2.setMessageHash("22WHERETIME");
        Message.storedMessages.add(m2);

        // Message  Disregarded - +27834484567, "Yohoooo, I am at your gate."
        Message m3 = new Message();
        m3.setMessageID("333333");
        m3.setRecipient("+27834484567");
        m3.setMessageText("Yohoooo, I am at your gate.");
        m3.setMessageHash("33YOHGATE");
        Message.disregardedMessages.add(m3);

        // Message  Sent - 0838884567, "It is dinner time !"
        Message m4 = new Message();
        m4.setMessageID("0838884567");
        m4.setRecipient("0838884567");
        m4.setMessageText("It is dinner time !");
        m4.setMessageHash("08DINNERTIME");
        Message.sentMessages.add(m4);
        Message.totalMessages++;

        // Message Stored - +27838884567, "Ok, I am leaving without you."
        Message m5 = new Message();
        m5.setMessageID("555555");
        m5.setRecipient("+27838884567");
        m5.setMessageText("Ok, I am leaving without you.");
        m5.setMessageHash("55OKLEAVINGWITHOUT");
        Message.storedMessages.add(m5);
    }

    //  Sent Messages array correctly populated
    @Test
    void testSentMessagesPopulated() {
        assertEquals(2, Message.sentMessages.size());
        assertEquals("Did you get the cake?", Message.sentMessages.get(0).getMessageText());
        assertEquals("It is dinner time !", Message.sentMessages.get(1).getMessageText());
    }

    //  Display the longest message
    @Test
    void testDisplayLongestMessage() {
        String result = Message.displayLongestMessages();
        assertTrue(result.contains("Where are you? You are late! I have asked you to be on time."));
    }

    //  Search for message by ID
    @Test
    void testSearchByMessageID() {
        String result = Message.searchByMessageID("0838884567");
        assertTrue(result.contains("It is dinner time !"));
    }

    //  Search all messages for a particular recipient
    @Test
    void testSearchByRecipient() {
        String result = Message.searchByRecipient("+27838884567");
        assertTrue(result.contains("Where are you? You are late! I have asked you to be on time."));
        assertTrue(result.contains("Ok, I am leaving without you."));
    }

    //  Delete a message using the message hash
    @Test
    void testDeleteByHash() {
        String result = Message.deleteByHash("22WHERETIME");
        assertEquals("Message: \"Where are you? You are late! I have asked you to be on time.\" successfully deleted.", result);
    }

    //  Display Report - shows all sent messages with Hash, Recipient, Message
    @Test
    void testDisplayReport() {
        String result = Report.displaySentReport();
        assertTrue(result.contains("11DIDCAKE"));
        assertTrue(result.contains("+27834557896"));
        assertTrue(result.contains("Did you get the cake?"));
        assertTrue(result.contains("08DINNERTIME"));
        assertTrue(result.contains("It is dinner time !"));
    }
}