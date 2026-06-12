package test.register_user;
import java.util.Scanner;

public class QuickChat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login login = new Login();
   
        System.out.println("=== Registration ===");
        login.registerNames();
        login.registerUsername();
        login.registerPassword();
        login.registerPhoneNumber();
        System.out.println(login.registerUser());
     
        System.out.println("=== Login ===");
        boolean loginSuccess = login.loginUser();
        System.out.println(login.returnLoginStatus(loginSuccess));
        
        if (!loginSuccess) {
            System.out.println("Exiting application.");
            return;
        }
       
        System.out.println("Welcome to QuickChat.");
 
        int numMessages = 0;
        System.out.print("How many messages would you like to send? ");
        while (true) {
            try {
                numMessages = Integer.parseInt(input.nextLine());
                if (numMessages > 0) break;
                System.out.print("Enter a positive number: ");
            } catch (Exception e) {
                System.out.print("Invalid input. Enter a number: ");
            }
        }

        boolean running = true;
        while (running) {
            System.out.println("\n=== QuickChat Menu ===");
            System.out.println("1) Send Messages");
            System.out.println("2) Show recently sent messages");
            System.out.println("3) Message Management");
            System.out.println("4) Quit");
            System.out.print("Choice: ");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    int count = 0;
                    while (count < numMessages) {
                        System.out.println("Message " + (count + 1) + " of " + numMessages);
                        Message msg = new Message();
                        msg.checkMessageID(input);
                        msg.sendMessage(input);
                        count++;
                    }
                    System.out.println("Total messages sent: " + Message.returnTotalMessages());
                    break;

                case "2":
                    System.out.println(Report.displayFullReport());
                    break;

                case "3":
                    Message.showMenu(input);
                    break;

                case "4":
                    running = false;
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
        input.close();
    }
}