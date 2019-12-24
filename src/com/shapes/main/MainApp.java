package com.shapes.main;

import java.awt.EventQueue;
import com.shapes.gui.ShapesGUI;

/*this is the class where execution begins
The main function is located here
Start running the application here*/

public class MainApp {
    
	private void init() {
		ShapesGUI gui = new ShapesGUI("Draw Shapes");
		gui.setVisible(true);
	}

	public static void main(String args[]){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
            	MainApp cont = new MainApp();
            	cont.init();
                
            }
        });
    }
}
