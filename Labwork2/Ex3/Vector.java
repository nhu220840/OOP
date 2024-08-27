package Labwork2.Ex3;

public class Vector {
    private int x, y;

    public Vector() {

    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Vector add(Vector v2) {
        Vector tmp = new Vector();
        tmp.x = this.x + v2.x;
        tmp.y = this.y + v2.y;
        return tmp;
    }

    public Vector subtract(Vector v2) {
        Vector tmp = new Vector();
        tmp.x = this.x - v2.x;
        tmp.y = this.y - v2.y;
        return tmp;
    }

    public int multiply(Vector v2) {
        return v2.x * this.x + v2.y * this.y;
    }

    public String displayVector() {
        return "(" + this.x + "," + this.y + ")";
    }
}
