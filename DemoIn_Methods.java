/* Demo Input
V.Lu
September 13th, 2011
This java program shows how to get input from the user and save it into a variable.

*/
import java.util.Scanner; // input is not handled natively, must be imported 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoIn_Methods{
	// value being passed in is called the argument
	// the value the method expects is called the parameter
 
 public static boolean validateEmail(String email){
	 /* validation code */
	 
	 
//   Validate the e-mail based on certain rules that YOU would associate to e-mails
//   .2 or 4 letters
//   @ symbol
//   Something in front of the @
//   cannot contain spaces special characters: ; , / \
//   make it a smart checker	 
	 
	 return false; //The method END as soon as ONE return command is executed
 }
 
 // pass in values to the methods by the parameters
 public static int getAge(int yob, int currentYear){
	//local variable , works inside the method  
	int age = currentYear-yob;
	//done with the local variable, pass back the value to the main method 
	return age; // return will end the method
	 
 }
 //Not as good in terms of use 
 public static void showAge(int yob, int currentYear){
	 int age = currentYear-yob;
	 System.out.println(age);
 }
 
 //recall that void methods do not need a return 
 public static void splashScreen(){
	 System.out.println("*************");
	 System.out.println("****HVH******");
	 System.out.println("*Productions*");
	 System.out.println("****-_-******");
	 System.out.println("*************");
 }
 
 public static void main(String[] args){
  //Declaration of variables <type><identifier> 
  int yob, currentYear, age; // ouh. Multiple variable declarations ...
  String name;
  
  Scanner input=new Scanner(System.in); 
  splashScreen();
  System.out.println("Please enter your name");
  name=input.nextLine();
  System.out.println("Please enter your year of birth");
  yob=input.nextInt(); //returns the int read from the input stream
  System.out.println(getAge(yob,2015));
  
  System.out.println("Please enter your favourite number");

  int favnum = input.nextInt(); //returns the int read from the input stream
  input.nextLine(); //gets rid of the newline at the end of the integer
  
  System.out.println("Please enter your email:");
  String email=input.nextLine();
  System.out.println(validateEmail(email));
  System.out.println(validateEmail("mail@yahoo.com"));

  
  System.out.println(age);
  System.out.println(favnum);

  


  
  currentYear= 2016; 
  //System.out.println((int)(Math.random()*2010)+1); // RANDOM Number Generator from 1 to 2010
  age=currentYear-yob;
  
 
  System.out.println(name+"You are "+age+" years old.");
  System.out.println(email);
  
  
 }
}

 

