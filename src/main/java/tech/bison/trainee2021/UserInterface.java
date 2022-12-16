package tech.bison.trainee2021;

import java.util.Scanner;

public class UserInterface {
    public void run() {
        System.out.println("PASSWORD MANAGER");
        String input = getInput("User > ");
        System.out.println(generateMessage(input));
    }

    // This method cant be tested bc it is the interface to the user
    String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    String generateMessage(String userInput) {
        return  "";
    }
}
