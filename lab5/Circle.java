import java.awt.Graphics;
import java.util.*;
import java.io.*;
import java.lang.*;

abstract class Shape {
    protected String name;
    protected int x, y;

    public Shape(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName(){
        return this.name;
    }
    public abstract float calculateArea();
} 

interface Actable {
    public void moveTo(Graphics g, int x, int y);
    public void fill(Graphics g);
}

public class Circle extends Shape implements Actable{
    private double radius;
    public Circle(String name, int x, int y, double radius){
        super(name, x, y);
        this.redius = radius;
    }

    public float calculateArea(){
        return 3.14 * radius * radius;
    }

    public void draw(Graphics g){
        System.out.println("Draw circle.");
        g.drawOval(x, y, 2*radius, 2*radius);
    }

    public void moveTo(Graphics g, int dx, int dy){
        x += dx;
        y += dy;
        draw(g);
    }

    public void fill(Graphics g){
        System.out.println("Fill circle.");
        g.fillOval(x, y, 2*radius, 2*radius);
    }

    public static void main(String[] args){
        Circle circle = new Circle("dang", 1, 2, 3);
    }
}


