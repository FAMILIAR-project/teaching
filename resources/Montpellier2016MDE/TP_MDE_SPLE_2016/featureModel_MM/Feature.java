package featureModel_MM;

import java.util.ArrayList;

public class Feature extends Node{
	
/** Attributes **/
	
	private ArrayList<Node> children;
	private Boolean isMandatory;
	private String name;
	
/** Constructors **/
	
	public Feature(String n){
		name= n;
		children = new ArrayList<Node>();
	}
	
/** Getters and Setters **/
	
	public String getName(){
		return name;
	}
	
	public void setMandatory(Boolean b){
		isMandatory = b;
	}
	
	public Boolean isMandatory(){
		return isMandatory;
	}
	
	public void setParent(Feature p){
		parent = p;
	}
	
	/** Ajoute une caracétristique fille **/
	public void addFeatureChild(Feature f, Boolean isM){
		f.setMandatory(isM);
		f.setParent(this);
		children.add(f);
	}
	
	/** Ajoute un groupe de caractéristiques filles **/
	public void addFeatureGroupChild(FeatureGroup fg){
		fg.setParent(this);
		children.add(fg);		
	}

	
	
/** GET FAMILIAR SYNTAX **/

	public String familiarSyntax(){
		if(children.isEmpty()){
			return "";
		}
		else{
		String s = name+" : ";
			for (Node n : children){
				// Si le noeud enfant est une caractéristique simple
				if(n instanceof Feature){
					if(!((Feature) n).isMandatory){
						s+="["+n.getName()+"] ";
					}
					else{
						s+=n.getName()+" ";
					}
				}
				// Si le noeud enfant est un groupe de caractéristiques
				else{
					s+=n.getName()+" ";
				}
			}
			s+="; ";
			
			for(Node n : children){
				s+=n.familiarSyntax();
			}
			return s;
		}
	}

}
