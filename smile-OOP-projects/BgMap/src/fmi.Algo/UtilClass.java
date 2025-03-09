package fmi.Algo;

import java.util.ArrayList;
import java.util.Collection;

import fmiGraph.Graph;
import fmiGraph.Link;
import fmiGraph.Node;

public class UtilClass {
	
	public static void rest(Graph graph) 
	{
		Collection<Node> values = graph.getInsideMap().values();
		
		for(Node v:values) 
		{
			v.setParentName("no parent");
			v.setVisited(false);
		}
	}
	
	
	
	public static void printPath(Graph graph,String goalName) 
	{
		
		ArrayList<String> pathList = new ArrayList<String>();
		Node tempNode = graph.getNode(goalName);
	
		pathList.add(goalName);
		
		int distance = 0;
		while(true) 
		{
			
			
			if(tempNode.getParentName().equals("no parent")) 
			{
				break;
			}
			distance+= calculateDistance(graph,tempNode.getName(),tempNode.getParentName());
			pathList.add(0,tempNode.getParentName());			
			tempNode = graph.getNode(tempNode.getParentName());
			
							
		}
		System.out.println("Path lenght is: " + distance);
		for(String name:pathList) 
		{
			System.out.print(name + "->");
		}
		
		
	}
	
	private static int calculateDistance(Graph graph,String chilName,String parentName) 
	{
		Node parent = graph.getNode(parentName);
		for(Link link:parent.getLinks())
		{
			if(link.getRelatedNode().getName().equals(chilName)) 
			{
				return link.getLenght();
			}
		}
		
		return 0;
	}

}// end utilClass
