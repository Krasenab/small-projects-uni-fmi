package fmiGraph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	
	
	
	private String name;
	private int x;
	private int y;
	private int weight;
	private List<Link> links = new ArrayList<>();
	
	private boolean isVisited;
	
	
	public Node(String name)
	{
		super();
		this.setName(name);
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	

}
