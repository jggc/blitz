package com.coveo.blitz;

import java.util.List;

import com.coveo.blitz.thrift.DocumentType;

public class Document {
	private String id;
	private String[] tokens;
	private DocumentType type;
	
	public Document(String id, String[] tokens, DocumentType type) {
		this.id = id;
		this.tokens = tokens;
		this.type = type;
	}
	
	public boolean match(String s){
		String searchString = s.toLowerCase();
		for(String t : tokens){
			if(t.equals(searchString))
				return true;
		}
		return false;
	}
	
	public String getId() {
		return this.id;
	}
	
	public DocumentType getType(){
		return type;
	}
}
