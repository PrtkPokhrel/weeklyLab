package Week3;
import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Input class and object
        Random random = new Random(); // creating random object name random
        String usrInput; // Stores user input
        Integer computer; // Stored 3 random numbers (0, 1, 2) representing rock, paper, scissors
        computer = random.nextInt(3); // in action storing random value
        Integer a = 0;
        Integer b = 1;
        Integer c = 2;
        String r = "R";
        String p = "P";
        String s = "S";

        System.out.print("Enter 'R' for Rock, 'S' for Scissors, and 'P' for Paper: ");
        usrInput = scan.nextLine();

        switch (usrInput) {
            case "R":
                System.out.println("You entered Rock");
                break;
            case "P":
                System.out.println("You entered Paper:");
                break;
            case "S":
                System.out.println("You entered Scissors:");
                break;
        }

  
        String computerChoice = "";
        switch (computer) {
            case 0:
                computerChoice = "Rock";
                break;
            case 1:
                computerChoice = "Paper";
                break;
            case 2:
                computerChoice = "Scissors";
                break;
        }

        System.out.println("Computer chose: " + computerChoice);

        // Win Computer
        if ((computer.equals(a) && usrInput.equals(s)) || (computer.equals(b) && usrInput.equals(r)) || (computer.equals(c) && usrInput.equals(p))) {
            System.out.println("Computer Wins");
        } 
        // Win User
        else if ((usrInput.equals(r) && computer.equals(c)) || (usrInput.equals(p) && computer.equals(a)) || (usrInput.equals(s) && computer.equals(b))) {
            System.out.println("You Win");
        } 
        // Tie
        else if (computer.equals(a) && usrInput.equals(r) || computer.equals(b) && usrInput.equals(p) || computer.equals(c) && usrInput.equals(s)) {
            System.out.println("It's a Tie!");
        }

        scan.close();
    }
}
