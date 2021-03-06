package geometri;

import java.awt.*;

/**
 * A rectangle.
 *
 * @author NaN and K
 */
public class Rectangle extends GeometricalObject {
    private int width, height;

    /**
     * @param x      x-coordinate of the rectangle.
     * @param y      y-coordinate of the rectangle.
     * @param width  Width of the rectangle.
     * @param height Height of the rectangle.
     * @param c      Color of the rectangle.
     */
    public Rectangle(int x, int y, int width, int height, Color c) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;
    }

    /**
     * @param f      The shape whose position will be copied.
     * @param width  Width of the rectangle.
     * @param height Height of the rectangle.
     * @param c      Color of the rectangle.
     */
    public Rectangle(GeometricalForm f, int width, int height, Color c) {
        x = f.getX();
        y = f.getY();
        this.width = width;
        this.height = height;
        this.c = c;
    }

    /**
     * Get the area of this form rounded
     * to closest integer.
     *
     * @return the computed area.
     */
    @Override
    public int getArea() {
        return width * height;
    }

    /**
     * Fill the area of the form at the position of the form
     * with the color of the form.
     *
     * @param g A graphic pen to draw with.
     */
    @Override
    public void fill(Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, width, height);
    }

    /**
     * Get the width of the surrounding rectangle of this form.
     *
     * @return the width.
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * Get the height of the surrounding rectangle of this form.
     *
     * @return the x coordinate.
     */
    @Override
    public int getHeight() {
        return height;
    }

    /**
     * Get the perimeter of this form rounded
     * to closest integer.
     *
     * @return the computed perimeter.
     */
    @Override
    public int getPerimeter() {
        return (width + width + height + height);
    }
}
