package Labwork2.Ex1_rm;

public class NameCard {
    private String name;
    private String phoneNumber;
    private String email;

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    // public void setName(String name){
    //     this.name = name;
    // }
    
    // public void setPhoneNumber(String phoneNumber){
    //     this.phoneNumber = phoneNumber;
    // }

    // public void setEmail(String email){
    //     this.email = email;
    // }

    public NameCard(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
