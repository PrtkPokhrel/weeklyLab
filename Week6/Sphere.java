// Design and implement a class called Sphere that contains instance data that represent a sphere’s diameter.
// -   Define a Sphere constructor to accept and initialize the diameter.
// -   Include getter and setter methods for the diameter.
// -   Include methods to calculate and return the volume and surface area of the sphere.
// -   Include a toString method that returns a one-line description of the sphere.
// -   Create a driver class (main class) called MultiSphere, whose main method instantiates and updates several Sphere objects.

// V = 4/3 π r³
// S=4 pie r squre

package Week6;
import java.util.Scanner;
import java.lang.Math;
public class Sphere {
    private int sphereDiameter;

    public Sphere() {
        sphereDiameter=2 ;
    }

    public int getValue() {
        return sphereDiameter;
    }

    public int setValue(int values) {
        this.sphereDiameter = values;
        return values;
    }
    public double result(int diameter,double pie ){
        double radius=diameter/2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public double surface(int diameter,double pie){
        double radius = diameter / 2.0;
        return 4 * Math.PI * Math.pow(radius, 2);

    }

    public String toString() {
        return "Sphere diameter " + sphereDiameter + ", Volume: " + result(sphereDiameter, Math.PI) + ", Surface Area: " + surface(sphereDiameter, Math.PI);
    }
    
    public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 Sphere obj=new Sphere();
 int temDiameter;
 System.out.print("Enter the diameter of the sphere: ");
 temDiameter=scan.nextInt();
 double pie=Math.PI;
 obj.setValue(temDiameter);
 obj.result(temDiameter, pie);
 obj.surface(temDiameter, pie);
 System.out.println(obj.toString());

 scan.close();
    }
}
