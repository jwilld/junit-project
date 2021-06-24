public class Contact {
    String ID;
    String firstName;
    String lastName;
    String phone;
    String address;
    // method to check is string is greater than a required length and is not null
    public String checkStringGreater(int length, String value, String type){
        if(value == null || value.length() > length ){
            throw new IllegalArgumentException("Invalid " + type);
        }
        else{
            return value;
        }
    }
    // check if string meets a required length and is not null
    public String checkStringEquals(int length, String value, String type){
        if((value == null) || (value.length() != length)){
            throw new IllegalArgumentException("Invalid " + type);
        }
        else{
            return value;
        }
    }
    // constructor
    public Contact(String ID, String firstName, String lastName, String phone, String address ){
        this.ID = checkStringGreater(10,ID,"ID");
        this.firstName = checkStringGreater(10,firstName,"firstName");
        this.lastName = checkStringGreater(10,lastName,"lastName");
        this.phone = checkStringEquals(10,phone,"phone");
        this.address = checkStringGreater(30,address,"address");
    }

    // return class values
    
    public String getID(){
        return ID;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }


}