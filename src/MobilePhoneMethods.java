package JavaClasses;

import java.util.ArrayList;

public class MobilePhoneMethods {
    public static ArrayList<Contact> contact=new ArrayList<Contact>();
    public static String myNumber;
    
    public static boolean addNewContact(Contact contact1) {
    	if(findContact(contact1)>=0) {
    		return false;
    	}
    	return true;
    }
    
    public static int findContact(Contact newContact) {
    	return contact.indexOf(newContact);
    }
    
    public static int findContact(String name) {
    	
    }
    
    public static boolean removeContact(Contact contact1) {
    	if(findContact(contact1)>=0) {
    		return false;
    	}
    	return true;
    }
}
