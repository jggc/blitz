package com.coveo.blitz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.coveo.blitz.thrift.NodeType;
import com.coveo.blitz.thrift.Query;
import com.coveo.blitz.thrift.QueryResponse;
import com.coveo.blitz.thrift.QueryResult;
import com.coveo.blitz.thrift.QueryTreeNode;

public class Interpreteur {
	
	private QueryResponse returnValue;
	
	public Interpreteur(Query query, Index index)
	{
		returnValue = new QueryResponse();
		if(query.queryTreeNodes.size() == 1)
		{
			QueryTreeNode node = query.queryTreeNodes.get(0);
			//étoile!
			if(node.type == NodeType.LITERAL && node.value == "*")
			{
				 List<QueryResult> liste = index.getAllId();
				 Iterator<QueryResult> it = liste.iterator();
				 while(it.hasNext())
				 {
					 returnValue.addToResults(it.next());
				 }
			}
			// un seul literal
			else if(node.type == NodeType.LITERAL)
			{
				 List<QueryResult> liste = index.search(node.value);
				 Iterator<QueryResult> it = liste.iterator();
				 while(it.hasNext())
				 {
					 returnValue.addToResults(it.next());
				 }
			}
		}
	}
	
	public QueryResponse getResponse()
	{
		return returnValue;
	}

}
