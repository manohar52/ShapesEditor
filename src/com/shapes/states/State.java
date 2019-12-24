package com.shapes.states;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import com.shapes.commands.Command;
import com.shapes.commands.DrawComposite;

//This is the state patterns' State super class
//it has all the transition methods

public class State {

	public void boxClicked(Context ct) {}
	public void lineClicked(Context ct) {}
	public void circleClicked(Context ct) {}
	public void mouseClickedOnCanvas(Context ct, MouseEvent e) {}
	
	public void undoClicked(Context ct) {
		ct.setCurrentState(new DefaultState(ct));
		Command.undo();
	}
	public void redoClicked(Context ct) {
		ct.setCurrentState(new DefaultState(ct));
		Command.redo();
	}

	public void paintCanvas(Context ct, Graphics g) {
		Command dc = new DrawComposite(g);
		dc.execute();
	}
	
}
