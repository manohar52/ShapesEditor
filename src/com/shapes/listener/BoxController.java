package com.shapes.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.shapes.gui.ShapesGUI;
import com.shapes.states.Context;

/*This is a action listener for the Box button
This is also a controller for the Box shape use case*/

public class BoxController implements ActionListener {

	private ShapesGUI gui;
	
	public BoxController(ShapesGUI gui) {
		this.gui = gui;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Context ct = Context.getContext(gui.getCanvasPanel());
		ct.boxClicked();
		
		gui.getCanvasPanel().revalidate();
		gui.getCanvasPanel().repaint();

	}

}
