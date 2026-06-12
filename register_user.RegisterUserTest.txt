 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test.register_user;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author sonok
 */
public class MessageTest {
   
    @Test
    public void checkMessageID() {
        System.out.println("captureMessage");
        Scanner input = null;
        Message instance = new Message();
        instance.checkMessageID(input); 
       
    }
    @Test
    public void testIncorrectCheckMessageID() {
        System.out.println("captureMessage"); 
        Scanner input = null;
        Message instance = new Message();
        instance.checkMessageID(input);

    }
    
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        Message instance = new Message();
        String expResult = "";
        String result = instance.createMessageHash();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testIncorrectCreateMessageHash() {
        System.out.println("createMessageHash");
        Message instance = new Message();
        String expResult = "";
        String result = instance.createMessageHash();
        assertEquals(expResult, result);

    } 
    
    @Test
    public void sendMessage() {
        System.out.println("handleMessageAction");
        Scanner input = null;
        Message instance = new Message();
        instance.sendMessage(input);
        
    }
    @Test
    public void IncorrectsendMessage() {
        System.out.println("handleMessageAction");
        Scanner input = null;
        Message instance = new Message();
        instance.sendMessage(input);
    }
    
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        String expResult = "";
        String result = Message.printMessages();
        assertEquals(expResult, result);
       
    }
    @Test
    public void IncorrecttestPrintMessages() {
        System.out.println("printMessages");
        String expResult = "";
        String result = Message.printMessages();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
        int result = Message.returnTotalMessages();
        assertEquals(expResult, result);
        
    }
    @Test
    public void IncorrecttestReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
        int result = Message.returnTotalMessages();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        Message instance = new Message();
        instance.storeMessage();
      
    }
    @Test
    public void IncrrecttestStoreMessage() {
        System.out.println("storeMessage");
        Message instance = new Message();
        instance.storeMessage();
    }
}
