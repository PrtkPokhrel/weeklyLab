
// 2) Computing Averages
// The following program reads three integers and prints the average. Fill in the blanks so that it will work correctly. 

// // *******************************************************************
// //   Average.java
// //
// //   Read three integers from the user and print their average
// // *******************************************************************

// import java.util.Scanner;
// public class Average
// {
//     public static void main(String[] args)
//     {
//        int val1, val2, val3;
//        double average;
//        Scanner scan = new Scanner(System.in) ;

//        // get three values from user
//        System.out.println("Please enter three integers and " +
//                        "I will compute their average");

//        ____________________________________

//        ____________________________________

//        ____________________________________

//        //compute the average

//        ____________________________________

//        //print the average

//        ____________________________________

//     }
// }

// Sample Output

// Please enter three integers and I will compute their average.
// Enter the first value: 5
// Enter the second value: 2
// Enter the third value: 7
// The average is 4.666666666666667.


package Week2;
import java.util.Scanner;
public class Computing_Average{
    public static void main(String[] args){
        int num1,num2,num3;
        double average;
        Scanner scan =new Scanner(System.in);

        System.out.println("Please enter three integers and I will compute their average.");

        System.out.print("Enter the first number: ");
        num1=scan.nextInt();
        System.out.print("Enter the second number: ");
        num2=scan.nextInt();
        System.out.print("Enter the third  number: ");
        num3=scan.nextInt();
        

        average=(num1+num2+num3)/3;
        System.out.println("The average is: "+average);
        scan.close();






    }
}

