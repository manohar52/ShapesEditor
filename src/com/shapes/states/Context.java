package com.shapes.states;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

//This is the Subject class of the State pattern and also the main controller
// This has the application's current state - either of BoxState, CircleState, LineState, LineEndState, or defaultState


public class Context {

	private static Context context = null;
	
	private State currentState;
	private JPanel canvas;
	
	private Context(JPanel canvas) {
		this.canvas = canvas;
		this.currentState = new DefaultState(this);
	}
	
	public static Context getContext(JPanel canvas) {
		if(context == null) {
			context = new Context(canvas);
		}
		return context;
	}
	
	public static Context getContext() {
		return context;
	}
	
	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public void boxClicked() {
		currentState.boxClicked(this);
	}
	
	public void lineClicked() {
		currentState.lineClicked(this);
	}
	
	public void circleClicked() {
		currentState.circleClicked(this);
	}
	
	public void undoClicked() {
		currentState.undoClicked(this);
	}
	public void redoClicked() {
		currentState.redoClicked(this);
	}
	
	public void mouseClickedOnCanvas(MouseEvent e) {
		currentState.mouseClickedOnCanvas(this,e);
	}

	public void paintCanvas(Graphics g) {
		currentState.paintCanvas(this, g);
		
	}
	
	public JPanel getCanvas() {
		return canvas;
	}


	

}
