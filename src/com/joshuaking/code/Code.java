package com.joshuaking.code;

import java.util.ArrayList;

public class Code {

	private final int MAX_GUESSES = 10;
	public static final int EXACT_GUESS = 2;
	public static final int RIGHT_GUESS = 1;
	public static final int WRONG_GUESS = 0;
	
	private Group code;
	private ArrayList<Group> guesses;
	private ArrayList<Group> responses;
	
	public Code(Group code){
		this.code=code;
		this.guesses = new ArrayList<Group>();
		this.responses = new ArrayList<Group>();
	}
	
	public Group guess(Group guess){
		guesses.add(guess);
		
		Group response = compareGuess(guess);
		
		responses.add(response);
		
		return response;
		
	}
	
	
	public boolean reachedGuessLimit(){
		if(guesses.size()>=MAX_GUESSES){
			return true;
		}
		return false;
	}
	
	private Group compareGuess(Group guess){
		
		if(guess.getSize() != code.getSize()){
			return null;
		}
		
		Group response = new Group(guess.getSize());
		
		for(int pos = 0; pos < guess.getSize(); pos++){
			if(guess.getValue(pos) == code.getValue(pos)){
				response.setValue(EXACT_GUESS, pos);
			}else{
				for(int x = 0; x < guess.getSize();x++){
					if(x == pos){
						continue;
					}
					if(guess.getValue(pos) == code.getValue(x)){
						response.setValue(RIGHT_GUESS,pos);
						break;
					}else{
						if(x == guess.getSize()-1){
							response.setValue(WRONG_GUESS,pos);
						}
					}
				}
			}
		}
		
		return response;
	}

	public ArrayList<Group> getGuesses() {
		return guesses;
	}

	public ArrayList<Group> getResponses() {
		return responses;
	}
	
	
	
}
