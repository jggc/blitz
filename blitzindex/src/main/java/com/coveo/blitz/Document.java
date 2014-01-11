package com.coveo.blitz;

import java.util.List;

public class Document {
	private int id;
	private String[] tokens;
	
	public Document(int id, String[] tokens) {
		this.id = id;
		this.tokens = tokens;
	}
	
	public boolean match(String s){
		String searchString = s.toLowerCase();
		for(String t : tokens){
			if(t.equals(searchString))
				return true;
		}
		return false;
	}
	
	public int getId() {
		return this.id;
	}
}
