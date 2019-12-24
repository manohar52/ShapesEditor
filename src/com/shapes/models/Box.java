package com.shapes.models;

import java.awt.Graphics;

/*its one of the experts (expert pattern)
it also belongs to the Composite pattern. This is the Box primitive class*/

public class Box extends Shapes{

	private int x,y;
	
	public Box(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(x, y, 150, 150);
		
	}

}
