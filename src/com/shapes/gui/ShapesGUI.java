package com.shapes.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SpringLayout;

import com.shapes.listener.BoxController;
import com.shapes.listener.CircleController;
import com.shapes.listener.LineController;
import com.shapes.listener.RedoController;
import com.shapes.listener.UndoController;

//The Main gui class where the buttons and the canvas are added to the JFrame

public class ShapesGUI extends javax.swing.JFrame{

	private static final long serialVersionUID = 1L;
	// these are the components we need.
	private JButton line, box, circle, undo, redo;
    private final JSplitPane splitPane;  // split the window in top and bottom
    private final JPanel leftPanel;       // container panel for the top
    private final JPanel rightPanel;    // container panel for the bottom

    public ShapesGUI(String title){
    	super(title);

        splitPane = new JSplitPane();

        leftPanel = new JPanel();         // left-buttons holder panel
        setupLeftPane(leftPanel);		  // add components to the button holder panel
              
        rightPanel = new DrawingCanvas();		// right drawing canvas panel
        rightPanel.setBackground(Color.WHITE);

        // the contentPane is the container that holds all the button and canvas panels
        getContentPane().setLayout(new GridLayout());  // the default GridLayout is like a grid with 1 column and 1 row,

        getContentPane().add(splitPane);               // due to the GridLayout, splitPane will now fill the whole window

        //splitter container for left and right panel
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);  // we want it to split the window vertically
        splitPane.setDividerLocation(100);                    // the initial position of the divider is 100
        splitPane.setLeftComponent(leftPanel);                  // at the top we want our "left Panel"
        splitPane.setRightComponent(rightPanel);            // and at the bottom we want our "right Panel"

        
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS)); // BoxLayout.Y_AXIS will arrange the content vertically

        setWindowProperties();
        pack();   // calling pack() at the end, will ensure that every layout and size we just defined gets applied before the stuff becomes visible
    }
    
    public JPanel getCanvasPanel() {
    	return rightPanel;
    }
    
	private void setupLeftPane(JPanel leftPanel) {
      
//	 create required buttons
      line = new JButton("Line");
      box = new JButton("Box");
      circle = new JButton("Circle");
      undo = new JButton("Undo");
      redo = new JButton("Redo");
      
      
//      register controller as listener for buttons
//      ShapesController controller = ShapesController.getController();
      line.addActionListener(new LineController(this));
      box.addActionListener(new BoxController(this));
      circle.addActionListener(new CircleController(this));
      undo.addActionListener(new UndoController(this));
      redo.addActionListener(new RedoController(this));
      
      SpringLayout sl = new SpringLayout();
      leftPanel.setLayout(sl);			//specify the type of layout being used 
      
//      add buttons to left panel
      leftPanel.add(line);
      leftPanel.add(box);
      leftPanel.add(circle);
      leftPanel.add(undo);
      leftPanel.add(redo);
      
      
//      arrange buttons according to layout - one below the other
      sl.putConstraint(SpringLayout.WEST, line, 5,SpringLayout.WEST , leftPanel);
      sl.putConstraint(SpringLayout.NORTH, line, 10,SpringLayout.NORTH , leftPanel);
      
      sl.putConstraint(SpringLayout.WEST, box, 5,SpringLayout.WEST , leftPanel);
      sl.putConstraint(SpringLayout.WEST, circle, 5,SpringLayout.WEST , leftPanel);
      sl.putConstraint(SpringLayout.WEST, undo, 5,SpringLayout.WEST , leftPanel);
      sl.putConstraint(SpringLayout.WEST, redo, 5,SpringLayout.WEST , leftPanel);
      
      sl.putConstraint(SpringLayout.NORTH, box, 5,SpringLayout.SOUTH , line);
      sl.putConstraint(SpringLayout.NORTH, circle, 5,SpringLayout.SOUTH , box);
      sl.putConstraint(SpringLayout.NORTH, undo, 5,SpringLayout.SOUTH , circle);
      sl.putConstraint(SpringLayout.NORTH, redo, 5,SpringLayout.SOUTH , undo);
      
	}
	private void setWindowProperties(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1280, 720);
        setPreferredSize(new Dimension(1280, 720));     // let's open the window with a default size of 400x400 pixels
//        setResizable(false);
        setLocationRelativeTo(null);
    }
}

