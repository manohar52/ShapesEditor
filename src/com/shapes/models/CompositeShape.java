package com.shapes.models;


import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

/*it is the composite class of the composite pattern which holds the other primitive class in a list*/

//Iterator pattern also applied here to loop through the primitve classes

public class CompositeShape extends Shapes{
	private ArrayList<Shapes> shapes;		// collection of the composite class
		
	public CompositeShape() {
		shapes = new ArrayList<>();
	}
	@Override
	public void add(Shapes shape) {
		shapes.add(shape);
	}
	
	@Override
	public void remove(Shapes shape) {
		shapes.remove(shape);
	}
	
	@Override
	public void draw(Graphics g) {
		
//		Iterator pattern applied to loop through the primitves 
		Iterator<Shapes> iter = shapes.iterator();
		while(iter.hasNext()) {
			iter.next().draw(g);
		}
	}
}
