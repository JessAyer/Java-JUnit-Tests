package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import grandStrandSystems.Contact;
import grandStrandSystems.ContactService;

class ContactServiceTest {
	
	//test contactService
	ContactService testContact = new ContactService();
	
	// Test addContact
	@Test
	void testAddContact() {
		
		//add contacts for testing
		Contact contact1 =new Contact("5", "Bob", "Jones", "0000000000", "4321 6th street");
		ContactService.contactList.add(contact1);
		
		Contact contact2 =new Contact("5", "George", "Jones", "0000000000", "4321 6th street");
		ContactService.contactList.add(contact2);
		
		ContactService.addContact("John", "Smith", "0000000000", "1234 Main Street");
		
		ContactService.addContact("Jane", "Doe", "0000000001", "1234 Main Street");
		ContactService.addContact("Sally", "Miller", "0000000001", "1234 Main Street");
		ContactService.addContact("Holly", "Black", "0000000001", "1234 Main Street");
		
		assertTrue(ContactService.contactList.get(5).getContactId().equals("7"));
		assertTrue(ContactService.contactList.get(5).getFirstName().equals("Jane"));
		assertTrue(ContactService.contactList.get(5).getLastName().equals("Doe"));
		assertTrue(ContactService.contactList.get(5).getPhoneNumber().equals("0000000001"));
		assertTrue(ContactService.contactList.get(5).getAddress().equals("1234 Main Street"));
	}
	
	// Tests deleteContact
	@Test
	void testDeleteContact() {
		ContactService.addContact("Betsy", "White", "8888888888", "111 1t street");
		ContactService.addContact("Bob", "Jones", "0000000000", "4321 6th street");

		ContactService.deleteContact("2");
		assertTrue(ContactService.contactList.size() == 2);
	}
	// Tests updateFirstName
	@Test
	void testUpdateFirstName() {
		ContactService.updateFirstName("3", "Julie");
		assertTrue(ContactService.contactList.get(1).getFirstName().equals("Julie"));
	}

	// Tests updateLastName
	@Test
	void testUpdateLastName() {
		Contact contact1 =new Contact("1", "Beth", "Smith", "0000000000", "123 1st street");
		ContactService.contactList.add(contact1);
		ContactService.updateLastName("1", "Thomas");
		assertTrue(ContactService.contactList.get(0).getLastName().equals("Thomas"));
	}
	
	//Test updatePhoneNumber
	@Test
	void testUpdatePhoneNumber() {
		ContactService.updatePhoneNumber("1", "0123456789");
		assertTrue(ContactService.contactList.get(0).getPhoneNumber().equals("0123456789"));
	}
	
	//Tests updateAddress
	@Test
	void testUpdateAddress() {
		ContactService.updateAddress("1", "1111 5th Avenue");
		assertTrue(ContactService.contactList.get(0).getAddress().equals("1111 5th Avenue"));
	}
}
