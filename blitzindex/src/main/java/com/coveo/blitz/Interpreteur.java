package com.coveo.blitz;

import com.coveo.blitz.thrift.NodeType;
import com.coveo.blitz.thrift.Query;
import com.coveo.blitz.thrift.QueryResponse;

public class Interpreteur {
	
	private QueryResponse returnValue;
	
	public Interpreteur(Query query, Index index)
	{
		// étoile!
		if(query.queryTreeNodes.size() == 1 && query.queryTreeNodes.get(0).type == NodeType.LITERAL && query.queryTreeNodes.get(0).value == "*")
		{
			
	
		}
		
		// literal
		else if(query.queryTreeNodes.size() == 1 && query.queryTreeNodes.get(0).type == NodeType.LITERAL)
		{
			
	
		}
	}
	
	public QueryResponse getResponse()
	{
		return returnValue;
	}

}
