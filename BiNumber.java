package javaapplication1;

public class BiNumber {

    private int x, y;

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
    

    BiNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int add() {
        return x + y;
    }

    int multiply() {
        return x * y;
    }

    public void doubleValue() {
        this.x*=2;
        this.y*=2;
    }
}
