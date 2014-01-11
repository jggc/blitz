package com.coveo.blitz;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ch.qos.logback.core.read.ListAppender;
import ch.qos.logback.core.util.StringCollectionUtil;

public class Tokenizer implements java.io.Serializable {
	
	public List<String> individualWords; 
	//private String listOfWords;

	public Tokenizer() {
		individualWords = new ArrayList<String>();
	}

	public String[] getIndividualWords() {
		return individualWords.toArray(new String[individualWords.size()]);
	}

	public void setIndividualWords(String listOfWords) {
		individualWords.clear();
		if(!listOfWords.isEmpty())
		{
			listOfWords = listOfWords.toLowerCase();
			String[] temp = listOfWords.split(" ");
			for(int i=0; i<temp.length;i++)
			{		
				temp[i] = temp[i].replaceAll("[^A-Za-z0-9]", "");
				if(!(temp[i] == null || temp[i].equals(""))){
					individualWords.add(temp[i]);
				}
			}
		}
	}
	

	@Override
	public String toString() {
		return  individualWords.toString();
	}

	public static void main(String[] args) {
		String testString = "";
		Tokenizer tok = new Tokenizer();
		tok.setIndividualWords(testString);
		System.out.println(tok.toString());
	}

}
