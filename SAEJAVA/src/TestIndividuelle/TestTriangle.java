package TestIndividuelle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*; // pour les assertEquals
import java.util.ArrayList;
//import java.util.Arrays;

//import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ardoise.*;
import main.*;


class TestTriangle {
	
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
    		 System.out.println("l'exception : " + e.toString() + "a ete capturé ");
    	 }
    	 catch (Exception e) {
    		 System.out.println("l'exception : " + e.toString() + "a ete capturé ");
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
       void pointNullTriangle() {
   	    PointPlan p1 = new PointPlan(118, 13);
   	    PointPlan p2 = new PointPlan(123, 20);
   	    PointPlan p3 = null;
   	    Triangle triangle = new Triangle("testTriangle", p1, p2, p3);
   	    
   	    
		 // Test assertNotNull and assertNull
	        assertNotNull(triangle.getA(), "Le point p1 ne doit pas être null.");
	        assertNotNull(triangle.getB(), "Le point p2 ne doit pas être null.");
	        assertNull(triangle.getC(), "Le point p3 ne doit pas être null.");
	        
	        triangle.setA((new PointPlan (18, 103)));
	        triangle.setB((new PointPlan (2, 5)));
	        triangle.setC((new PointPlan (22, 50)));
	}
	
}


