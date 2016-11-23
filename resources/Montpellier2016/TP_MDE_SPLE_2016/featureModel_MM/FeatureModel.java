package featureModel_MM;

import java.util.ArrayList;

public class FeatureModel {
	
/** Attributes **/
	
	Feature root;
	ArrayList<Constraint> CTCs;
	
/** Constructors **/
	public FeatureModel(){
		root = null;
		CTCs = new ArrayList<Constraint>();
	}
	
	public FeatureModel(Feature r){
		root = r;
		CTCs = new ArrayList<Constraint>();
	}
	
/** Getters and Setters **/
	public void addCrossTreeConstraint(Constraint c){
		CTCs.add(c);
	}
	
	
/** GET FAMILIAR SYNTAX **/
	
	public String familiarSyntax(){
		String s = "FM ("+root.familiarSyntax();
		for(Constraint c : CTCs){
			s+=c.familiarSyntax();
		}
		return s+")";
	}

}
