
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** 
 *
 * @author sonok
 */
   public class Login {
    
 

    private String username;
    private String password;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    Scanner input = new Scanner(System.in);

   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Register Names
    public void registerNames() {
        System.out.print("Enter First Name: ");
        firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = input.nextLine();
    }

    // Username
    public void registerUsername() {
        do {
            System.out.print("Enter your Username: ");
            username = input.nextLine();

            if (!checkUserName(username)) {
                System.out.println("Username is incorrectly formatted. Must contain underscore and max 5 chars.");
            }

        } while (!checkUserName(username));

        System.out.println("Username successfully captured.");
    }

    // Password
    public void registerPassword() {
        do {
            System.out.print("Enter Password: ");
            password = input.nextLine();

            if (!checkPasswordComplexity(password)) {
                System.out.println("Password does not meet complexity requirements.");
            }

        } while (checkPasswordComplexity(password));

        System.out.println("Password successfully captured");
    }

    // Phone
    public void registerPhoneNumber() {
        do {
            System.out.print("Enter phone number with (+27) code ");
            phoneNumber = input.nextLine();

            if (!checkCellPhoneNumber(phoneNumber)) {
                System.out.println("Cell phone number incorrectly formatted");
            }

        } while (!checkCellPhoneNumber(phoneNumber));

        System.out.println("Cell phone number successfully added");
    }

    // FIXEDku VALIDATION METHODS
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$");
    }

    public boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\+27[0-9]{9}$");
    }

    // Registration status
    public String registerUser() {
        if (!checkUserName(username)) return "Username is incorrectly formatted.";
        if (!checkPasswordComplexity(password)) return "Password does not meet complexity requirements.";
        if (!checkCellPhoneNumber(phoneNumber)) return "Phone number is incorrectly formatted.";
        return "Registration successful!";
    }

    //  LOGIN 
    public boolean loginUser() {
        String userAttempt;
        String passAttempt;

        do {
            System.out.print("Enter username: ");
            userAttempt = input.nextLine();

            System.out.print("Enter password: ");
            passAttempt = input.nextLine();

            if (!userAttempt.equals(username) || !passAttempt.equals(password)) {
                System.out.println("Username or password incorrect. Try again.");
            }

        } while (!userAttempt.equals(username) || !passAttempt.equals(password));

        return true;
    }

    // Login message
    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess)
            return "Welcome " + firstName + " " + lastName + " it is great to see you again";
        else
            return "Login failed. Please check your username and password.";
    }

   }

