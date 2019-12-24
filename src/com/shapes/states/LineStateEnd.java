package com.shapes.states;

import java.awt.Cursor;
import java.awt.event.MouseEvent;

import com.shapes.commands.Command;
import com.shapes.commands.DrawLine;

/*This is one of the states in the state pattern
This state is invoked when the Line button is clicked followed by a click on the canvas */


public class LineStateEnd extends State {

	private MouseEvent firstClick;
	
	public LineStateEnd(Context ct, MouseEvent point1) {
		ct.getCanvas().setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		firstClick = point1;
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
		ct.setCurrentState(new CircleState(ct));

	}

	@Override
	public void mouseClickedOnCanvas(Context ct, MouseEvent secondClick) {
		ct.setCurrentState(new DefaultState(ct));
		Command drawLine = new DrawLine(firstClick,secondClick);
		drawLine.execute();
	}
}
