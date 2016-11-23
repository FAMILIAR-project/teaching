package featureModel_MM;

public abstract class Node {

/** Attributes **/
	
	protected Feature parent;
	
/** Constructors **/ 
	
	public Node(Feature p){
		parent = p;
	}
	
	public Node(){
		parent = null;
	}
	
/** Getters and Setters **/
	
	public Feature getParent(){
		return parent;
	}
	
	protected abstract String getName();
	
	
	
/** GET FAMILIAR SYNTAX **/
	
	public abstract String familiarSyntax();
}
