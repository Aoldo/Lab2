package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */
public class Circle extends GeometricalObject {
    private int diameter;

    public Circle(int x, int y, int diameter, Color c) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.c = c;
    }

    public Circle(GeometricalForm f, int diameter, Color c) {
        this.x = f.getX();
        this.y = f.getY();
        this.diameter = diameter;
        this.c = c;
    }

    public int getPerimeter() {
        return (int) (Math.PI * diameter);
    }

    public int getWidth() {
        return diameter;
    }

    public int getHeight() {
        return diameter;
    }

    public int getArea() {
        return (int) ((Math.PI) * (diameter / 2) * (diameter / 2));
    }

    public void fill(Graphics g) {
        g.setColor(c);
        g.fillOval(x, y, diameter, diameter);
    }
}
