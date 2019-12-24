package com.shapes.states;

import java.awt.Cursor;
import java.awt.event.MouseEvent;

import com.shapes.commands.Command;
import com.shapes.commands.DrawCircle;

/*This is one of the states in the state pattern
This state is invoked when the Circle button is clicked on the UI*/


public class CircleState extends State {

	public CircleState(Context ct) {
		ct.getCanvas().setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
	}
	
	@Override
	public void boxClicked(Context ct) {
		ct.setCurrentState(new BoxState(ct));

	}

	@Override
	public void lineClicked(Context ct) {
		ct.setCurrentState(new LineState(ct));
	}

	@Override
	public void circleClicked(Context ct) {

	}

	@Override
	public void mouseClickedOnCanvas(Context ct, MouseEvent e) {
		ct.setCurrentState(new DefaultState(ct));
		Command drawCircle = new DrawCircle(e);
		drawCircle.execute();
		
	}
}
