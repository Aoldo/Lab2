package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */
public class Line extends GeometricalObject {
    private  int x1,y1,x2,y2;

    public int getPerimeter() {
        return (int)Math.sqrt(getWidth()*getWidth()+getHeight()+getHeight());
    }

    public int getWidth() {
        return (x2-x1);
    }
    public int getHeight() {
        return y2-y1;
    }

    public int compareTo(GeometricalForm otherForm) {

    }


    public int getArea() {
        return 0;
    }
    public void fill(Graphics g)
    {

    }
}
