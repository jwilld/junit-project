import java.util.*;

public class ContactService {
    // ids start at 1000
    private static int ID = 1000;
    public static List<Contact> contactList = new ArrayList<Contact>();

    public static void addContact(String firstName, String lastName, String phone, String address) {
        // uses the ID for the new contact
        String contactID = String.valueOf(ID);
        Contact newContact = new Contact(contactID, firstName, lastName, phone, address);
        contactList.add(newContact);
        // each time an ID is added, the ID increments
        ID = ID + 1;
    }

    // finds index for contact. If found it returns the index, if not it returns -1.
    public static int findContact(String ID) {
        int contactIndex = -1;

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getID().equals(ID)) {
                contactIndex = i;
            }
        }
        return contactIndex;
    }

    public static void removeContact(String ID) {
        String targetID = getContactID(ID);

        if (targetID != null) {
            int contactIndex = findContact(ID);
            contactList.remove(contactIndex);
        }

    }

    // checks if contact ID exists
    public static String getContactID(String ID) {
        if (findContact(ID) == -1) {
            ID = null;
        }
        return ID;
    }

    // update Contact class values
    public static void updateFirstName(String ID, String firstName) {
        String targetID = getContactID(ID);

        if (targetID != null) {
            int contactIndex = findContact(ID);
            contactList.get(contactIndex).firstName = firstName;
        }
    }

    public static void updateLastName(String ID, String lastName) {
        String targetID = getContactID(ID);

        if (targetID != null) {
            int contactIndex = findContact(ID);
            contactList.get(contactIndex).lastName = lastName;
        }
    }

    public static void updatePhone(String ID, String phone) {
        String targetID = getContactID(ID);

        if (targetID != null) {
            int contactIndex = findContact(ID);
            contactList.get(contactIndex).phone = phone;
        }
    }

    public static void updateAddress(String ID, String address) {
        String targetID = getContactID(ID);

        if (targetID != null) {
            int contactIndex = findContact(ID);
            contactList.get(contactIndex).address = address;
        }
    }
}