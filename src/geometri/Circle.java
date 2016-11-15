package geometri;

import java.awt.*;

/**
 * A circle.
 * @author NaN and K
 */
public class Circle extends GeometricalObject {
    private int diameter;

    /**
     *
     * @param x The x-coordinate of the rectangle encapsulating the circle.
     * @param y The x-coordinate of the rectangle encapsulating the circle.
     * @param diameter The diameter of the circle.
     * @param c The color of the circle.
     */
    public Circle(int x, int y, int diameter, Color c) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.c = c;
    }

    /**
     *
     * @param f Another shape whose coordinates will be copied.
     * @param diameter The diameter of the circle.
     * @param c The color of the circle.
     */
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
