package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */
public class Rectangle extends GeometricalObject {
    private int width, height;

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
