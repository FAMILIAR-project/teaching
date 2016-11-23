package featureModel_MM;

import java.util.ArrayList;

public class FeatureGroup extends Node{

/** Attributes **/
	
	private Boolean isXor;
	private ArrayList<Feature> groupedFeatures;
	
/** Constructors **/
	
	public FeatureGroup(Feature p, Boolean b){
		super(p);
		isXor = b;
		groupedFeatures = new ArrayList<Feature>();
	}
	
/** Getters and Setters **/
	
	public Boolean isXor(){
		return isXor;
	}
	
	public void setXor(Boolean b){
		isXor = b;
	}
	
	public ArrayList<Feature> getFeaturesInGroup(){
		return groupedFeatures;
	}
	
	protected String getName(){
		String s = "(";
		
		for(Feature f : groupedFeatures){
			s+=f.getName()+"|";
		}
		s = (String)s.subSequence(0, s.length()-1);
		s+=")";
		if(!isXor){
			s+="+";
		}
		return s;
	}
	
	public void setParent(Feature p){
		for(Feature f : groupedFeatures){
			f.setParent(p);
		}
	}
	
	/** Définit les caracétristiques qui font parties du groupe **/
	public void addFeatureInGroup(Feature f){
		f.setParent(parent);
		groupedFeatures.add(f);
	}
	
	
/** GET FAMILIAR SYNTAX **/
	
	public String familiarSyntax(){
		String s = "";
		for(Feature f : groupedFeatures){
			s+=f.familiarSyntax();
		}
		return s;
	}


}





