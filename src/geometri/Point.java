package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */

/**
 * The Point class.
 */
public class Point extends GeometricalObject {

	/**
	 * Constructs a Point object.
	 *
	 * @param x the x-coordinate of the point.
	 * @param y the y-coordinate of the point.
	 * @param c the color of the point.
	 */
	public Point(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}

	/**
	 * Contructs a Point object at the position of a given GeometricalObject.
	 *
	 * @param f the given GeometricalObject.
	 * @param c the color.
	 */
	public Point(GeometricalForm f, Color c) {
		x = f.getX();
		y = f.getY();
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
		return 0;
	}

	/**
	 * Get the width of the surrounding rectangle of this form.
	 *
	 * @return the width.
	 */
	@Override
	public int getWidth() {
		return 0;
	}

	/**
	 * Get the height of the surrounding rectangle of this form.
	 * (The height of a point is 0)
	 *
	 * @return the x coordinate.
	 */
	@Override
	public int getHeight() {
		return 0;
	}

	/**
	 * Get the perimeter of this form rounded
	 * to closest integer.
	 * (The perimeter of a point is 0)
	 *
	 * @return the computed perimeter.
	 */
	@Override
	public int getPerimeter() {
		return 0;
	}

	/**
	 * Draws the point to a canvas with a given graphic pen.
	 *
	 * @param g A graphic pen to draw with.
	 */
	public void fill(Graphics g) {
		g.setColor(c);
		g.fillRect(x, y, 1, 1);
	}
}
