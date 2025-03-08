package fmiGraph;

import java.util.HashMap;
import java.util.Map;

public class Graph {
	
	private Map<String,Node> insideMap  = new HashMap<>();
	
	public Graph() 
	{
		
	}
	
	public Node getNode(String name) 
	{
		return insideMap.get(name);
	}
	
	public void addNode(Node node) 
	{
		insideMap.put(node.getName(), node);
	}
	
	public void createOneDirectionalLink(String nameOne,String nameTwo) 
	{
		if(!insideMap.containsKey(nameTwo) ||!insideMap.containsKey(nameOne)) 
		{
			System.out.println("There are mp such nodes in the map");
			return;
		}
		Node nodeOne = insideMap.get(nameOne);
		Node nodeTwo = insideMap.get(nameTwo);
		
		
		 nodeOne.getLinks().add(new Link(nodeTwo));
		
		
	}
	
	public void createBiderectanalLink(String nameOne,String nameTwo) 
	{
		createOneDirectionalLink(nameOne,nameTwo);
		createOneDirectionalLink(nameTwo,nameOne);
		
	}

}
