package com.shapes.states;

import java.awt.Cursor;
import java.awt.event.MouseEvent;

/*This is one of the states in the state pattern
This state is invoked when the Line button is clicked on the UI*/


public class LineState extends State {

	public LineState(Context ct) {
		ct.getCanvas().setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
	}
	
	@Override
	public void boxClicked(Context ct) {
		ct.setCurrentState(new BoxState(ct));

	}

	@Override
	public void lineClicked(Context ct) {
	}

	@Override
	public void circleClicked(Context ct) {
		ct.setCurrentState(new CircleState(ct));

	}

	@Override
	public void mouseClickedOnCanvas(Context ct, MouseEvent e) {
		ct.setCurrentState(new LineStateEnd(ct,e));
		
	}
	
}
