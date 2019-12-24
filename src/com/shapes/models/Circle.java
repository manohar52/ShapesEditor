package com.shapes.models;

import java.awt.Graphics;

/*its one of the experts (expert pattern)
it also belongs to the Composite pattern. This is the Circle primitive class*/

public class Circle extends Shapes{

	private int x,y;
	
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(x,y,150,150);
	}
}
