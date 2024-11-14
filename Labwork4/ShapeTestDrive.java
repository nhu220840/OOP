package Labwork4;

import java.util.ArrayList;

public class ShapeTestDrive {
    public static void main(String[] args) {
        ArrayList<Shape> listObj = new ArrayList<Shape>();
        Shape point = new Point(1, 2);
        Shape circle = new Circle(1, 2, 3);
        Shape cylinder = new Cylinder(1, 2, 3, 4);
        listObj.add(point);
        listObj.add(circle);
        listObj.add(cylinder);

        for(Shape it : listObj){
            System.out.println(it);
        }
    }
}
