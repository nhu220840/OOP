package Labwork2.Ex6;

public class Automobile {
    private static double fuel;
    private static double speed;
    private static String license;

    static void init(double f, double s, String l) {
        fuel = f;
        speed = s;
        license = l;
    }

    static void accelerate(double v) {
        if (fuel > 0)
            speed += v;
    }

    static void decelerate(double v) {
        if (fuel <= 0)
            speed -= v;
    }

    public double getFuel(){
        return fuel;
    }

    public double getSpeed(){
        return speed;
    }

    public String getLicense(){
        return license;
    }

    public static void main(String args[]) {
        Automobile test = new Automobile();
        init(4.5, 34, "29JAD");
        accelerate(4);
        decelerate(5);
        System.out.println("Fuel: " + test.getFuel());
        System.out.println("Speed: " + test.getSpeed());
        System.out.println("License: " + test.getLicense());
    }
}
