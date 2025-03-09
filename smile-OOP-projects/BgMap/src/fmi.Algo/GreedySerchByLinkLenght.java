package fmi.Algo;

import java.util.ArrayList;
import java.util.List;

import fmiGraph.Graph;
import fmiGraph.Link;
import fmiGraph.Node;

public class GreedySerchByLinkLenght implements SearchInterfaces {

	
	private Graph graph;
	
	public  GreedySerchByLinkLenght(Graph gr) 
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
		UtilClass.sortLInksByLenght(graph);
		
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
			if(l.getRelatedNode().isVisited()==false) 
			{
				l.getRelatedNode().setParentName(parent.getName()); 
				fakeQueue.add(0,l.getRelatedNode());
			}
		}
	}

}
