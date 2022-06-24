package grandStrandSystems;

/*
 * ------------------------------------------
 * Author: Jessica Ayer
 * Assignment: 6-1 Project 1
 * Course: SNHU CS 320:-T5681 22EW5
 * Instructor: Matthew McHann
 * Date: 06/12/2022
 * ------------------------------------------
 */

public class Contact {
	/*
	 * --------------------------
	 *     Instance variables
	 * --------------------------
	 */
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	/*
	 * --------------------------
	 *          Contact
	 * --------------------------
	 */
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		
		// checking contact requirements
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}

		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	/*
	 * --------------------------
	 *        Constructors
	 * --------------------------
	 */
	public String getContactId() {
		return contactId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
