package com.coveo.blitz;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

import com.coveo.blitz.thrift.Indexer;

/**
 * Hello world!
 * 
 */
public class BlitzIndex {
	public static void main(String[] args) throws TTransportException {
		IndexerHandler handler = new IndexerHandler();

		Indexer.Processor<Indexer.Iface> processor = new Indexer.Processor<Indexer.Iface>(
				handler);
		TServerTransport serverTransport = new TServerSocket(9090);
		final TServer server = new TSimpleServer(new TSimpleServer.Args(
				serverTransport).processor(processor));
		System.out.println("Server started!");
		server.serve();
	}
}
