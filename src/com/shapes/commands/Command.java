package com.shapes.commands;

import com.shapes.models.Shapes;

/* the command pattern abstract class */

public abstract class Command {

	
	protected Shapes result;		//stores the result of the command execution
	
	public abstract void execute();

	public Shapes getResult() {
		return result;
	}
	
//	undo from the command stack
	public static void undo() {
		CommandStack cs = CommandStack.getCommandStack();
		cs.pop(CommandStack.POP_UNDOSTACK);
	}
	
//	redo from the command stack
	public static void redo() {
		CommandStack cs = CommandStack.getCommandStack();
		cs.pop(CommandStack.POP_REDOSTACK);
	}
	

}
