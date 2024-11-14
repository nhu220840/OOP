package Labwork4;

public class Cylinder extends Circle{
    private float h;

    Cylinder(float x, float y, float r, float h){
        super(x, y, r);
        this.h = h;
    }
    
    public float getH(){
        return h;
    }

    public float calArea(){
        return 2 * super.pi * super.r * this.h + 2 * super.pi * super.r * super.r;
    }

    public float calVolume(){
        return super.pi * super.r * super.r * this.h;
    }

    public String getName(){
        return "Cylinder";
    }

    public String toString() {
        return getName() + ": (" + getX() + ", " + getY() + ", " + getR() + ", " + getH() + ") | Area: " + calArea() + " | Volume: " + calVolume();
    }
}
