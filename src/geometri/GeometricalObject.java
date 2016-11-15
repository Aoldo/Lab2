package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */
public abstract class GeometricalObject implements GeometricalForm {
    protected int x, y;
    protected Color c;

    public void move(int dx, int dy) throws IllegalPositionException {
        if (this.x + dx < 0 || this.y + dy < 0)
            throw new IllegalPositionException();
        this.x += dx;
        this.y += dy;
    }

    public void place(int x, int y) throws IllegalPositionException {
        if (x < 0 || y < 0)
            throw new IllegalPositionException();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return c;
    }

}