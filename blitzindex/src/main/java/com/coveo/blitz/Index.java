package com.coveo.blitz;

import java.util.ArrayList;
import java.util.List;

import org.apache.thrift.TException;

import com.coveo.blitz.thrift.Album;
import com.coveo.blitz.thrift.Artist;

public class Index {
	
	private List<Document> docs;
	private Tokenizer tokenizer;
	
	public Index(){
		docs = new ArrayList<Document>();
		tokenizer = new Tokenizer();
	}
	
	public void indexArtist(Artist artistToIndex) {
		tokenizer.setIndividualWords(artistToIndex.text);
		String[] tokens = tokenizer.getIndividualWords();
		docs.add(new Document(Integer.parseInt(artistToIndex.getId()), tokens));
	}
	
	public void indexAlbum(Album albumToIndex) {
		tokenizer.setIndividualWords(albumToIndex.text);
		String[] tokens = tokenizer.getIndividualWords();
		docs.add(new Document(Integer.parseInt(albumToIndex.getId()), tokens));
	}
	
	public List<Integer> searchArtist(String s){
		List<Integer> results = new ArrayList<Integer>();
		for( Document d : docs){
			if(d.match(s))
				results.add(d.getId());
		}
		return results;
	}
	public int[] getAllId() {
		int[] ids = new int[docs.size()];
		for(int i = 0; i < docs.size(); i++){
			ids[i] = docs.get(i).getId();
		}
		return ids;
	}
}
