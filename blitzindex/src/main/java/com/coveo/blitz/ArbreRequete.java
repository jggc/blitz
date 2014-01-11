package com.coveo.blitz;

import java.util.Iterator;
import java.util.LinkedList;

import com.coveo.blitz.thrift.NodeType;
import com.coveo.blitz.thrift.Query;
import com.coveo.blitz.thrift.QueryTreeNode;


public class ArbreRequete {

	
	private class NoeudRequete
	{
		public NoeudRequete left;
		public NoeudRequete right;
		public NodeType type;   // 1 = operator, 2 = literal
		public String value;
		
		public NoeudRequete(NodeType p_type, String p_value)
		{
			type = p_type;
			
		}
	}
	
	
	public enum Side{
		LEFT, RIGHT;
	}
	
	private class ToDo
	{
		NoeudRequete reciever;
		int idToGet;
		Side side;
		
		public ToDo(NoeudRequete p_reciever, int p_id, Side p_side )
		{
			reciever = p_reciever;
			idToGet = p_id;
			side = p_side;
		}
	}
	
	public NoeudRequete racine;
	
	public ArbreRequete(Query query) {
		Iterator<QueryTreeNode> it = query.getQueryTreeNodesIterator();
		LinkedList<ToDo> toDo = new LinkedList<ToDo>();
		
		// on trouve la racine
		while(it.hasNext())
		{
			QueryTreeNode curseur = it.next();
			if(curseur.id == query.rootId)
			{
				
				racine = new NoeudRequete(curseur.getType(),
						curseur.getValue());
				
				if(curseur.getLeftPart() != -1)
				{
					toDo.add(new ToDo(racine, curseur.getLeftPart(), Side.LEFT));
				}
				if(curseur.getRightPart() != -1)
				{
					toDo.add(new ToDo(racine, curseur.getRightPart(), Side.RIGHT));
				}
				
			}
		}
		
		// on ajoute les noeuds 
		while(!toDo.isEmpty())
		{
			ToDo job = toDo.getFirst();
			it = query.getQueryTreeNodesIterator();
			while(it.hasNext())
			{
				QueryTreeNode curseur = it.next();
				if(job.idToGet == curseur.getId())
				{
					if(job.side == Side.LEFT)
					{
						job.reciever.left = new NoeudRequete(curseur.getType(), curseur.getValue());
						
						if(curseur.getLeftPart() != -1)
						{
							toDo.add(new ToDo(job.reciever.left, curseur.getLeftPart(), Side.LEFT));
						}
						if(curseur.getRightPart() != -1)
						{
							toDo.add(new ToDo(job.reciever.left, curseur.getRightPart(), Side.RIGHT));
						}
					}
					
					if(job.side == Side.RIGHT)
					{
						job.reciever.right = new NoeudRequete(curseur.getType(), curseur.getValue());
						
						if(curseur.getLeftPart() != -1)
						{
							toDo.add(new ToDo(job.reciever.right, curseur.getLeftPart(), Side.LEFT));
						}
						if(curseur.getRightPart() != -1)
						{
							toDo.add(new ToDo(job.reciever.right, curseur.getRightPart(), Side.RIGHT));
						}
					}
				}
			}
			toDo.pop();
		}
	}
		
	
	
	

	


	
	
}
