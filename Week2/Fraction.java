// 5) Fraction

// Write an application that prompts and reads the numerator and denominator of a fraction as integers and then prints the decimal equivalent of the fraction.

package Week2;
import java.util.Scanner;
public class Fraction{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int numerator,denominator;
        double result;
        System.out.print("Enter numerator: ");
        numerator=scan.nextInt();
        System.out.print("Enter denominator: ");
        denominator=scan.nextInt();
        result=numerator/denominator;
        System.out.print("The result is " +result+"\t");


        scan.close();

    }
}