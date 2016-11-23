package featureModel_MM;

public class TestFM {

	public static void main(String[] args) {
		
		System.out.print("e_commerce = "); 
		testFmECommerce();
		
		System.out.print("cell_phone = ");
		testFmCellPhone();
		

	}
	
	
	public static void testFmECommerce(){
		
	/** CREATING FEATURES **/
		
		Feature Ec = new Feature("e_commerce");
		
		Feature Ca = new Feature("catalog");
		Feature G = new Feature("grid");
		Feature L = new Feature("list");
		Feature Pm = new Feature("payment_method");
		Feature Ch = new Feature("check");
		Feature Cc = new Feature("credit_card");
		Feature B = new Feature("basket");
	
	/** CREATING GROUPS **/
		
		FeatureGroup g_catalog = new FeatureGroup(Ca, true);
		g_catalog.addFeatureInGroup(G);
		g_catalog.addFeatureInGroup(L);
		
		FeatureGroup g_payment_method = new FeatureGroup(Pm, false);
		g_payment_method.addFeatureInGroup(Ch);
		g_payment_method.addFeatureInGroup(Cc);
		
		
	/** CREATING FEATURE TREE **/
		
		Ec.addFeatureChild(Ca, true);
		Ec.addFeatureChild(Pm, false);
		Ec.addFeatureChild(B, false);
		Ca.addFeatureGroupChild(g_catalog);
		Pm.addFeatureGroupChild(g_payment_method);
		
	/** CREATING FEATURE MODEL **/
		
		FeatureModel eCommerce = new FeatureModel(Ec);
		
	/** CREATING AND ADDING CTCs **/
		
		Includes c1 = new Includes(Pm, B);
		Includes c2 = new Includes(B, Pm);
		eCommerce.addCrossTreeConstraint(c1);
		eCommerce.addCrossTreeConstraint(c2);
		
		
	/** DISPLAY IN FAMILIAR **/
		
		System.out.println(eCommerce.familiarSyntax());
	}
	
	
	public static void testFmCellPhone(){
		
		/** CREATING FEATURES **/
		
		Feature C = new Feature("Cell_Phone");
		
		Feature W = new Feature("Wireless");
		Feature I = new Feature("Infrared");
		Feature B = new Feature("Bluetooth");
		Feature D = new Feature("Display");
		Feature G = new Feature("Games");
		Feature Mu = new Feature("Multi_Player");
		Feature Si = new Feature("Single_Player");
		Feature Ar = new Feature("Artificial_Oponent");
		Feature A = new Feature("Accu_Cell");
		Feature S = new Feature("Strong");
		Feature M = new Feature("Medium");
		Feature We = new Feature("Weak");
		
		/** CREATING GROUPS **/
		
		FeatureGroup g_wireless = new FeatureGroup(W, false);
		g_wireless.addFeatureInGroup(I);
		g_wireless.addFeatureInGroup(B);
		
		FeatureGroup g_games = new FeatureGroup(G, false);
		g_games.addFeatureInGroup(Mu);
		g_games.addFeatureInGroup(Si);
		
		FeatureGroup g_accu_cell = new FeatureGroup(A, true);
		g_accu_cell.addFeatureInGroup(S);
		g_accu_cell.addFeatureInGroup(M);
		g_accu_cell.addFeatureInGroup(We);
		
		/** CREATING FEATURE TREE **/
		
		C.addFeatureChild(W, false);
		C.addFeatureChild(D, true);
		C.addFeatureChild(G, true);
		C.addFeatureChild(A, true);
		
		W.addFeatureGroupChild(g_wireless);
		
		G.addFeatureGroupChild(g_games);
		
		Si.addFeatureChild(Ar, true);
		
		A.addFeatureGroupChild(g_accu_cell);
		
		FeatureModel cell_phones = new FeatureModel(C);
		
		
		/** DISPLAY IN FAMILIAR **/
		System.out.println(cell_phones.familiarSyntax());
		
	}

}
