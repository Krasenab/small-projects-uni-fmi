package main;

import fmi.Algo.BreadthSearch;
import fmi.Algo.DepthSerch;
import fmi.Algo.GreedySerchByLinkLenght;
import fmi.Algo.SearchInterfaces;
import fmiGraph.Graph;
import fmiGraph.Node;

public class Main {

	public static void main(String[] args) {
		
		Graph g = new Graph();
		initGraph(g);
		System.out.println("-----------Depth Search--------");
		searchPath("S","A", new DepthSerch(g));
		System.out.println("-----Breadh search----------");
		searchPath("S","A", new BreadthSearch(g));
		System.out.println("-------------Greedy search by link---------");
		searchPath("S","A",new GreedySerchByLinkLenght(g));
		
		
		
		

	}
	
	public static void searchPath(String startName,String goalName,SearchInterfaces method) 
	{
		if(method.search(startName, goalName)) 
		{
			System.out.println(String.format("\nThere is path", null));
		}
		else {
			
			System.out.println("n/There is no path");
		}
		
		
		
	}
	
	public static void initGraph(Graph graph) 
	{
		graph.addNode(new Node("S",0,8)); // Sofia
		graph.addNode(new Node("E",1,1)); // blagoev grad
		graph.addNode(new Node("EH",3,11)); 
		graph.addNode(new Node("BT",7,10)); 
		graph.addNode(new Node("P",10,12));
		graph.addNode(new Node("B",13,9)); 
		graph.addNode(new Node("PB",4,4)); 
		graph.addNode(new Node("ST",6,4)); 
		graph.addNode(new Node("Y",9,2)); 
		graph.addNode(new Node("A",12,4)); 
		graph.addNode(new Node("Z",20,14)); 
		

		graph.createBiderectanalLink("S", "E",80);
		graph.createBiderectanalLink("S", "PB",130);
		graph.createBiderectanalLink("S", "EH",100);
		graph.createBiderectanalLink("E", "PB",170);
		graph.createBiderectanalLink("EH", "PB",150);
		graph.createBiderectanalLink("ST", "PB",80);
		graph.createBiderectanalLink("EH", "BT",130);
		graph.createBiderectanalLink("P", "BT",75);
		graph.createBiderectanalLink("ST", "BT",90);
		graph.createBiderectanalLink("B", "BT",200);
		graph.createBiderectanalLink("B", "P",95);
		graph.createBiderectanalLink("B", "A",100);
		graph.createBiderectanalLink("Y", "A",70);
		graph.createBiderectanalLink("ST", "A",160);
		graph.createBiderectanalLink("ST", "Y",90);
	}

}
