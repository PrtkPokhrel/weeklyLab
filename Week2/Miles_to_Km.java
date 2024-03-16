// 3) Miles to Kilometers 

// Write an application that converts miles to kilometers.(One mile equals 1.60935 km). Read the miles from the user as a floating point value.
package Week2;
import java.util.Scanner;
public class Miles_to_Km{
public static void main(String[] args){
    double mile=1.60935;//km
    double result;
    Scanner scan =new Scanner(System.in);

    System.out.print("Enter the Miles you want to convert: ");
    double userMiles=scan.nextDouble();
     
    result=mile*userMiles;
    System.out.println(userMiles+" miles is equals to "+result+" km");
    scan.close();



}
}