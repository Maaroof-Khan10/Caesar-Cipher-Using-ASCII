import java.util.Scanner;

public class CaesarCipher {

    // Method to encrypt a string using the Caesar Cipher algorithm with a given shift number
    public static void encrypt(String text, int sNum) {
        // Get the length of the input text
        int len = text.length();
        // Use StringBuilder for efficient string manipulation
        StringBuilder output = new StringBuilder(len);
        char currChar;
        
        // Loop through each character in the input text
        for (int i = 0; i < len; i++) {
            currChar = text.charAt(i);
            // Apply the Caesar Cipher encryption formula using ASCII values
            currChar = (char)((((currChar + sNum - 32) % 94) + 94) % 94 + 32);
            // Append the encrypted character to the output string
            output.append(currChar);
        }
        
        // Print the final encrypted string
        System.out.println("\nYour encrypted string is> " + output);
    }

    // Method to decrypt a string using the Caesar Cipher algorithm with a given shift number
    public static void decrypt(String text, int sNum) {
        // Get the length of the input text
        int len = text.length();
        // Use StringBuilder for efficient string manipulation
        StringBuilder output = new StringBuilder(len);
        char currChar;
        
        // Loop through each character in the input text
        for (int i = 0; i < len; i++) {
            currChar = text.charAt(i);
            // Apply the Caesar Cipher decryption formula using ASCII values
            currChar = (char)((((currChar - sNum - 32) % 94) + 94) % 94 + 32);
            // Append the decrypted character to the output string
            output.append(currChar);
        }
        
        // Print the final decrypted string
        System.out.println("\nYour decrypted string is> " + output);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        String userText;
        int shiftNumber, choice;

        // Keep running the program until the user chooses to exit
        do {
            // Display a simple header for the program
            System.out.println("\n[CaesarCipher in Java using ASCII codes]\n");

            // Prompt user to input a string to encrypt/decrypt
            System.out.print("Enter your message or String> ");
            userText = scanner.nextLine();
            
            // Prompt user to enter a shift number (between 0 and 94)
            System.out.print("Enter shift number (0-94)> ");
            shiftNumber = scanner.nextInt();
            
            // Validate the shift number input and adjust if necessary
            if (shiftNumber < 0) {
                System.out.println("Shift number cannot be negative. Setting to 0.");
                shiftNumber = 0;
            } else if (shiftNumber > 94) {
                System.out.println("Shift number too large. Reducing to 94.");
                shiftNumber = 94;
            }

            // Provide the user with options to encrypt, decrypt, or exit
            System.out.print("\nPlease choose an option:\n1. Encrypt a string\n2. Decrypt a string\n3. Exit\n\n<#> ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            // Perform the corresponding action based on user input
            switch (choice) {
                case 1:
                    encrypt(userText, shiftNumber);
                    break;

                case 2:
                    decrypt(userText, shiftNumber);
                    break;

                case 3:
                    System.out.println("\nEx!t!ng......");
                    break;

                // Handle invalid option selection
                default:
                    System.out.println("\n[invalid option]");
            }
        } while (choice != 3); // Repeat the loop until the user selects exit
    }
}