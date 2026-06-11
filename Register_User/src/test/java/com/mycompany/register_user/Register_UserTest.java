/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author sonok
 */
public class Register_UserTest {
    
    public Register_UserTest() {
    }
     Login login = new Login();
     String firstName = "LESEDI";
      String lastName = "THABO";
  
  

    // Username - correct
    @Test
    public void testCorrectUsername() {
        assertTrue(login.checkUserName("kyl_1"));
    }

    // Username - incorrect
    @Test
    public void testIncorrectUsername() {
        assertFalse(login.checkUserName("kyle!!!!"));
    }

    // Password - correct
    @Test
    public void testCorrectPassword() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    // Password - incorrect
    @Test
    public void testIncorrectPassword() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    // Phone - correct
    @Test
    public void testCorrectPhoneNumber() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }

    // Phone - incorrect
    @Test
    public void testIncorrectPhoneNumber() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }

    //  FIXED LOGIN STATUS TEST
    @Test
    public void testReturnLoginStatus() {
        login.setFirstName("LESEDI");
        login.setLastName("THABO");

        String result = login.returnLoginStatus(true);

        assertEquals(
            "Welcome LESEDI THABO it is great to see you again",
            result
        );
    }
}

