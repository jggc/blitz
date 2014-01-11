package com.coveo.blitz;

import java.util.ArrayList;
import java.util.List;

import org.apache.thrift.TException;

import com.coveo.blitz.thrift.Album;
import com.coveo.blitz.thrift.Artist;

public class Index {
	
	List<Document> docs;
	
	public Index(){
		docs = new ArrayList<Document>();
	}
	
	public void indexArtist(Artist artistToIndex) {
		
	}
	
	public void indexAlbum(Album albumToIndex) {
		
	}
	
	public List<Artist> searchArtist(){
		return null;
		
	}
	
	public int[] getAllId() {
		int[] ids = new int[docs.size()];
		for(int i = 0; i < docs.size(); i++){
			ids[i] = docs.get(i).getId();
		}
		
		return ids;
	}
}
