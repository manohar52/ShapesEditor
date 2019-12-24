package com.shapes.commands;

import java.awt.event.MouseEvent;

import com.shapes.models.Line;

/*Part of the command pattern
command class to draw Line*/

public class DrawLine extends Command {

	private MouseEvent firstClick;
	private MouseEvent secondClick;
	public DrawLine(MouseEvent e1,MouseEvent e2) {
		firstClick = e1;
		secondClick = e2;
		CommandStack.getCommandStack().push(this);
	}
	@Override
	public void execute() {
		result = new Line(firstClick.getX(),firstClick.getY(),secondClick.getX(),secondClick.getY());
	}
}
