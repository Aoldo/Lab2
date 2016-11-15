package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */
public class Square extends GeometricalObject {
    private int side;

    public Square(int x, int y, int side, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.side = side;
    }

    public Square(GeometricalForm f, int side, Color c) {
        x = f.getX();
        y = f.getY();
        this.side = side;
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }

    @Override
    public void fill(Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, side, side);
    }

    @Override
    public int getHeight() {
        return side;
    }

    @Override
    public int getWidth() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
