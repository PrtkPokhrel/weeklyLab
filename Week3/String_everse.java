/*Write a small program that prompts the user for a sentence and then outputs the same sentence with the characters in each word reversed. For example, if the user enters “This is a sample sentence.” then the output would be “sihT si a elpmas .ecnetnes.” Note the use of multiple Scanner objects may be helpful with this program.*/


package Week3;
import java.util.*;
public class String_everse{
	public static void main(String[] args){
 
    
Scanner scan =new Scanner(System.in);
String usrInput; 


System.out.print("Enter anything: " );
usrInput=scan.nextLine();

StringBuilder a =new StringBuilder(usrInput);
a.reverse();
System.out.println(a);





scan.close();

 
		

   	}
}

