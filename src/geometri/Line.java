package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */
public class Line extends GeometricalObject {
    private int x1, y1, x2, y2;

    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
        if (x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0)
            throw new IllegalPositionException();

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (x1 < x2)
            x = x1;
        else
            x = x2;
        if (y1 < y2)
            y = y1;
        else
            y = y2;
    }

    public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
        x1 = f1.getX();
        x2 = f2.getX();
        y1 = f1.getY();
        y2 = f2.getY();
        if (x1 < x2)
            x = x1;
        else
            x = x2;
        if (y1 < y2)
            y = y1;
        else
            y = y2;
    }

    @Override
    public void place(int x, int y) throws IllegalPositionException {
        if (x < 0 || y < 0)
            throw new IllegalPositionException();

        int dx = x - this.x;
        int dy = y - this.y;
        x1 += dx;
        x2 += dx;
        y1 += dy;
        y2 += dy;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) throws IllegalPositionException {
        if (this.x + dx < 0 || this.y + dy < 0)
            throw new IllegalPositionException();

        x1 += dx;
        x2 += dx;
        y1 += dy;
        y2 += dy;
        this.x += dx;
        this.y += dy;
    }

    public int getPerimeter() {
        return (int) Math.sqrt(getWidth() * getWidth() + getHeight() + getHeight());
    }

    public int getWidth() {
        return (x2 - x1);
    }

    public int getHeight() {
        return y2 - y1;
    }


    public int getArea() {
        return 0;
    }

    public void fill(Graphics g) {
        g.setColor(c);
        g.drawLine(x1, y1, x2, y2);
    }
}
