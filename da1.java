package Shape;

import java.util.*;

class GeometricObject {
    String color;
    boolean filled;

    GeometricObject() {
        color = "White";
        filled = false;
    }

    GeometricObject(String s, boolean b) {
        color = s;
        filled = b;
    }

    boolean isFilled() {
        return filled;
    }

    String getColor() {
        return color;
    }

    void setColor(String s) {
        color = s;
    }

    void setFilled(boolean b) {
        filled = b;
    }
}

class Circle extends GeometricObject {
    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double d) {
        radius = d;
    }

    Circle(double d, String s, boolean f) {
        radius = d;
        color = s;
        filled = f;
    }

    void setRadius(double d) {
        radius = d;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    void printCircle() {
        System.out.println("Radius:" + radius);
    }
}

class Rectangle extends GeometricObject{
    double width,height;
    Rectangle(){
       width=height=1; 
    }
    Rectangle(double l,  double b){
       width=l;
        height=b;
    }
    Rectangle(double l,  double b,String s, boolean f){
       width=l;
        height=b;
        color=s;
        filled=f;
    }
    void setData(double l,  double b){
       width=l;
        height=b;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return 2*(width+height);
    }
    void printRectangle(){
        System.out.println("Width:"+width);
        System.out.println("Height:"+height);
    }
}

// Import Shape.*;

public class da1 {
    public static void main(String args[]) {
        Circle c1 = new Circle();
        c1.setRadius(3.2);
        System.out.println("Circle Object 1");
        c1.printCircle();
        System.out.println("Area:" + c1.getArea());
        System.out.println("Perimeter:" + c1.getPerimeter());
        System.out.println("Color:" + c1.getColor());
        System.out.println("Filled:" + c1.isFilled());
        Circle c2 = new Circle(2.0);
        c1.setRadius(1.0);
        System.out.println("Circle Object 2");
        c2.printCircle();
        System.out.println("Area:" + c2.getArea());
        System.out.println("Perimeter:" + c2.getPerimeter());
        System.out.println("Color:" + c2.getColor());
        System.out.println("Filled:" + c2.isFilled());
        Circle c3 = new Circle(3.0, "Black", true);
        c1.setRadius(1.0);
        System.out.println("Circle Object 3");
        c3.printCircle();
        System.out.println("Area:" + c3.getArea());
        System.out.println("Perimeter:" + c3.getPerimeter());
        System.out.println("Color:" + c3.getColor());
        System.out.println("Filled:" + c3.isFilled());
        Rectangle r1 = new Rectangle();
        r1.setData(20, 30);
        System.out.println("Rectangle Object 1");
        r1.printRectangle();
        System.out.println("Area:" + r1.getArea());
        System.out.println("Perimeter:" + r1.getPerimeter());
        System.out.println("Color:" + r1.getColor());
        System.out.println("Filled:" + r1.isFilled());
        Rectangle r2 = new Rectangle(5, 10);
        r1.setData(5, 10);
        System.out.println("Rectangle Object 2");
        r2.printRectangle();
        System.out.println("Area:" + r2.getArea());
        System.out.println("Perimeter:" + r2.getPerimeter());
        System.out.println("Color:" + r2.getColor());
        System.out.println("Filled:" + r2.isFilled());
        Rectangle r3 = new Rectangle(10, 15, "Red", true);
        r1.setData(5, 10);
        System.out.println("Rectangle Object 3");
        r3.printRectangle();
        System.out.println("Area:" + r3.getArea());
        System.out.println("Perimeter:" + r3.getPerimeter());
        System.out.println("Color:" + r3.getColor());
        System.out.println("Filled:" + r3.isFilled());
    }
}
