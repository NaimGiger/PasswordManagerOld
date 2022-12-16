package password_manager;

import java.util.Scanner;

public class UserInterface {
    public void run() {
        System.out.println("PASSWORD MANAGER");
        String input = getInput("> ");
        System.out.println(generateMessage(input));
    }

    // This method cant be tested bc it is the interface to the user
    String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    String generateMessage(String userInput) {
        if (userInput.equals("")) {
            return "";
        }
        return  "Unknown command!";
    }
}
