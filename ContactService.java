package grandStrandSystems;

import java.util.ArrayList;

/*
 * ------------------------------------------
 * Author: Jessica Ayer
 * Assignment: 6-1 Project 1
 * Course: SNHU CS 320:-T5681 22EW5
 * Instructor: Matthew McHann
 * Date: 06/12/2022
 * ------------------------------------------
 */

public class ContactService {
	//Array to hold contacts
	public static ArrayList<Contact> contactList = new ArrayList<Contact>(999999999);

	/*
	 * --------------------------
	 *          Methods
	 * --------------------------
	 */
	
	//Add New Contact
	public static void addContact(String firstName, String lastName, String phoneNumber, String address) {
		String contactId = Integer.toString(contactList.size()+1);
		//generate unique id
		for (int i = 0; i < contactList.size(); i++) {
			if (contactId.compareTo(contactList.get(i).getContactId())==0) {
				int tempId = Integer.valueOf(contactId);
				++tempId;
				contactId = Integer.toString(tempId);
			}
		}
		// add contact
		Contact newContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
		contactList.add(newContact);
	}

	//delete contacts per contact ID
	public static void deleteContact(String contactId) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactId.compareTo(contactList.get(i).getContactId())==0) {
				contactList.remove(i);
			}
		}
	}
	
	//Update contact first name per contact Id
	public static void updateFirstName(String contactId, String firstName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactId.compareTo(contactList.get(i).getContactId())==0) {
				contactList.get(i).setFirstName(firstName);
			}
		}	
	}
	
	//Update contact last name per contact Id
		public static void updateLastName(String contactId, String lastName) {
			for (int i = 0; i < contactList.size(); i++) {
				if (contactId.compareTo(contactList.get(i).getContactId())==0) {
					contactList.get(i).setLastName(lastName);
				}
			}	
		}
	
		//Update contact phone number per contact Id
		public static void updatePhoneNumber(String contactId, String phoneNumber) {
			for (int i = 0; i < contactList.size(); i++) {
				if (contactId.compareTo(contactList.get(i).getContactId())==0) {
					contactList.get(i).setPhoneNumber(phoneNumber);
				}
			}	
		}
		
		//Update contact address per contact Id
		public static void updateAddress(String contactId, String address) {
			for (int i = 0; i < contactList.size(); i++) {
				if (contactId.compareTo(contactList.get(i).getContactId())==0) {
					contactList.get(i).setAddress(address);
				}
			}	
		}
}

