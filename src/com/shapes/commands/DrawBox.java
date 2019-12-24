package com.shapes.commands;

import java.awt.event.MouseEvent;

import com.shapes.models.Box;

/*Part of the command pattern
command class to draw box*/

public class DrawBox extends Command {

	private MouseEvent click; 
	
	public DrawBox(MouseEvent e) {
		this.click = e;
		CommandStack.getCommandStack().push(this);
	}
	
	@Override
	public void execute() {
		int x = click.getX();
		int y = click.getY();
		result = new Box(x,y);
	}	
}
