package com.shapes.states;

import java.awt.Cursor;
import java.awt.event.MouseEvent;

//This is the init state when the application starts and this is the state when a button clicked followed by the canvas

public class DefaultState extends State {

	public DefaultState(Context ct) {
		ct.getCanvas().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
	public void mouseClickedOnCanvas(Context ct, MouseEvent e) {
//		do nothing
	}
}
