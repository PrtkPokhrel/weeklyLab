// package Week4;
// import java.util.*;
// import java.lang.Math;

// public class Encrypt {
//     public static void main(String[] args) {
//         double random1 = 0;
//         double random2 = 0;
//         int usrInput;

//         // Generate 2 random numbers between 1000 and 65536
//         for (int i = 0; i < 2; i++) {
//             double random = Math.random();
//             random = 65536 * random;
//             random = Math.floor(random);
//             random = random + 1;
//             if (random <= 1000) {
//                 random = 1000 + random;
//             } 
// 			else {
// 			}
// 			random1 = random;
// 			random2 = random;
//         }

//         // User input
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter the number that you want to convert into hex digit: ");
//         usrInput = scan.nextInt();
//         String output = Integer.toHexString(usrInput);
//         output = output.toUpperCase();

//         // Output
//         System.out.println(random1 + output + random2);

//         scan.close();
//     }
// }

// -2 random number  between 1000 and 65536
// 4 pin by user
// convert to hex
// sandwich

package Week4;

import java.util.Scanner;
import java.lang.Math;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int usrPin;
		String output;
		double random;
		int min = 1000;
		int max = 65536;
		int[] randoms = new int[2];

		System.out.print("Enter the four digit pin: ");
		usrPin = scan.nextInt();

		output = Integer.toHexString(usrPin);
		output = output.toUpperCase();

		for(int i=0;i<2;i++){
		random=Math.random();
		random=random*1000;
		random=Math.floor(random);
		random=max+random;
		random=random+1;
		randoms[i]=(int)random;
		}

		System.out.println(randoms[0]+output+randoms[1]);

		
		

		scan.close();
	}
}