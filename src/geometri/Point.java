package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */
public class Point extends GeometricalObject {
    public int getPerimiter() {
        return 0;
    }

    public int getArea() {
        return 0;
    }

    public int getPerimeter() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public int getWidth() {
        return 0;
    }

    public void fill(Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, 1, 1);
    }
}
