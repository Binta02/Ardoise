package TestIndividuelle;

//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import java.util.Arrays;

import ardoise.*;
import main.*;

import org.junit.jupiter.api.Test;

class TestQuadrilatere {

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
    
}
