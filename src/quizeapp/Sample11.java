package quizeapp;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample11 {



	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Project player = new Project(); // Assuming your class is Player instead of Project
	        System.out.println("Enter Your Name:");
	        player.SetName(sc.nextLine());
	        System.out.println("Enter Your Address:");
	        player.Setaddress(sc.nextLine());
	        System.out.println("Enter Your Email:");
	        player.SetEmail(sc.nextLine());
	        System.out.println("Enter Your PhoneNo:");
	        player.SetPhoneNo(sc.nextLine());
	        System.out.println("Enter Your Age:");
	        player.Setage(sc.nextInt());
	        sc.nextLine();
	        System.out.println("\nWelcome, " + player.getName() + "!");
	        System.out.println("From: " + player.getaddress());
	        System.out.println("Age: " + player.getage());
	        System.out.println("Email: " + player.getEmail());
	        System.out.println("Phone No: " + player.getPhoneNo());
	        System.out.println("\nAre you ready to start the Quiz? (yes/no):");
	        String ready = sc.nextLine();
	        if (!ready.equalsIgnoreCase("yes")) {
	            System.out.println("Game is terminated!");
	            System.exit(0);
	        }
	        System.out.println("Welcome to the Quiz Game!");
	        System.out.println("RULES:");
	        System.out.println("1. There will be 3 questions, each with 4 options.");
	        System.out.println("2. You must choose the correct answer (1-4) for each question.");
	        System.out.println("3. Each correct answer rewards $1000.");
	        System.out.println("4. If you answer a question incorrectly, the game will end.");
	        System.out.println("5. No lifelines are allowed in this quiz.");
	        String[] questions = {
	            "What is the size of the int data type in java?",
	            "What is the superclass of all classes in Java?",
	            "Which of the following is not a Java keyword?",
	            "which methods is used to print text in java?",
	            "what is the entry point of java program?",
	            "how is memory for objects allocated in java?",
	            "What is the default value of a boolean variable in Java?",
	            "Which of the following is not a primitive data type in Java?",
	            "Which method is used to start a thread in Java?",
	            "Which keyword is used to prevent a class from being subclassed?",
	        };

	        String[][] options = {
	            {"1. 4 bytes", "2. 8 bytes", "3. 2 bytes", "4. 16 bytes"},
	            {"1. Object", "2. Class", "3. Parent", "4. Main"},
	            {"1. static", "2. void", "3. null", "4. unsigned"},
	            {"1.print()","2.console.log()","3.System.out.print()","4.echo()"},
	            {"1.main()","2.start()","3.run()","4.begin()"},
	            {"1.stack()","2.heap()","3.data segment","4.register"},
	            {"1. true", "2. false", "3. 0", "4. null"},
	            {"1. int", "2. char", "3. float", "4. String"},
	            {"1. run()", "2. start()", "3. begin()", "4. execute()"},
	            {"1. static", "2. final", "3. abstract", "4. extends"},
	               
	            
	        };

	        int[] correctAnswers = {1, 1, 4,3,1,2,2,2,2,3}; 

	        int reward = 1000;
	        int totalAmountWon = 0;
	        boolean lifelineUsed = false; 

	        for (int i = 0; i < questions.length; i++) {
	            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
	            for (String option : options[i]) {
	                System.out.println(option);
	            }

	            System.out.println("Do you want to use your 50-50 lifeline? (yes/no)");
	            String useLifeline = sc.nextLine();

	            if (!lifelineUsed && useLifeline.equalsIgnoreCase("yes")) {
	                lifelineUsed = true;
	                options[i] = removeIncorrectAnswers(options[i], correctAnswers[i]);
	                System.out.println("You have used your 50-50 lifeline!");
	                for (String option : options[i]) {
	                    System.out.println(option);
	                }
	            }

	            boolean validAnswer = false;
	            int answer = -1;
	            while (!validAnswer) {
	                try {
	                    System.out.print("Enter your answer (1-4): ");
	                    answer = sc.nextInt();
	                    sc.nextLine(); 
	                    if (answer < 1 || answer > 4) {
	                        throw new InputMismatchException("Answer must be between 1 and 4.");
	                    }
	                    validAnswer = true;
	                }catch (InputMismatchException e) {
	                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
	                    sc.nextLine(); 
	                }
	            }

	            if (answer == correctAnswers[i]) {
	                totalAmountWon += reward;
	                System.out.println("Correct! You earned $" + reward + ". Total: $" + totalAmountWon);
	            } else {
	                System.out.println("Wrong answer! You won $" + totalAmountWon);
	                return; 
	            }
	        }

	        System.out.println("\nCongratulations, " + player.getName() + "! You completed the quiz.");
	        System.out.println("Total amount won: $" + totalAmountWon);
	    }

	    private static String[] removeIncorrectAnswers(String[] options, int correctAnswer) {
	        String[] updatedOptions = new String[2]; 
	        updatedOptions[0] = options[correctAnswer - 1]; 
	        int incorrectOptionCount = 0;
	        for (int i = 0; i < options.length; i++) {
	            if (i != correctAnswer - 1 && incorrectOptionCount < 1) {
	                updatedOptions[1] = options[i]; 
	                incorrectOptionCount++;
	            }
	        }
	        return updatedOptions; 
	    }
	}
               else
{
	System.exit(0);
}
}

	
  

	        
	       

	        	