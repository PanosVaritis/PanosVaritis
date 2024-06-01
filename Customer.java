public class Customer {
    private String firstName;
    private String lastName;
    private String emailAdd;
    private String address;

    public Customer (String firstName, String lastName, String emailAdd, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAdd = emailAdd;
        this.address = address;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmailAdd() {
        return emailAdd;
    }
    public String getAddress() {
        return address;
    }

    public String toString (){
        return "The first name is: "+getFirstName()+
                "\nThe last name is: "+getLastName()+
                "\nThe email address is: "+getEmailAdd()+
                "\nThe house address is: "+getAddress();
    }
}
