package SecondClass;

//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
* Airline registration 
* 
* You are writing a program for a new airline to take their registration information at the check-in counter
* and print their boarding pass. You need to collect the following information: 
* 		First name 
* 		Last name
* 		Destination airport 
* 		Birthday (for security purposes) 
* 		Male/female (for security purposes) 
* 
* Print the boarding pass in this format:
* LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
* Traveling to: DESTINATION
* 
* Toolbox: main() method, JOptionPane.showInputDialog, variables
* 
**/
public class AirlineRegistration {
public static void main(String[] args) {
	String Name=JOptionPane.showInputDialog("What is ur name?");
    String LastName=JOptionPane.showInputDialog("What is ur Last name?");
    String Destination= JOptionPane.showInputDialog("Where are you traveling to");
    String Birthday= JOptionPane.showInputDialog("What is ur birthday?");
    String Gender= JOptionPane.showInputDialog("What is your Gender?");
    JOptionPane.showMessageDialog(null, Name + LastName +" " + "(" + Birthday + ", " + Gender + ")" + "." + " " + "Is Traveling to " + Destination);
}
}





