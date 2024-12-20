package quizeapp;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Project p=new Project();
		System.out.println("enter ur name");
		String Name=sc.nextLine();
		p.SetName(Name);
		System.out.println("enter ur Address");
		String address=sc.nextLine();
		p.Setaddress(address);
		System.out.println("enter ur Email");
		String Email=sc.nextLine();
		p.SetEmail(Email);
		System.out.println("enter ur PhoneNo");
		String PhoneNo=sc.nextLine();
		p.SetPhoneNo(PhoneNo);
		System.out.println("enter ur age");
		int age=sc.nextInt();
		p.Setage(age);
		System.out.println("\nUser Information:");
        System.out.println("Name: " + p.getName());
        System.out.println("Address: " + p.getaddress());
        System.out.println("Email: " + p.getEmail());
        System.out.println("Phone No: " + p.getPhoneNo());
        System.out.println("Age: " + p.getage());
        System.out.println("\nRules of the Quiz:");
        System.out.println("Rule 1: You will be asked questions with 4 options.");
        System.out.println("Rule 2: You have 2 lifelines which can be used only once.");
        System.out.println("Rule 3: If you answer a question incorrectly, the game will end.");
        System.out.println("Rule 4: Correct answers earn you rewards.");
        String[] Questions = {
            "What is the size of the int data type in Java?",
            "What is the super class of all classes in Java?",
            "Which of the following is not a Java keyword?"
        };
        String[][] options = {
            {"1. 4 bytes", "2. 8 bytes", "3. 2 bytes", "4. 16 bytes"},
            {"1. Object", "2. Class", "3. Parent", "4. Main"},
            {"1. Static", "2. Void", "3. Null", "4. Unsigned"}
        };
        int[] correctAnswers = {1, 1, 4}; // Correct answer indexes (1-based)

        int reward = 1000;
        int totalAmountWon = 0;

        // Ask if the user is ready to start
        System.out.println("\nAre you ready to start the Quiz? (yes/no):");
        String ready = sc.nextLine();

        if (!ready.equalsIgnoreCase("yes")) {
            System.out.println("Game is terminated!");
            return; // Terminate if not ready
        }

        // Start the quiz
        for (int i = 0; i < Questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + Questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();
            sc.nextLine(); // Clear the buffer after reading int
            
            // Check if the answer is correct
            if (answer == correctAnswers[i]) {
                totalAmountWon += reward;
                System.out.println("Correct! You earned $" + reward + ". Total: $" + totalAmountWon);
            } else {
                System.out.println("Wrong answer! You won $" + totalAmountWon);
                return; // End the game if the answer is wrong
            }
        }

        // End of quiz
        System.out.println("\nCongratulations, " + p.getName() + "! You completed the quiz.");
        System.out.println("Total amount won: $" + totalAmountWon);
    }
}

		
				
	
		
		
		
		
		// TODO Auto-generated method stub

