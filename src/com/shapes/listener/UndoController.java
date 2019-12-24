package com.shapes.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.shapes.gui.ShapesGUI;
import com.shapes.states.Context;

/*This is a action listener for the Undo button
This is also a controller for the Undo use case*/

public class UndoController implements ActionListener {

	private ShapesGUI gui;
	
	public UndoController(ShapesGUI gui) {
		this.gui = gui;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Context ct = Context.getContext(gui.getCanvasPanel());
		ct.undoClicked();
		
		gui.getCanvasPanel().revalidate();
		gui.getCanvasPanel().repaint();

	}

}
