
// 5) Sphere Calculations

// Write and application that reads the radius of a sphere and prints its volume and surface area. Use the following formulas, where r represents the radius of the sphere. Print the output to four decimal places.

// Volume =  4πr3 / 3

// Surface area = 4πr2



package Week4;


import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;

  
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        
        System.out.printf("Volume of the sphere: %.4f\n", volume);
        System.out.printf("Surface area of the sphere: %.4f\n", surfaceArea);

      
        scanner.close();
    }
}
