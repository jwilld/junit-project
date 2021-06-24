import static org.junit.Assert.*;

import org.junit.Test;


public class ContactTest {
	String ID = "12345";
	String firstName = "john";
	String lastName = "wayne";
	String phone = "1112224444";
	String address = "101 1st Street";
	

    @Test
    public void testContactClass() {
        Contact contact = new Contact(ID, firstName, lastName, phone, address);
    	// test that class is instantiated correctly
        assertEquals(contact.getID(),ID);
        assertEquals(contact.getFirstName(),firstName);
        assertEquals(contact.getLastName(),lastName);
        assertEquals(contact.getPhone(),phone);
        assertEquals(contact.getAddress(),address);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testIDTooLong() {
        ID = "10103010101";
        // test if ID is too long
        new Contact(ID, firstName, lastName, phone, address);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testIDNull(){
        ID = null;
        // test if ID is not null
        new Contact(ID, firstName, lastName, phone, address);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testFirstNameTooLong() {
        firstName = "johnawanatongahan";
        
        new Contact(ID, firstName, lastName, phone, address);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testFirstNameNull() {
        firstName =  null;
        new Contact(ID, firstName, lastName, phone, address);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testLastNameTooLong() {
        lastName ="banawanakanahanna";
        new Contact(ID, firstName, lastName, phone, address);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testLastNameNull() {
        lastName = null;
        new Contact(ID, firstName, lastName, phone, address);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testPhoneTooLong() {
        phone =  "11122244441";
        new Contact(ID, firstName, lastName, phone, address);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testPhoneTooShort() {
        phone =  "111222444";
        new Contact(ID, firstName, lastName, phone, address);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testPhoneNull() {
        phone =  null;
        new Contact(ID, firstName, lastName, phone, address);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testAddressTooLong() {
        address = "13122 The Heights of Westerly Place Drive, Westward, Virginia";
        new Contact(ID, firstName, lastName, phone, address);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testAddressNull() {
       address = null;
       new Contact(ID, firstName, lastName, phone, address);
    }
}