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
	
	public void createOneDirectionalLink(String nameOne,String nameTwo,int lenght) 
	{
		if(!insideMap.containsKey(nameTwo) || !insideMap.containsKey(nameOne)) 
		{
			System.out.println("There are no such nodes in the map");
			return;
		}
		Node nodeOne = insideMap.get(nameOne);
		Node nodeTwo = insideMap.get(nameTwo);
		
		
		 nodeOne.getLinks().add(new Link(nodeTwo,lenght));
		
		
	}
	
	public void createBiderectanalLink(String nameOne,String nameTwo,int lenght) 
	{
		createOneDirectionalLink(nameOne,nameTwo,lenght);
		createOneDirectionalLink(nameTwo,nameOne,lenght);
		
	}

	public Map<String, Node> getInsideMap() {
		return insideMap;
	}


	
	

}
