import static org.junit.Assert.*;

import org.junit.Test;

public class ContactServiceTest{

    @Test
     public void testAddContact(){
         addTestContact();
         assertFalse(ContactService.contactList.isEmpty());
     }

    @Test 
    public void testUniqueID(){
        addTestContact();
        addTestContact();
        
        String firstContactID = ContactService.contactList.get(0).getID();
        String secondContactID = ContactService.contactList.get(1).getID();
        assertNotEquals(firstContactID,secondContactID);
    }

     @Test
     public void testRemoveContact(){
         addTestContact();

        String ID = getFirstID();
        ContactService.removeContact(ID);
        assertNull(ContactService.getContactID(ID));     
     }
     
     @Test
     public void testUpdateContact(){
         addTestContact();
         String ID = getFirstID();

         ContactService.updateFirstName(ID,"Jill");
         assertEquals(ContactService.contactList.get(0).getFirstName(), "Jill");

         ContactService.updateLastName(ID,"Long");
         assertEquals(ContactService.contactList.get(0).getLastName(),"Long");

         ContactService.updatePhone(ID, "2223334444");
         assertEquals(ContactService.contactList.get(0).getPhone(), "2223334444");

         ContactService.updateAddress(ID,"200 5th Drive");
         assertEquals(ContactService.contactList.get(0).getAddress(),"200 5th Drive");
     }


    private void addTestContact() {
         ContactService.addContact("John","Wayne","1112224444","101 1st Street");
    }

    private String getFirstID(){
        String firstID = ContactService.contactList.get(0).getID();
        return firstID;
    }
     
}
