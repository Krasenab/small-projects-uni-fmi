package fmi.Algo;

import java.util.ArrayList;
import java.util.List;

import fmiGraph.Graph;
import fmiGraph.Link;
import fmiGraph.Node;

public class BreadthSearch implements SearchInterfaces {

	
	private Graph graph;
	
	public BreadthSearch(Graph gr) 
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
			System.out.println("Can not start: There are no such nodes in the graph !");
			return false;
		}
		UtilClass.rest(graph);
		
		fakeQueue.add(startNode);
		
		Node tempNode;
		
		while(!fakeQueue.isEmpty()) 
		{
			tempNode = fakeQueue.get(0);
			System.out.println("Test node: " + tempNode.getName());
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
	
//	private void printPath(String goalName) 
//	{
//		ArrayList<String> path = new ArrayList<>();
//		path.add(goalName);
//		Node tempNode= graph.getNode(goalName); 
//		while(true) 
//		{
//			if(tempNode.getParentName().equals("no parent")) 
//			{
//				break;
//			}
//			path.add(0,tempNode.getParentName());
//			tempNode = graph.getNode(tempNode.getParentName());
//							
//		}
//		for(String name:path) 
//		{
//			System.out.println(name + "->");
//		}
//	}
	
	private void addNodesToFakeQueue(List<Node> fakeQueue,Node parent) 
	{
		for(Link l:parent.getLinks()) 
		{
			if(l.getRelatedNode().isVisited()==false && !fakeQueue.contains(l.getRelatedNode())) 
			{
				l.getRelatedNode().setParentName(parent.getName()); 
				fakeQueue.add(l.getRelatedNode());
			}
			//fakeQueue.add(l.getRelatedNode());
		}
	}

}
