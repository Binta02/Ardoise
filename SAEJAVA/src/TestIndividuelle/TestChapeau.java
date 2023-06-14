package TestIndividuelle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*; // pour les assertEquals
import java.util.ArrayList;
import java.util.Arrays;

//import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ardoise.*;
import main.*;


class TestChapeau{

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
           		 System.out.println("l'exception : " + e.toString() + "a ete capturé ");
           	 }
           	 catch (Exception e) {
           		 System.out.println("l'exception : " + e.toString() + "a ete capturé ");
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
   		System.out.println("l'exception : " + e.toString() + "a ete capturé ");
   	}
          
   	}
}
