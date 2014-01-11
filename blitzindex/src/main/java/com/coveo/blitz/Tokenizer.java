package com.coveo.blitz;


import java.util.ArrayList;
import java.util.Arrays;

public class Tokenizer implements java.io.Serializable {

	//private String listOfWords;
	private String[] individualWords;

	public Tokenizer() {
		
	}

	public String[] getIndividualWords() {
		return individualWords;
	}

	public void setIndividualWords(String listOfWords) {
		System.out.println("set indidual words");
		listOfWords = listOfWords.toLowerCase();
		individualWords = listOfWords.split(" ");
		System.out.println("entering for");
		for(int i=0; i<individualWords.length;i++)
		{		
			individualWords[i] = individualWords[i].replaceAll("[^A-Za-z0-9]", "");
		}
	}
	

	@Override
	public String toString() {
		return  Arrays.toString(individualWords);
	}

	public static void main(String[] args) {
		String testString = "";
		Tokenizer tok = new Tokenizer();
		tok.setIndividualWords(testString);
		System.out.println(tok.toString());
		
		

	}

}
