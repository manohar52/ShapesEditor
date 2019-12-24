package com.shapes.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.shapes.gui.ShapesGUI;
import com.shapes.states.Context;

/*This is a action listener for the Redo button
This is also a controller for the Redo use case*/

public class RedoController implements ActionListener {

	private ShapesGUI gui;
	
	public RedoController(ShapesGUI gui) {
		this.gui = gui;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Context ct = Context.getContext(gui.getCanvasPanel());
		ct.redoClicked();
		
		gui.getCanvasPanel().revalidate();
		gui.getCanvasPanel().repaint();

	}

}
