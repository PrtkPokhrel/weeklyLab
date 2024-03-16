// ) Computing A Pay Increase

// File Salary.java contains most of a program that takes as input an employee's salary and a rating of the employee's performance and computes the raise for the employee. The performance rating here is being entered as a String—the three possible ratings are "Excellent", "Good", and "Poor". An employee who is rated excellent will receive a 6% raise, one rated good will receive a 4% raise, and one rated poor will receive a 1.5% raise. 

// Add the if... else... statements to program Salary to make it run as described above. Note that you will have to use the equals method of the String class (not the relational operator ==) to compare two strings.

// // ***************************************************************
// //   Salary.java
// //
// //   Computes the amount of a raise and the new
// //   salary for an employee.  The current salary
// //   and a performance rating (a String: "Excellent",
// //   "Good" or "Poor") are input.
// // ***************************************************************

// import java.util.Scanner;
// import java.text.NumberFormat;

// public class Salary
// {
//    public static void main (String[] args)
//    {
//        double currentSalary;  // employee's current  salary
//        double raise;          // amount of the raise
//        double newSalary;      // new salary for the employee
//        String rating;         // performance rating

//        Scanner scan = new Scanner(System.in);

//        System.out.print ("Enter the current salary: ");
//        currentSalary = scan.nextDouble();
//        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
//        rating = scan.next();

//        // Compute the raise using if ...

//        newSalary = currentSalary + raise;

//        // Print the results
//        NumberFormat money = NumberFormat.getCurrencyInstance();
//        System.out.println();
//        System.out.println("Current Salary:       " + money.format(currentSalary));
//        System.out.println("Amount of your raise: " + money.format(raise));
//        System.out.println("Your new salary:      " + money.format(newSalary));
//        System.out.println();
//     }
// }


// Sample Output:

// Enter the current salary: 53187.54
// Enter the performance rating (Excellent, Good, or Poor): Excellent

// Current Salary:       $53,187.54
// Amount of your raise: $3,191.25
// Your new salary:      $56,378.79




package Week3;
import java.util.Scanner;
public class Pay_Increase{
    public static void main(String[] args){

        double currentSalary,newSalary;                           
        double raise=0.0;

        String performance;
        // double raise;
        Scanner scan=new Scanner(System.in);  


        System.out.print("Enter the current salary: ");
        currentSalary=scan.nextDouble();
        
        scan.nextLine();    

        System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
        performance=scan.nextLine();



        if(performance.equals("Excellent")) { // use equals() to compare strings
          raise = currentSalary * 0.06;
      } else if(performance.equals("Good")) {
          raise = currentSalary * 0.04;
      } else if(performance.equals("Poor")) {
          raise = currentSalary * 0.015;
      }

        newSalary=currentSalary+raise;

        System.out.println("Your current salary is: "+currentSalary);
        System.out.println("Amount of your raise: "+raise);
        System.out.println("Your new salary: "+newSalary);

        
        scan.close();

    }
}

// Excellent=6%
// Good=4%
// Poor=1.5%


