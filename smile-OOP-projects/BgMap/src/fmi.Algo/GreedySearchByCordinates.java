package fmi.Algo;

import java.util.ArrayList;
import java.util.List;

import fmiGraph.Graph;
import fmiGraph.Link;
import fmiGraph.Node;

public class GreedySearchByCordinates implements SearchInterfaces {

	
	private Graph graph;
	
	public  GreedySearchByCordinates(Graph gr) 
	{
		this.graph = gr;
	}
	
	@Override
	public boolean search(String startName, String goalName) {
		Node startNode = graph.getNode(startName);
		Node goalNode = graph.getNode(goalName);
		ArrayList<Node> fakeQueue = new ArrayList<Node>();
		
		
		if(startNode==null || goalNode==null) 
		{
			System.out.println("There are no such nodes in the graph !");
			return false;
		}
		UtilClass.rest(graph);
		UtilClass.sortLInksByDistance(graph, goalName);
		
		fakeQueue.add(startNode);
		
		Node tempNode;
		
		while(!fakeQueue.isEmpty()) 
		{
			tempNode = fakeQueue.get(0);
			System.out.println("Test node: " + tempNode.getName() +", Parent ");
			if(tempNode.getName().equals(goalName)) 
			{
				UtilClass.printPath(graph, goalName);
				return true;
			}
			
			tempNode.setVisited(true);
			fakeQueue.remove(0);
			addNodesToFakeQueue(fakeQueue,tempNode);
			
		}// end while
		
				
		return false;
	}
	
	
	private void addNodesToFakeQueue(List<Node> fakeQueue,Node parent) 
	{
		
		for(Link l:parent.getLinks()) 
		{
			if(!l.getRelatedNode().isVisited() && !fakeQueue.contains(l.getRelatedNode())) 
			{
				l.getRelatedNode().setParentName(parent.getName()); 
				fakeQueue.add(l.getRelatedNode());
			}
		}
		for(Node node:fakeQueue) 
		{
			System.out.println(node.getName() + "->");
		}
		System.out.println();
	}

}
