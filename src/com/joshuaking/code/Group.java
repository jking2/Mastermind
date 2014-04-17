package com.joshuaking.code;

import java.util.ArrayList;

public class Group {

	private ArrayList<Integer> values;
	private int size;
	
	public Group(int size){
		values = new ArrayList<Integer>();
		this.size = size;
		for(int x = 0; x< size;x++){
			values.add(-1);
		}
	}
	public Group(ArrayList<Integer> values, int size){
		this.values=values;
		this.size=size;
	}
	public void setValue(int value, int position){
		if(position>size-1 || position <0){
			System.out.println("Position out of Group's range!");
			return;
		}
		values.set(position, value);
	}
	/**
	 * Gets the value at the position given.
	 * @param position
	 * @return Returns -2 if out of bounds
	 */
	public int getValue(int position){
		if(position<0 || position > size-1){
			System.out.println(" position out of range!");
			return -2;
		}
		return values.get(position);
	}
	public int getSize(){
		return size;
	}
	public boolean isAllSame(){
		if(size < 2){
			return true;
		}
		for(int x =1; x<size;x++){
			if(values.get(x) != values.get(0)){
				return false;
			}
		}
		return true;
	}
	public boolean isFull(){
		for(int x =0; x<size;x++){
			if(values.get(x) == -1){
				return false;
			}
		}
		return true;
	}
	public void empty(){
		for(int x=0;x<size;x++){
			values.set(x, -1);
		}
	}
}
