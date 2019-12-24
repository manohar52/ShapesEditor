package com.shapes.listener;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.shapes.states.Context;

/*This is a action listener for the button clicks on the canvas */

public class CanvasController implements MouseListener {


	@Override
	public void mousePressed(MouseEvent e) {
		Context ct = Context.getContext();
		ct.mouseClickedOnCanvas(e);
		e.getComponent().repaint();
	}

	public void drawShape(Graphics g) {
		Context ct = Context.getContext();
		if(ct !=null) {
			ct.paintCanvas(g);	
		}
		
	}
	
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}