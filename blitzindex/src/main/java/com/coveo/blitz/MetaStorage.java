package com.coveo.blitz;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.coveo.blitz.thrift.Album;
import com.coveo.blitz.thrift.Artist;

public class MetaStorage {
	private int countAlbums;
	private int countArtists;

	public MetaStorage() {
		countAlbums = 1;
		countArtists = 1;
	}

	public void writeArtist(Artist CurrentArtist) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(CurrentArtist.id + ".ser"));
			out.writeObject(CurrentArtist);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeAlbum(Album CurrentAlbum) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(CurrentAlbum.id + ".ser"));
			out.writeObject(CurrentAlbum);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Artist readArtist(String id) {
		try {

			FileInputStream door = new FileInputStream(id + ".ser");
			ObjectInputStream inputReader = new ObjectInputStream(door);
			Artist myArtist = new Artist();
			myArtist = (Artist) inputReader.readObject();
			return myArtist;

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
		return null;

	}

	public Album readAlbum(String id) {

		try {

			FileInputStream door = new FileInputStream(id + ".ser");
			ObjectInputStream inputReader = new ObjectInputStream(door);
			Album myAlbum = new Album();
			myAlbum = (Album) inputReader.readObject();
			return myAlbum;

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
		return null;
	}

	public void testWriter() {
		Tokenizer testToken = new Tokenizer();
		testToken.setIndividualWords("criss34 de caliss de marde");
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("token" + countArtists + ".ser"));
			out.writeObject(testToken);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Tokenizer TestReadToken(String id) {
		try {

			FileInputStream door = new FileInputStream(id + ".ser");
			ObjectInputStream inputReader = new ObjectInputStream(door);
			Tokenizer myToken = new Tokenizer();
			myToken = (Tokenizer) inputReader.readObject();
			System.out.println(myToken.toString());
			return myToken;

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return null;

	}

	public static void main(String[] args) {
		MetaStorage test = new MetaStorage();
		test.testWriter();
		test.TestReadToken("token1");

	}
}
