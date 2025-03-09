package fmiGraph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	
	
	
	private String name;
	private int x;
	private int y;
	private float weight;
	private ArrayList<Link> links = new ArrayList<>();
	
	private boolean isVisited;
	private String parentName = "no parent";
	
	public String getParentName() {
		return parentName;
	}



	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

     

	public Node(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}



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

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Link> links) {
		this.links = links;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	

}
