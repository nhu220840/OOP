package Labwork2.Ex5;

import java.util.Scanner;

public class ButtonTestDrive {
    public static void main(String[] args) {
        Button btn = new Button("Submit", "blue");
        System.out.println(btn.label + " " + btn.color);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the color you want to change: ");
        String newColor = scanner.nextLine();
        btn.setColor(newColor);
        System.out.println(btn.label + " " + btn.color);

        System.out.print("Enter the label you want to change: ");
        String newLabel = scanner.nextLine();
        btn.setLabel(newLabel);
        System.out.println(btn.label + " " + btn.color);

        btn.dePress();
        btn.unDepress();

        scanner.close();
    }
}
