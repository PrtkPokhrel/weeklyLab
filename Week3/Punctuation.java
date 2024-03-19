// design and implement a program that counts the number of punctuation marks in the following string “mary had a little lamb, her fleece was as white as snow, and everywhere mary went, the lamb was sure to go.
// -that was a nice poem-
// the end.
// ”. 
// produce a table that shows how many times each symbol occurred.


package Week3;

public class Punctuation{

public static void main(String[] args){  //Main method

// Start here;

int comma=0;
int fullStop=0;
int side=0;
int dqm=0; //double quotation mark
String sentence=" “mary had a little lamb, her fleece was as white as snow, and everywhere mary went, the lamb was sure to go. -that was a nice poem- the end.";

//For loop starts here

for(int i=0;i<sentence.length();i++){
   char a=sentence.charAt(i);  //charAt return the indexed strng from the varibale according to the strng  number: 

	if(a==','){
      
    comma++;

	}
	else if(a=='.'){
     fullStop++;

	}
	
	else if(a=='-'){

		side++;
	}
	else if(a=='"'){
	  dqm++;	
	}

	
} //for ends



System.out.println("Number of commas: " + comma);
System.out.println("Number of full stops: " + fullStop);
System.out.print("There are " +side+" number of side");
 




} // main method ends here
} // class ends here
