package com.shapes.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.shapes.gui.ShapesGUI;
import com.shapes.states.Context;

/*This is a action listener for the Line button
This is also a controller for the Line shape use case*/

public class LineController implements ActionListener {

	private ShapesGUI gui;
	
	public LineController(ShapesGUI gui) {
		this.gui = gui;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Context ct = Context.getContext(gui.getCanvasPanel());
		ct.lineClicked();
		
		gui.getCanvasPanel().revalidate();
		gui.getCanvasPanel().repaint();

	}

}
