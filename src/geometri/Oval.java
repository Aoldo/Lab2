package geometri;

import java.awt.*;

/**
 * Created by Mattias on 11/15/2016.
 */

/**
 * An oval.
 */
public class Oval extends GeometricalObject {
	private int width, height;

	/**
	 * Constructs an instance of the Oval object.
	 *
	 * @param x      the x-coordinate of the upper left corner of the
	 *               hypothetical rectangle encapsulating the oval.
	 * @param y      the y-coordinate of the upper left corner of the
	 *               hypothetical rectangle encapsulating the oval.
	 * @param width  the width of the oval.
	 * @param height the height of the oval.
	 * @param c      the color of the oval.
	 */
	public Oval(int x, int y, int width, int height, Color c) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.c = c;
	}

	/**
	 * Constructs an instance of the Oval object at the position of a given Geometrical object.
	 *
	 * @param f      the given geometrical object.
	 * @param width  the width of the oval.
	 * @param height the height of the oval.
	 * @param c      the color of the oval.
	 */
	public Oval(GeometricalForm f, int width, int height, Color c) {
		this.x = f.getX();
		this.y = f.getY();
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
		return (int) Math.round((width / 2.0) * (height / 2.0) * Math.PI);
	}

	/**
	 * Fill the area of the form at the position of the form
	 * with the color of the form.
	 *
	 * @param g A graphic pen to draw with.
	 */
	@Override
	public void fill(Graphics g) {
		g.fillOval(x, y, width, height);
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
		return (int) Math.round(Math.PI * (3 * (width + height)
				- Math.sqrt((3 * width + height) * (width + 3 * height))));
	}


}
