package fmi.Algo;

import java.util.ArrayList;

import fmiGraph.Graph;
import fmiGraph.Node;

public class UtilClass {
	
	public static void printPath(Graph graph,String goalName) 
	{
		ArrayList<String> pathList = new ArrayList<String>();
		Node tempNode = graph.getNode(goalName);
		pathList.add(goalName);

		while(true) 
		{
			if(tempNode.getParentName().equals("no parent")) 
			{
				break;
			}
			pathList.add(0,tempNode.getParentName());
			tempNode = graph.getNode(tempNode.getParentName());
							
		}
		for(String name:pathList) 
		{
			System.out.println(name + "->");
		}
		
		
	}

}
