
// 2) Dice

// Write a program that simulates rolling two dice using the following steps:
//     1. Prompt the user for the number of sides for two dice.
//     2. “Roll” the dice three times by generating a random number between 1 (inclusive) and the number of sides (inclusive).
//     3. Keep track of the sum of the rolls for each die and output the sum and average for each die.


package Week4;
import java.util.Scanner;
import java.lang.Math;

public class Dice{

	public static void main(String[] args){

		//Starts here
		Scanner scan=new Scanner(System.in);
		double numberDice1;
		int numberDice2;
		double rndom1;
		double count1=0.0;
		double count2=0.0;
		double rndom2;


		System.out.print("Enter the number for dice1: ");
		numberDice1=scan.nextInt();


		System.out.print("Enter the number for dice 2: ");
		numberDice2=scan.nextInt();


		for (int i=0;i<=3;i++){

			rndom1=Math.random();
			rndom1=rndom1*numberDice1;
			rndom1=Math.floor(rndom1);
			rndom1=rndom1+1;
			count1=count1+rndom1;

				System.out.println(rndom1);
		}
		System.out.println("Dice 1 ends here");

		for (int i=0;i<=3;i++){

			rndom2=Math.random();
			rndom2=rndom2*numberDice2;
			rndom2=Math.floor(rndom2);
			rndom2=rndom2+1;

			count2=count2+rndom2;

				System.out.println(rndom2);
		}
		System.out.println("Dice1:"+count1);
		System.out.println("Dice2:"+count2);


		scan.close();



	} //main method ends here

} //class Diceeends here
