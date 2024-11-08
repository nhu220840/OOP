package Labwork4;

public class Point extends Shape{
    protected float x;
    protected float y;

    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public float calArea(){
        return 0;
    }

    public float calVolume(){
        return 0;
    }

    public String getName(){
        return "Point";
    }

    public String toString() {
        return getName() + ": (" + getX() + ", " + getY() + ") | Area: " + calArea() + " | Volume: " + calVolume();
    }

    
}
