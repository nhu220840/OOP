package Labwork4;

public class Testprogram {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(1, 2, 3, 4);
        System.out.println("The area of cylinder: " + obj.calArea());
        System.out.println("The volume of cylinder: " + obj.calVolume());
        System.out.println(obj.getName());
    }
}
