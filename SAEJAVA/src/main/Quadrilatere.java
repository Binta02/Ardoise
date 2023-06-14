package main;
import ardoise.*;
// important

import java.util.ArrayList;


public class Quadrilatere extends Forme {
	
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;
    private PointPlan p4;
    
    
    public Quadrilatere() {
   	 super();
    }
    
    public Quadrilatere(String nom, PointPlan unp1, PointPlan unp3) {
    	 super(nom);
        this.p1 = unp1;
        this.p3 = unp3;
        
        // Calcul des autres points
        this.p2 = new PointPlan(unp3.getAbscisse(), unp1.getOrdonnee());
        this.p4 = new PointPlan(unp1.getAbscisse(), unp3.getOrdonnee());
        
    }
    
    
    public Quadrilatere(String nom, PointPlan porte_p1, PointPlan porte_p2, PointPlan porte_p3, PointPlan porte_p4) {
        super(nom);
        this.p1 = porte_p1;
        this.p2 = porte_p2;
        this.p3 = porte_p3;
        this.p4 = porte_p4;
    }

	public PointPlan getP1() {
        return this.p1;
    }
    
    public void setP1(PointPlan p1) {
        this.p1 = p1;
    }
    
    public PointPlan getP2() {
        return this.p2;
    }
    
    public void setP2(PointPlan p2) {
        this.p2 = p2;
    }
    
    public PointPlan getP3() {
        return this.p3;
    }
    
    public void setP3(PointPlan p3) {
        this.p3 = p3;
    }
    
    public PointPlan getP4() {
        return this.p4;
    }
    
    public void setP4(PointPlan p4) {
        this.p4 = p4;
    }
    
    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<Segment>();
        segments.add(new Segment(p1, p2));
        segments.add(new Segment(p2, p3));
        segments.add(new Segment(p3, p4));
        segments.add(new Segment(p4, p1));
        return segments;
    }

	@Override
	public void deplacer(int dx, int dy) {
		this.p1.deplacer(dx, dy);
		this.p2.deplacer(dx, dy);
		this.p3.deplacer(dx, dy);
		this.p4.deplacer(dx, dy);
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public String typeForme() {
		// TODO Auto-generated method stub
		return "Q";
	}
	public String toString() {
	    return "Quadrilatere [type=" + typeForme() + ", point1=" + this.p1 + ", point2=" + this.p2
	            + ", point3=" + this.p3 + ", point4=" + this.p4 + "]";
	}
}