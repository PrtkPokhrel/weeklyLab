/*Write a Java program that prints a table with a list of at least 5 students together with their grades earned (lab points, bonus points, and the total) in the format below. 

///////////////////\\\\\\\\\\\\\\\\\\\
==          Student Points          ==
\\\\\\\\\\\\\\\\\\\///////////////////

Name            Lab     Bonus   Total
----            ---     -----   -----
Joe             43      7       50
William         50      8       58
Mary Sue        39      10      49

The requirements for the program are as follows: 

1.	Print the border on the top as illustrated (using the slash and backslash characters). 
2.	Use tab characters to get your columns aligned and you must use the + operator both for addition and string concatenation. 
3.	Make up your own student names and points—the ones shown are just for illustration purposes. You need 5 names. */



package Week2;
public class Students_Grades{

    public static void main(String[] args){
   System.out.print("/////////////////");
   System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
   System.out.print("\n == \t Student Points \t ==\n");
   System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
   System.out.print("///////////////////\n");

   System.out.print("Name \t Lab    Bonus    Total\n");
   System.out.print("--- \t  ---     ---      ---\n");
   System.out.print("Joe \t  43     7         50\n");


  

    }
}




