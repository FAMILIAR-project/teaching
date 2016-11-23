package featureModel_MM;

import java.util.ArrayList;

public class Excludes extends Constraint {

/** Attributes **/
	
	ArrayList<Feature> pair;

/** Constructors **/
	
	public Excludes(Feature f1, Feature f2){
		pair = new ArrayList<Feature>();
		pair.add(f1);
		pair.add(f2);
	}
	
	public void setNewPair(Feature f1, Feature f2){
		pair.clear();
		pair.add(f1);
		pair.add(f2);
	}
	
	public ArrayList<Feature> getPair(){
		return pair;
	}
	

/** GET FAMILIAR SYNTAX **/
	
	public String familiarSyntax(){
		return "(!"+pair.get(0).getName()+"|!"+pair.get(1).getName()+"); ";
		
	}

}
