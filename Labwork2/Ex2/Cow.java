package Labwork2.Ex2;

public class Cow {
    private String name, breed;
    private int age;

    public Cow() {

    }

    public Cow(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void moo() {
        System.out.println("Moo...!");
    }

    // public void output(Cow cow) {
    //     System.out.println("Name: " + cow.getName() + "\nBreed: " + cow.getBreed() + "\nAge: " + cow.getAge() + "\n");
    // }
}
