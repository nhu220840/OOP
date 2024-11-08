package Labwork4;

import java.util.ArrayList;

public class ShopTestDrive {
    public static void main(String[] args) {
        ArrayList<Point> listObj = new ArrayList<Point>();
        Point point = new Point(1, 2);
        Point circle = new Circle(1, 2, 3);
        Point cylinder = new Cylinder(1, 2, 3, 4);
        listObj.add(point);
        listObj.add(circle);
        listObj.add(cylinder);

        for(Point it : listObj){
            System.out.println(it);
        }
        
    }
}
