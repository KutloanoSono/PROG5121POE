package test.register_user;

import java.util.Scanner;

public class Login {

    private String username;
    private String password;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    Scanner input = new Scanner(System.in);

    // Setters (for testing if needed)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Register names
    public void registerNames() {

        System.out.print("Enter First Name: ");
        firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = input.nextLine();
    }

    // Username registration
    public void registerUsername() {

        do {

            System.out.print("Enter your Username: ");
            username = input.nextLine();

            if (!checkUserName(username)) {
                System.out.println("Username is incorrectly formatted. Must contain '_' and be max 5 characters.");
            }

        } while (!checkUserName(username));

        System.out.println("Username successfully captured.");
    }

    // Password registration
    public void registerPassword() {

        do {

            System.out.print("Enter Password: ");
            password = input.nextLine();

            if (!checkPasswordComplexity(password)) {
                System.out.println("Password must be at least 8 chars, include 1 uppercase, 1 number, and 1 special character.");
            }

        } while (!checkPasswordComplexity(password));

        System.out.println("Password successfully captured.");
    }

    // Phone number registration
    public void registerPhoneNumber() {

        do {

            System.out.print("Enter phone number (+27...): ");
            phoneNumber = input.nextLine();

            if (!checkCellPhoneNumber(phoneNumber)) {
                System.out.println("Cell phone number incorrectly formatted. Must start with +27 and have 12 characters.");
            }

        } while (!checkCellPhoneNumber(phoneNumber));

        System.out.println("Cell phone number successfully added.");
    }

    // Username validation
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Password validation
    public boolean checkPasswordComplexity(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$");
    }

    // Phone validation
    public boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^\\+27[0-9]{9}$");
    }

    // Registration status
    public String registerUser() {

        if (!checkUserName(username)) {
            return "Username is incorrectly formatted.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password does not meet complexity requirements.";
        }

        if (!checkCellPhoneNumber(phoneNumber)) {
            return "Phone number is incorrectly formatted.";
        }

        return "Registration successful!";
    }

    // LOGIN FIXED METHOD
    public boolean loginUser() {

        String userAttempt;
        String passAttempt;

        boolean loggedIn = false;

        do {

            System.out.print("Enter username: ");
            userAttempt = input.nextLine();

            System.out.print("Enter password: ");
            passAttempt = input.nextLine();

            if (userAttempt.equals(username) && passAttempt.equals(password)) {

                System.out.println("Login successful!");
                loggedIn = true;

            } else {

                System.out.println("Username or password incorrect. Try again.");
            }

        } while (!loggedIn);

        return true;
    }

    // Login status message
    public String returnLoginStatus(boolean loginSuccess) {

        if (loginSuccess) {
            return "Welcome " + firstName + " " + lastName + " it is great to see you again";
        } else {
            return "Login failed. Please check your username and password.";
        }
    }
}