import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Point {
    protected double x;
    protected double y;

    public Point(double x, double y){
        this.x = x; 
        this.y = y;
    }
    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }
    public abstract void getDetail();
}

abstract class ColorPoint extends Point {
    protected String color;

    public ColorPoint(double x, double y, String color){
        super(x, y);
        this.color = color;
    }
}

public class SimplePoint extends ColorPoint {
    public SimplePoint(double x, double y, String color){
        super(x, y, color);
    }

    public void getDetail(){
        System.out.println("x: " + x + ", y: " + y + ", color: " + color);
        super.move(10, -5);
        System.out.println("x: " + x + ", y: " + y + ", color: " + color);
    }
    public static void main(String[] args){
        SimplePoint p = new SimplePoint(15, 20, "black");
        p.getDetail();
    }
}
