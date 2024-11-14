package Labwork2.Ex1_rm;

public class NameCardTestDrive {
    public static void main(String[] args) {
        NameCard nc = new NameCard("James", "123", "123@");
        // nc.setName("James");
        // nc.setEmail("123@");
        // nc.setPhoneNumber("123");
        System.out.println("name: " + nc.getName());
        System.out.println("phone: " + nc.getPhoneNumber());
        System.out.println("email: " + nc.getEmail());
    }
}
