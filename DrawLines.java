/*
 * DrawLines
 * By: Jameson Squyres
 * This program will allow the user to draw a line by clicking, dragging, and releasing the mouse button.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

public class DrawLines extends GraphicsProgram {

	private GLine line;
	// Listen for mouse events
	public void run() {
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e) {	// When the mouse is pressed, get the x and y position, then create a line at the position
		double x = e.getX();
		double y = e.getY();
		line = new GLine(x, y, x, y);
		add(line);
	}
	public void mouseDragged(MouseEvent e) {	// WHen the mouse is dragged, set the endpoint of the line to the new position of the mouse
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x,y);
	}
}