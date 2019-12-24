package com.shapes.models;

import java.awt.Graphics;

/*its one of the experts (expert pattern)
it also belongs to the Composite pattern. This is the Line primitive class*/

public class Line extends Shapes{

	private int x1,y1,x2,y2;			// co-ordinates for line start and end points
	
	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
	}
}

