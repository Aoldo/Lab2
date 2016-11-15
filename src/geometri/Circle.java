package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */
public class Circle extends GeometricalObject {
    private int diameter;

    public int getPerimeter() {
        return (int)(Math.PI*diameter);
    }

    public int getWidth() {
        return diameter;
    }

    public int compareTo(GeometricalForm otherForm) {

    }

    public int getHeight() {
        return diameter;
    }

    public int getArea() {
        return (int) ((Math.PI) * (diameter / 2) * (diameter / 2));
    }
    public void fill(Graphics g)
    {

    }
}
