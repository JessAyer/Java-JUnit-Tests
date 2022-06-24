package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import grandStrandSystems.Contact;

class ContactTest {

	@Test
	void testContact() {
		
		// Add Contact for testing
		Contact contact = new Contact("1", "John", "Smith", "0000000000", "1234 Main Street");
		
		assertTrue(contact.getContactId().equals("1"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhoneNumber().equals("0000000000"));
		assertTrue(contact.getAddress().equals("1234 Main Street"));
	}
	
	// Test for contactId too long
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("11111111111", "John", "Smith", "0000000000", "1234 Main Street");
		});

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Smith", "0000000000", "1234 Main Street");
		});
	}
	
	@Test
	void testContactFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Johnathan Jacob", "Smith", "0000000000", "1234 Main Street");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Smith", "0000000000", "1234 Main Street");
		});
	}
	
	@Test
	void testContactLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smithsonian-Apple", "0000000000", "1234 Main Street");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", null, "0000000000", "1234 Main Street");
		});
	}
	 
	@Test
	void testPhoneNumberWrongLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", "00000000001", "1234 Main Street");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", "000000000", "1234 Main Street");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", null, "1234 Main Street");
		});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", "0000000000","1234567890 Main Street, SanFransico California");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", "0000000000", null);
		});
	}
}
