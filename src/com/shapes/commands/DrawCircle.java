package com.shapes.commands;

import java.awt.event.MouseEvent;

import com.shapes.models.Circle;

/*Part of the command pattern
command class to draw circle*/

public class DrawCircle extends Command {

	private MouseEvent click;
	
	public DrawCircle(MouseEvent e) {
		this.click = e;
		CommandStack.getCommandStack().push(this);
	}
	@Override
	public void execute() {
		int x = click.getX();
		int y = click.getY();
		result = new Circle(x,y);
	}

}
