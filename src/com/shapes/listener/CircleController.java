package com.shapes.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.shapes.gui.ShapesGUI;
import com.shapes.states.Context;

/*This is a action listener for the Circle button
This is also a controller for the Circle shape use case*/

public class CircleController implements ActionListener {

	private ShapesGUI gui;
	
	public CircleController(ShapesGUI gui) {
		this.gui = gui;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Context ct = Context.getContext(gui.getCanvasPanel());
		ct.circleClicked();
		
		gui.getCanvasPanel().revalidate();
		gui.getCanvasPanel().repaint();

	}

}
