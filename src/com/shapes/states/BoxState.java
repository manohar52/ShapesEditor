package com.shapes.states;

import java.awt.Cursor;
import java.awt.event.MouseEvent;

import com.shapes.commands.Command;
import com.shapes.commands.DrawBox;

/*This is one of the states in the state pattern
This state is invoked when the Box button is clicked on the UI*/

public class BoxState extends State {

	public BoxState(Context ct) {
		ct.getCanvas().setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));		// change the cursor when in this state to cross hair
	}
	@Override
	public void boxClicked(Context ct) {
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
		ct.setCurrentState(new DefaultState(ct));
		Command drawBox = new DrawBox(e);
		drawBox.execute();
		
	}
}
