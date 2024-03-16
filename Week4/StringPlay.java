
//1) Using String Objects

//Fill in the blanks in the program below as follows: 

//(a) 	declare the variable town as a reference to a String object and initialize it to "Anytown, UK".
//(b) 	write an assignment statement that invokes the length method of the string class to find the length of the college String object and assigns the result to the stringLength variable
//(c) 	complete the assignment statement so that change1 contains the same characters as college but all in upper case
//(d) 	complete the assignment statement so that change2 is the same as change1 except all lowercase “e's” are replaced with the asterisk (*) character.
//(e) 	complete the assignment statement so that change3 is the concatenation of college and town (use the concat method of the String class rather than the + operator) 

//// **************************************************
////   StringPlay.java
////
////   Play with String objects
//// **************************************************
//public class StringPlay
//{
//   public static void main (String[] args)
//   {
//      String college = new String ("Leeds Beckett University"); //Similar for part (a)

//      ________________________________________________________; // part (a)

//      int stringLength;
//      String change1, change2, change3; 

//      ________________________________________________________; // part (b)

//      System.out.println (college + " contains " + stringLength + " characters.");

//      change1 = ______________________________________________; // part (c)

//      change2 = ______________________________________________; // part (d)

//      change3 = ______________________________________________; // part (e)

//      System.out.println ("The final string is " + change3);
//    }
//}

//Sample Output:


//PoDunk College contains 14 characters.
//The final string is PoDunk CollegeAnytown, USA


package Week4;

public class StringPlay{

public static void main(String[] args){

// Start here;

String town= new String(" Anytown UK");
Integer stringLength;
String college= new String("Leeds Becket Universilty");
String change1;
StringBuilder change2=new StringBuilder();
String change3=new String();
//Declaration ends here

stringLength=college.length();
change1=college.toUpperCase();
change3=college.concat(town);


for(int i=0; i<change1.length();i++){
	char a= change1.charAt(i);
	

   if(a=='E'){
	 change2.append("*");
	}
    
   else{
	   change2.append(a);

   }

}


System.out.println(change1);
System.out.println(change2);
System.out.println(change3);

	




}//main method ends here


} // Class ends here
