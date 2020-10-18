package GuestBook;

public class Contact implements Comparable<Contact>{
    private String firstName,lastName,address,phoneNumber;

    public Contact(String firstName,String lastName,String address,String phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }

    @Override
    public int compareTo(Contact o) {
        int result=this.firstName.compareTo(o.firstName);
        if(result==0){
            result=this.lastName.compareTo(o.lastName);
        }
        if(result==0){
            result=this.address.compareTo(o.address);
        }
        if(result==0){
            result=this.phoneNumber.compareTo(o.phoneNumber);
        }
        return result;
    }
}
