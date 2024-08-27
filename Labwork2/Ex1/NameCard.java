package Labwork2.Ex1;

public class NameCard {
    private String name, phone, email;

    public NameCard() {

    }

    public NameCard(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void output(NameCard card) {
        System.out.println("Name: " + card.getName() + "\nPhone: " + card.getPhone() + "\nEmail: " + card.getEmail() + "\n");
    }

}