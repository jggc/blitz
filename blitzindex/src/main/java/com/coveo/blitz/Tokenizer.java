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
		listOfWords = listOfWords.toLowerCase();
		individualWords = listOfWords.split(" ");
		int count = 0;
		for(String word:individualWords)
		{
			
			individualWords[count] = word.replaceAll("[^A-Za-z0-9]", "");
			count++;
		}
	}
	

	@Override
	public String toString() {
		return  Arrays.toString(individualWords);
	}

	public static void main(String[] args) {
		String testString = "Les oiseaus sont mes Am.;'Is 34f.23 et le rush< de faire le blitz: est cool[] !";
		Tokenizer tok = new Tokenizer();
		tok.setIndividualWords(testString);
		System.out.println(tok.toString());
		
		

	}

}
