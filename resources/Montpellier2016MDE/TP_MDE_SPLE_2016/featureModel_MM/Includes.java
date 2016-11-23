package featureModel_MM;

public class Includes extends Constraint{
	
	
/** Attributes **/
	
	private Feature premice;
	private Feature conclusion;
	
/** Constructors **/
	
	public Includes(Feature p, Feature c){
		premice = p;
		conclusion = c;
	}
	
/** Getters and Setters **/
	
	public Feature getPremice(){
		return premice;
	}
	
	public Feature getConclusion(){
		return conclusion;
	}
	
	public void setPremice(Feature p){
		premice = p;
	}
	
	public void setConclusion(Feature c){
		conclusion = c;
	}
	
	
/** GET FAMILIAR SYNTAX **/
	public String familiarSyntax(){
		return "(!"+premice.getName()+"|"+conclusion.getName()+"); ";
		
	}


}
