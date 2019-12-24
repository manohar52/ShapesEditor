package com.shapes.models;

import java.awt.Graphics;


/*This is the super class for the primitives and the Composite class. */

abstract public class Shapes{

	public abstract void draw(Graphics g);
	
	public void add(Shapes shape) {
		// implemented in the composite class - CompositeShape
		
	}

	public void remove(Shapes shape) {
		// implemented in the composite class - CompositeShape
		
	}

}
