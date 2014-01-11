package coveo.blitz;

import java.util.LinkedList;

import org.junit.Test;

import com.coveo.blitz.ArbreRequete;
import com.coveo.blitz.thrift.Query;
import com.coveo.blitz.thrift.QueryTreeNode;
import com.coveo.blitz.thrift.NodeType;

public class TestArbreRequete {
	
	@Test
	public void test()
	{
		Query requete = new Query();
		requete.setRootId(1);
		requete.queryTreeNodes = new LinkedList<QueryTreeNode>();
		requete.queryTreeNodes.add(new QueryTreeNode("AND", NodeType.OPERATOR , 2,3,1));
		requete.queryTreeNodes.add(new QueryTreeNode("pink", NodeType.LITERAL, -1,-1,2));
		requete.queryTreeNodes.add(new QueryTreeNode("floyd", NodeType.LITERAL, -1,-1,3));
		
		ArbreRequete arbre = new ArbreRequete(requete);
		System.out.println("Bonjour");
	}

}
