package com.joshuaking.statemachine;

import com.joshuaking.gui.CodeCreator;
import com.joshuaking.gui.CodeCreatorGUI;

public class CodeCreationState implements IState {

	private CodeCreator codeCreator;
	
	@Override
	public void update() {
		codeCreator.update();
		
	}

	@Override
	public void render() {
		codeCreator.render();
		
	}

	@Override
	public void enter(String condition) {
		if(condition.compareToIgnoreCase("new") == 0){
			codeCreator = new CodeCreatorGUI(4);
		}
	}

	@Override
	public void exit() {
		
	}

}
