package com.coveo.blitz;

import java.util.ArrayList;
import java.util.List;

import org.apache.thrift.TException;

import com.coveo.blitz.thrift.Album;
import com.coveo.blitz.thrift.Artist;
import com.coveo.blitz.thrift.DocumentType;
import com.coveo.blitz.thrift.QueryResult;

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
		docs.add(new Document(artistToIndex.getId(), tokens, DocumentType.ARTIST));
	}
	
	public void indexAlbum(Album albumToIndex) {
		System.out.println("tokenizing");
		try{
			tokenizer.setIndividualWords(albumToIndex.text);
			String[] tokens = tokenizer.getIndividualWords();
		}
		catch(Exception e){
			System.out.println("bonjour!");
		}
		System.out.println("adding");
	}
	
	public List<QueryResult> search(String s){
		System.out.println("Searching string : "+s);
		List<QueryResult> results = new ArrayList<QueryResult>();
		for( Document d : docs){
			if(d.match(s))
				results.add(new QueryResult(d.getType(), d.getId()));
		}
		return results;
	}
	public List<QueryResult> getAllId() {
		System.out.println("Get all id");
		List<QueryResult> ids = new ArrayList<QueryResult>(docs.size());
		for(Document d : docs){
			ids.add(new QueryResult(d.getType(), d.getId()));
		}
		return ids;
	}
}
