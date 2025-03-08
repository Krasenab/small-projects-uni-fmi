package fmiGraph;

public class Link {
	
	private Node relatedNode;
	private int type;
	private int lenght;
	
	
	public Node getRelatedNode() {
		return relatedNode;
	}
	
	public int getType() {
		return type;
	}
	
	public int getLenght() {
		return lenght;
	}

	
	public Link(Node relatedNode) {
		super();
		this.relatedNode = relatedNode;
	}
	
	

}
