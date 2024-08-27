package Labwork2.Ex3;

public class VectorTestDrive {
    public static void main(String[] args) {
        Vector v1 = new Vector(2, 3);
        Vector v2 = new Vector(4, 5);

        Vector additionalVector = v1.add(v2);
        Vector subtractionVector = v1.subtract(v2);
        int multiplicationVector = v1.multiply(v2);

        System.out.println(v1.displayVector() + " + " + v2.displayVector() + " = " + additionalVector.displayVector());
        System.out.println(v1.displayVector() + " - " + v2.displayVector() + " = " + subtractionVector.displayVector());
        System.out.println(v1.displayVector() + " * " + v2.displayVector() + " = " + multiplicationVector);
    }
}
