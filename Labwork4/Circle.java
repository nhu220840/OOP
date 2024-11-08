package Labwork4;

public class Circle extends Point{
    protected float r;
    protected float pi = (float)Math.PI;

    Circle(float x, float y, float r){
        super(x, y);
        this.r = r;
    }

    public float getR(){
        return r;
    }

    public float calArea(){
        return this.pi * r * r;
    }

    public float calVolume(){
        return 0;
    }

    public String getName(){
        return "Circle";
    }

    public String toString() {
        return getName() + ": (" + getX() + ", " + getY() + ", " + getR() + ") | Area: " + calArea() + " | Volume: " + calVolume();
    }
}