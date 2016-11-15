package geometri;

import java.awt.*;

/**
 * Object containing the poisition and color of the geometrical shapes, aswell as
 * methods that aren't unique between each subtype.
 * @author NaN and K
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

    public int compareTo(GeometricalForm otherForm) {
        if (otherForm.getArea() < this.getArea())
            return -1;
        else if (otherForm.getArea() > this.getArea())
            return 1;
        else
        {
            if(otherForm.getPerimeter() < this.getPerimeter())
                return -1;
            else if(otherForm.getPerimeter() > this.getPerimeter())
                return 1;
        }
        return 0;
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
