package com.shapes.commands;

import java.util.Iterator;
import java.util.Stack;

/*This is command stack class which has two stacks for executed commands and commands which were undone*/

public class CommandStack {
	
	private static CommandStack stackInstance = null;
	private Stack<Command> executed;
	private Stack<Command> undo;
	public final static String POP_UNDOSTACK = "U";
	public final static String POP_REDOSTACK = "R";
	
	private CommandStack() {
		initStacks();
	}
	
	public Iterator<Command> getExecutedCommandIterator(){
		return this.executed.iterator();
	}
	
	public static CommandStack getCommandStack() {
		if(stackInstance == null) {
			stackInstance = new CommandStack();
		}
		return stackInstance;
	}
	
	private void initStacks() {
		if(executed == null) {
			executed = new Stack<Command>();			
		}
		if(undo == null) {
			undo = new Stack<Command>();
		}
	}
	
	public void push(Command cmd) {
		executed.push(cmd);		
	}

	public Command pop(String s) {
		Command cmd = null;
		if(s == POP_UNDOSTACK) {
			if(undoable()) {
				cmd = executed.pop();
				undo.push(cmd);	
			}
		}
		else if(s == POP_REDOSTACK) {
			if(redoable()) {
				cmd = undo.pop();
				executed.push(cmd);
			}
		}

		return cmd;
	}

	public boolean undoable() {
		if(executed.empty()) {
			return false;
		}
		return true;
	}
	public boolean redoable() {
		if(undo.empty()) {
			return false;
		}
		return true;
	}
	
}
