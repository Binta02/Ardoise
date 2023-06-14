package Test;
import main.*;
import ardoise.*;
//import java.util.*;

public class Main {

		public static void main(String[] args) {
			Ardoise ardoise1 = new Ardoise();
	        ardoise1.dessinerGraphique();
		
			// Oiseau 1
	        PointPlan p1 = new PointPlan(118, 13);
	        PointPlan p2 = new PointPlan(123, 20);
	        PointPlan p3 = new PointPlan(128, 13);
	        Forme oiseau1 = new Chapeau("oiseau 1", p1, p2, p3);
	        ardoise1.ajouterForme(oiseau1);
	        oiseau1.dessiner();
           //oiseau1.deplacer(10, 20);
	        
	      //Oiseau 2
	        PointPlan p4 = new PointPlan(133, 30);
	        PointPlan p5 = new PointPlan(136, 32);
	        PointPlan p6 = new PointPlan(138, 30);
	        Forme oiseau2 = new Chapeau("oiseau 2", p4, p5, p6);
	        ardoise1.ajouterForme(oiseau2);
	        oiseau2.dessiner();

	        // Oiseau 3
	        PointPlan p7 = new PointPlan(142, 14);
	        PointPlan p8 = new PointPlan(144, 17);
	        PointPlan p9 = new PointPlan(146, 14);
	        Forme oiseau3 = new Chapeau("oiseau 3", p7, p8, p9);
	        ardoise1.ajouterForme(oiseau3);
	        oiseau2.dessiner();
	        
	        
	     // Tour
	        PointPlan p10 = new PointPlan(9, 100);
	        PointPlan p11 = new PointPlan(20, 198);
	        
	        Forme tour = new Quadrilatere("tour", p10, p11);
	        ardoise1.ajouterForme(tour);
	        tour.dessiner();
	         
	     // Forme composée - Maison
	        PointPlan p14 = new PointPlan(80, 140);
	        PointPlan p15 = new PointPlan(180, 140);
	        PointPlan p16 = new PointPlan(180, 198);
	        PointPlan p17 = new PointPlan(80, 198);
	        Quadrilatere corps = new Quadrilatere("Corps maison", p14, p15, p16, p17);

	        PointPlan p18 = new PointPlan(130, 100);
	        Chapeau toit = new Chapeau("Toit maison", p14, p18, p15);

	        PointPlan p19 = new PointPlan(120, 170);
	        PointPlan p20 = new PointPlan(140, 170);
	        PointPlan p21 = new PointPlan(140, 198);
	        PointPlan p22 = new PointPlan(120, 198);
	        Quadrilatere porte = new Quadrilatere("Porte maison", p19, p20, p21, p22);

	        FormeComposee maison = new FormeComposee("maison");
	        maison.ajouterForme(corps);
	        maison.ajouterForme(toit);
	        maison.ajouterForme(porte);

	        ardoise1.ajouterForme(maison);
	        maison.dessiner();
	        
	        
	     // Etoile
	        
	        PointPlan p23 = new PointPlan(170, 52);
	        PointPlan p24 = new PointPlan(173, 45);
	        PointPlan p25 = new PointPlan(177, 52);
	        Chapeau branche1 = new Chapeau("Branche 1", p23, p24, p25);
	       // ardoise1.ajouterForme(branche1);
	        
	        //branche1.dessiner();	        
	        PointPlan p26 = new PointPlan(177,52);
	        PointPlan p27 = new PointPlan(184, 57);
	        PointPlan p28 = new PointPlan(177, 60);
	        Chapeau branche2 = new Chapeau("Branche 2", p26, p27, p28);
	        //ardoise1.ajouterForme(branche2);
	        //branche2.dessiner();


	        PointPlan p29 = new PointPlan(177, 60);
	        PointPlan p30 = new PointPlan(174,66);
	        PointPlan p31 = new PointPlan(170,60);
	        Chapeau branche3 = new Chapeau("Branche 3", p29, p30, p31);
	        //ardoise1.ajouterForme(branche3);
	        //branche3.dessiner();

	        PointPlan p32 = new PointPlan(170,60);
	        PointPlan p33 = new PointPlan(164,57);
	        PointPlan p34 = new PointPlan(170,52);
	        Chapeau branche4 = new Chapeau("Branche 4", p32, p33, p34);
	        //branche4.dessiner();
	        FormeComposee etoile = new FormeComposee("etoile");
	        etoile.ajouterForme(branche1);
	        etoile.ajouterForme(branche2);
	        etoile.ajouterForme(branche3);
	        etoile.ajouterForme(branche4);
	        ardoise1.ajouterForme(etoile);
	        etoile.dessiner();   

	        
	        PointPlan p35 = new PointPlan(3,14);
	        PointPlan p36 = new PointPlan(43,3);
	        PointPlan p37 = new PointPlan(112,14);
	        Forme Montagne1 = new Triangle("Montagne 1", p35,p36,p37);
	        ardoise1.ajouterForme(Montagne1);
	        Montagne1.dessiner();	
	        
	        PointPlan p38 = new PointPlan(152,7);
	        PointPlan p39 = new PointPlan(166,3);
	        PointPlan p40 = new PointPlan(172,7);
	        Forme Montagne2 = new Triangle("Montagne 2", p38,p39,p40);
	        ardoise1.ajouterForme(Montagne2);
	        Montagne2.dessiner();		        
	        
	     // Attendre 1 seconde
	        try {
	            Thread.sleep(1000);
	            ardoise1.deplacer("C", 10, 20);
	          
	        } 
	        
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	      //ardoise1.test();  
	}
	}






        