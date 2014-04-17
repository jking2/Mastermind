package com.joshuaking.gui;

import org.lwjgl.input.Mouse;
import org.lwjgl.util.vector.Vector3f;

import com.joshuaking.code.Code;
import com.joshuaking.renderer.Sprite;

public class CodeCreatorGUI extends CodeCreator {

	private Sprite codeFrame;
	
	private Sprite optionFrame;
	
	private Sprite createButton;
	
	//Arraylist of sprites for selection
	
	//Arraylist of sprites for the code
	
	//pointer to selected code number
	
	//hitting a code color should set the currently selected code number
	

	public CodeCreatorGUI(int size) {
		super(size);
		test = new Sprite("Assets/Test.png");
	}

	@Override
	public void update() {
		
		getInput();

	}

	@Override
	public void render() {
		test.renderAbsolute(200, 200, 0);

	}

	@Override
	public Code generateCode() {

		if (this.group.isFull()) {
			return new Code(this.group);
		}
		return null;
	}
	
	private void getInput(){
		
		if(Mouse.isButtonDown(0)){
			Vector3f pos = LocationUtil.getMousePositionIn3dCoords(Mouse.getX(), Mouse.getY());
		}
	}

}
