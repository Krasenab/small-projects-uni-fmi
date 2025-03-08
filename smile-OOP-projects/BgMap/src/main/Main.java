package main;

import fmi.Algo.BreadthSearch;
import fmi.Algo.SearchInterfaces;
import fmiGraph.Graph;
import fmiGraph.Node;

public class Main {

	public static void main(String[] args) {
		
		Graph g = new Graph();
		initGraph(g);
		searchPath("S","E", new BreadthSearch(g));
		

	}
	
	public static void searchPath(String startName,String goalName,SearchInterfaces method) 
	{
		if(method.search(startName, goalName)) 
		{
			System.out.println("There is path");
		}
		else {
			
			System.out.println("There is no path");
		}
		
	}
	
	public static void initGraph(Graph graph) 
	{
		graph.addNode(new Node("S")); // Sofia
		graph.addNode(new Node("E")); // blagoev grad
		graph.addNode(new Node("EH")); 
		graph.addNode(new Node("BT")); 
		graph.addNode(new Node("P"));
		graph.addNode(new Node("B")); 
		graph.addNode(new Node("PB")); 
		graph.addNode(new Node("ST")); 
		graph.addNode(new Node("Y")); 
		graph.addNode(new Node("A")); 
		
//		graph.createBiderectanalLink("S", "E");
//		graph.createBiderectanalLink("S", "PB");
//		graph.createBiderectanalLink("S", "EN");
//		graph.createBiderectanalLink("E", "PB");
		
		graph.createBiderectanalLink("EH", "PB");
		graph.createBiderectanalLink("ST", "PB");
		graph.createBiderectanalLink("EH", "BT");
		graph.createBiderectanalLink("P", "BT");
		graph.createBiderectanalLink("ST", "BT");
		graph.createBiderectanalLink("B", "BT");
		graph.createBiderectanalLink("B", "P");
		graph.createBiderectanalLink("B", "A");
		graph.createBiderectanalLink("Y", "A");
		graph.createBiderectanalLink("ST", "A");
		graph.createBiderectanalLink("ST", "Y");
	}

}
