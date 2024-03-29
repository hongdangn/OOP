import java.lang.*;
import java.util.*;
import java.io.*;

class Shape {
    protected String name;

    public Shape(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public double calculateChuVi(){
        return 0.0;
    }
    public String getDetail(){
        return "Ten hinh " + name + ", chu vi la " + calculateChuVi();
    }
}

public class Triangle extends Shape {
    private double side;

    public Triangle(String name, double side){
        super(name);
        this.side = side;
    }
    public double calculateChuVi(){
        return 3 * side;
    }
    public String getDetail(){
        return super.getDetail() + ", dang nguyen.";
    }

    public static void main(String[] args){
        Triangle tri = new Triangle("dang", 3);
        System.out.println(tri.calculateChuVi());
        System.out.println(tri.getDetail());
    }
}
