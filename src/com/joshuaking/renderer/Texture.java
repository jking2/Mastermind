package com.joshuaking.renderer;

import org.lwjgl.opengl.GL11;

public class Texture {

	private int targetType;
	private int textureID;
	private int height;
	private int width;
	private int texWidth;
	private int texHeight;
	private float widthRatio;
	private float heightRatio;
	public Texture(int targetType, int textureID){
		this.targetType=targetType;
		this.textureID=textureID;
	}
	public void bind(){
		GL11.glBindTexture(targetType, textureID);
	}
	public void setHeight(int height){
		this.height = height;
		this.setHeight();
	}
	public void setWidth(int width){
		this.width = width;
		setWidth();
	}
	public int getImageHeight(){
		return height;
	}
	public int getImageWidth(){
		return width;
	}
	public float getHeight(){
		return heightRatio;
	}
	public float getWidth(){
		return widthRatio;
	}
	public void setTextureHeight(int texHeight){
		this.texHeight = texHeight;
		setHeight();
	}
	public void setTextureWidth(int texWidth){
		this.texWidth=texWidth;
		setWidth();
	}
	private void setHeight(){
		if(texHeight!=0){
			heightRatio = ((float)height)/texHeight;
		}
	}
	private void setWidth(){
		if(texWidth!=0){
			widthRatio = ((float)width)/texWidth;
		}
	}
}
