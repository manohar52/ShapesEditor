package com.shapes.commands;

import java.awt.Graphics;
import java.util.Iterator;

import com.shapes.models.CompositeShape;
import com.shapes.models.Shapes;

/*Part of the command pattern
command class to draw the composite shape*/

public class DrawComposite extends Command{

	private Graphics g = null;
	public DrawComposite(Graphics g) {
		this.g = g;
	}

	@Override
	public void execute() {
		CommandStack cs = CommandStack.getCommandStack();
		
		Iterator<Command> iter = cs.getExecutedCommandIterator();
		CompositeShape comShape = new CompositeShape();
		while(iter.hasNext()) {
			Shapes sh = iter.next().getResult();
			comShape.add(sh);
		}
		comShape.draw(g);
	}
	

}
