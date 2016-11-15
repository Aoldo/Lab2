package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */
public class Square extends GeometricalObject {
    private int side;

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
    public int getArea()
    {
        return side*side;
    }
}
