package JavaClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

	public static Scanner obj=new Scanner(System.in);
	public static void main(String[] args) {
     int choice=0;
     System.out.println("Choose from the following options");
     displayMenu();
     System.out.println("Enter the choice number");
     choice=obj.nextInt();
     switch(choice) {
        case 1:
     }
	}
	
	public static void displayMenu() {
		System.out.println("Enter 1 to print all the contacts");
		System.out.println("Enter 2 to add new contact");
		System.out.println("Enter 3 to update a contact");
		System.out.println("Enter 4 to remove contact");
		System.out.println("Enter 5 to search for a contact");
	}

}
