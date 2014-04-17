package com.joshuaking.gui;

import com.joshuaking.code.Code;
import com.joshuaking.code.Group;

public abstract class CodeCreator {

	protected Group group;
	
	public CodeCreator(int size){
		group = new Group(size);
	}
	
	public abstract void update();
	public abstract void render();
	
	public abstract Code generateCode();
}
