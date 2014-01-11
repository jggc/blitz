package com.coveo.blitz;

import org.apache.thrift.TException;

import com.coveo.blitz.thrift.Album;
import com.coveo.blitz.thrift.Artist;
import com.coveo.blitz.thrift.Indexer.Iface;
import com.coveo.blitz.thrift.NodeType;
import com.coveo.blitz.thrift.Query;
import com.coveo.blitz.thrift.QueryResponse;

public class IndexerHandler implements Iface {

	private Index index = new Index();
	
	
	public void indexArtist(Artist artistToIndex) throws TException {
		
		index.indexArtist(artistToIndex);
	}

	public void indexAlbum(Album albumToIndex) throws TException {
		
		index.indexAlbum(albumToIndex);
	}

	public QueryResponse query(Query query) throws TException {
		System.out.println("Query " + query.getRootId());
		
		Interpreteur interpreteur = new Interpreteur(query, index);
		
		return interpreteur.getResponse();
	}

	public void reset() throws TException {
		System.out.println("Reset");
		index = new Index();
	}

	public void ping() throws TException {
		System.out.println("Ping");
	}

}
