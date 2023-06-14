package Test;

import static org.junit.Assert.assertArrayEquals;
import java.util.Scanner;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import org.junit.jupiter.api.Test;
import ardoise.*;
import main.*;

class TestJunit {

    @Test
    public void testDessinerQuadrilatere() {
        PointPlan p1 = new PointPlan(10, 10);
        PointPlan p3 = new PointPlan(44, 44);
        Quadrilatere quadrilatere = new Quadrilatere("testDessinerQuadrilatere", p1, p3);

        // Vérifier le nombre de segments dessinés
        assertEquals(4, quadrilatere.dessiner().size());
    }

    @Test
    public void testDeplacerQuadrilatere() {
    	PointPlan p1 = new PointPlan(10, 10);
        PointPlan p3 = new PointPlan(44, 44);
        Quadrilatere quadrilatere = new Quadrilatere("testDeplacerQuadrilatere", p1, p3);

        // Déplacer le quadrilatère
        quadrilatere.deplacer(2, 2);

        // Vérifier les coordonnées des points après déplacement
        assertEquals(12, quadrilatere.getP1().getAbscisse());
        assertEquals(12, quadrilatere.getP1().getOrdonnee());
        assertEquals(46, quadrilatere.getP3().getAbscisse());
        assertEquals(46, quadrilatere.getP3().getOrdonnee());
    }

    @Test
    public void testTypeFormeQuadrilatere() {
        PointPlan p1 = new PointPlan(0, 0);
        PointPlan p3 = new PointPlan(4, 4);
        Quadrilatere quadrilatere = new Quadrilatere("testTypeQuadrilatere", p1, p3);

        // Vérifier le type de forme
        assertEquals("Q", quadrilatere.typeForme(),"Le type du quadrilatere ne correspond pas");
    }
    
    @Test
    public void testautresQuadrilatere() {
    	PointPlan p1 = new PointPlan(10, 10);
        PointPlan p2 = new PointPlan(20, 1);
        PointPlan p3 = new PointPlan(44, 44);
        PointPlan p4 = new PointPlan(100, 18);
        Quadrilatere quadrilatere = new Quadrilatere("testAutresQuadrilatere", p1, p2,p3,p4);
        
        quadrilatere.setP1((new PointPlan (18, 103)));
        quadrilatere.setP2((new PointPlan (2, 5)));
        quadrilatere.setP3((new PointPlan (22, 50)));
        quadrilatere.setP4((new PointPlan (22, 50)));
        //p4 = null;
        
     // Test assertNotNull and assertNull
        assertNotNull(quadrilatere.getP1(), "Le point p1 ne doit pas être null.");
        assertNotNull(quadrilatere.getP2(), "Le point p2 ne doit pas être null.");
        assertNotNull(quadrilatere.getP3(), "Le point p3 ne doit pas être null.");
        assertNotNull(quadrilatere.getP4(), "Le point p3 ne doit pas être null.");

    }

    // Ajouter d'autres tests selon vos besoins
    
    
    @Test
    void testDeplacerTriangle() {
    	try {
    	PointPlan p1 = new PointPlan(118, 13);
		    PointPlan p2 = new PointPlan(123, 20);
		    PointPlan p3 = new PointPlan(128, 13);
		    Triangle triangle = new Triangle("tesTriangle", p1, p2, p3);
		    triangle.deplacer(10, 20);

        PointPlan dep1 = new PointPlan(119, 15);
        PointPlan dep2 = new PointPlan(123, 22);
        //PointPlan dep3 = new PointPlan(130, 15);

        assertNotEquals(dep1, p1);
        assertNotEquals(dep2, p2);
        //assertEquals(dep3, p3);
        Triangle triangle1 = null;
        triangle1.deplacer(10, 20);
        
    	 }
    	 catch (NullPointerException e) {
    		 System.err.println("l'exception : " + e.toString() + "a ete capturé ");
    	 }
    	 catch (Exception e) {
    		 System.err.println("l'exception : " + e.toString() + "a ete capturé ");
    	 }
    }

	@Test
	void typeTriangle() {
	    PointPlan p1 = new PointPlan(118, 13);
	    PointPlan p2 = new PointPlan(123, 20);
	    PointPlan p3 = new PointPlan(128, 13);
	    Triangle triangle = new Triangle("testTriangle", p1, p2, p3);
	    assertEquals("T", triangle.typeForme(), "erreur sur le type du triangle");
	}
	    
	    @Test
	    void dessinTriangle() {
		    PointPlan p1 = new PointPlan(118, 13);
		    PointPlan p2 = new PointPlan(123, 20);
		    PointPlan p3 = new PointPlan(128, 13);
		    Triangle triangle = new Triangle("testTriangle", p1, p2, p3);
		    triangle.toString();
	    
		    // Test assertArrayEquals
		    ArrayList<Segment> segments = new ArrayList<>();
		    segments.add(new Segment(p1, p2));
		    segments.add(new Segment(p2, p3));
		    
		    //convertir les ArrayList<Segment> en tableaux en utilisant la méthode toArray()
		    assertArrayEquals("Les segments dessinés ne correspondent pas.", segments.toArray(), triangle.dessiner().toArray());
}
	    
   
       @Test
       void pointNullAvecUtilisateur() {
    	   try {
    	    PointPlan p1 = null;
    	    PointPlan p2 = null;
    	    PointPlan p3 = null;
    	    Triangle triangle = null;

    	    while (p1 == null || p2 == null || p3 == null) {
    	        System.out.println("Veuillez saisir les coordonnées des points (x, y) :");

    	        // Demande à l'utilisateur de saisir les coordonnées des points p1, p2 et p3
    	        Scanner scanner = new Scanner(System.in);

    	        System.out.print("Point p1 : ");
    	        int x1 = scanner.nextInt();
    	        int y1 = scanner.nextInt();
    	        p1 = new PointPlan(x1, y1);

    	        System.out.print("Point p2 : ");
    	        int x2 = scanner.nextInt();
    	        int y2 = scanner.nextInt();
    	        p2 = new PointPlan(x2, y2);

    	        System.out.print("Point p3 : ");
    	        int x3 = scanner.nextInt();
    	        int y3 = scanner.nextInt();
    	        p3 = new PointPlan(x3, y3);

    	    triangle = new Triangle("testTriangle", p1, p2, p3);
    	    }
    	    }
    	   catch (InputMismatchException e) {
    		   System.err.println("Vous avez provoquer "+ e.toString()+"\n"+ "Les points que vous avez renseignés sont incorrects Veuillez réessayer: ");
    		   pointNullAvecUtilisateur();
    	   }
    	    }
	
       @Test
   	void typeChapeau() {
   	    PointPlan p1 = new PointPlan(118, 13);
   	    PointPlan p2 = new PointPlan(123, 20);
   	    PointPlan p3 = new PointPlan(128, 13);
   	    Chapeau chapeau = new Chapeau("testChapeau", p1, p2, p3);
   	    assertEquals("C", chapeau.typeForme(), "erreur sur le type du Chapeau");
   	    assertNotEquals("A", chapeau.typeForme(), "erreur sur le type du Chapeau");
   	    chapeau.setP1((new PointPlan (18, 103)));
   	    chapeau.setP2((new PointPlan (2, 5)));
   	    chapeau.setP3((new PointPlan (22, 50)));
   	}
   	    
   	    @Test
   	    void dessinChapeau() {
   		    PointPlan p1 = new PointPlan(118, 13);
   		    PointPlan p2 = new PointPlan(123, 20);
   		    PointPlan p3 = new PointPlan(128, 13);
   		    Chapeau chapeau = new Chapeau("testChapeau", p1, p2, p3);
   	    
   		    // Test assertArrayEquals
   		    ArrayList<Segment> segments = new ArrayList<>();
   		    segments.add(new Segment(p1, p2));
   		    segments.add(new Segment(p2, p3));
   		    
   		    //convertir les ArrayList<Segment> en tableaux en utilisant la méthode toArray()
   		    assertFalse("Les segments dessinés ne correspondent pas.", Arrays.equals(segments.toArray(), chapeau.dessiner().toArray()));
   }
   	    
           
           @Test
           void pointNullChapeau() {
       	    PointPlan p1 = new PointPlan(118, 13);
       	    PointPlan p2 = new PointPlan(123, 20);
       	    PointPlan p3 = null;
       	    Chapeau chapeau = new Chapeau("testChapeau", p1, p2, p3);
       	    
   		 // Test assertNotNull and assertNull
   	        assertNotNull(chapeau.getP1(), "Le point p1 ne doit pas être null.");
   	        assertNotNull(chapeau.getP2(), "Le point p2 ne doit pas être null.");
   	        assertNull(chapeau.getP3(), "Le point p3 ne doit pas être null.");
   	        chapeau.toString();
   	}
   	
   	
           @Test
           void testDeplacerChapeau() {
           	try {
           	PointPlan p1 = new PointPlan(118, 13);
   		    PointPlan p2 = new PointPlan(123, 20);
   		    PointPlan p3 = new PointPlan(128, 13);
   		    Chapeau chapeau = new Chapeau("testChapeau", p1, p2, p3);
               chapeau.deplacer(1, 2);

               PointPlan dep1 = new PointPlan(119, 15);
               PointPlan dep2 = new PointPlan(123, 22);
               //PointPlan dep3 = new PointPlan(130, 15);

               assertNotEquals(dep1, p1);
               assertNotEquals(dep2, p2);
               //assertEquals(dep3, p3);
               Chapeau chapeau1 = null;
               chapeau1.deplacer(10, 20);

               }
           	 catch (NullPointerException e) {
           		 System.err.println("l'exception : " + e.toString() + "a ete capturé ");
           	 }
           	 catch (Exception e) {
           		 System.err.println("l'exception : " + e.toString() + "a ete capturé ");
           	 }
           }

   	@Test
   	public void testDessinerChapeau() {
          try {
       	   PointPlan p1 = new PointPlan(118, 13);
       	   PointPlan p2 = new PointPlan(123, 20);
       	   PointPlan p3 = new PointPlan(128, 13);
       	   Chapeau chapeau = new Chapeau("testChapeau", p1, p2, p3);

       	   ArrayList<Segment> segments = chapeau.dessiner();

       	   // Vérifier le nombre de segments générés
       	   assertEquals(2, segments.size());

       	   // Vérifier les coordonnées des segments
       	   	assertNotEquals(p1, segments.get(1).getPointArrivee());
       	   	assertNotEquals(p2, segments.get(0).getPointDepart());
       	   	assertNotEquals(p2, segments.get(1).getPointArrivee());
       	   	assertNotEquals(p3, segments.get(2).getPointDepart());
       }
   	catch (IndexOutOfBoundsException e)
   	{
   		System.err.println("l'exception : " + e.toString() + "a ete capturé ");
   	}
          
   	}
   	

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
	    assertTrue(formeComposee.getFormes().contains(forme));
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
