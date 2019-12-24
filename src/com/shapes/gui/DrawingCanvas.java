package com.shapes.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.shapes.listener.CanvasController;

/*This is the Jpanel for displaing shapes*/

public class DrawingCanvas extends JPanel{

	private static final long serialVersionUID = 1L;
	private CanvasController cont;
	public DrawingCanvas() {
		cont = new CanvasController();
		this.addMouseListener(cont);
	}
	
	@Override
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        cont.drawShape(g);
	}
}
