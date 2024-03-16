// 4) Square Calculations

// Write an application that prompts for and reads integer representing the length of a square’s side, then prints the square’s perimeter and area.


package Week2;
import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        int resultPerimeter,resultArea;
    Scanner scan =new Scanner(System.in);
    System.out.print("Enter the length of the square: ");
    int length=scan.nextInt();

    resultPerimeter=length*4;
    resultArea=length*length;
    System.out.println("The permimeter of your square is "+ resultPerimeter+"cm ");
    System.out.println("The area of your square is "+ resultArea+"square cm");
    scan.close();
    }
}