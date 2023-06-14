package TestIndividuelle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ardoise.Forme;
import ardoise.PointPlan;
import main.FormeComposee;
import main.Quadrilatere;

class TestFormeCompose {
	
	@Test
	public void verifiFormeComposee() {
	    FormeComposee formeComposee = new FormeComposee("FormeComposee");

	    PointPlan p1 = new PointPlan(0, 0);
	    PointPlan p2 = new PointPlan(1, 1);
	    Forme forme = new Quadrilatere("Quadrilatere", p1, p2);

	    formeComposee.ajouterForme(forme);

        // Vérifier le type de forme
        assertEquals("GF", formeComposee.typeForme(),"Le type du forme composée ne correspond pas");
        
	    formeComposee.dessiner();
	    // Vérifiez si la forme a été ajoutée avec succès
	    Assertions.assertTrue(formeComposee.getFormes().contains(forme));
	    formeComposee.deplacer(10, 30);
	    formeComposee.retirerForme(forme);

   	}
   	
   	

	@Test
	public void toStringFormeComposee() {
   		
   		FormeComposee formeComposee = new FormeComposee("FormeComposee");

	    PointPlan p1 = new PointPlan(0, 0);
	    PointPlan p2 = new PointPlan(1, 1);
	    Forme forme = new Quadrilatere("Quadrilatere", p1, p2);
	    formeComposee.ajouterForme(forme);
	    formeComposee.toString();
	    
	    // Vérifier la méthode toString()
   	    String formec = "FormeComposee";
   	    String formeIndividuelle = "Quadrilatere";
   	    assertTrue(formeComposee.toString().contains(formec), "La méthode toString() ne renvoie pas la chaîne attendue");
   	    assertTrue(formeComposee.toString().contains(formeIndividuelle), "La méthode toString() ne renvoie pas la chaîne attendue");


   	}

   	    

   	
   	
}
