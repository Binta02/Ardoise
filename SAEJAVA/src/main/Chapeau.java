package main;
import ardoise.*;

//important


import java.util.ArrayList;

public class Chapeau extends Forme {
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;
    
    // Constructeur
    public Chapeau() {
        super();
    }
    
    public Chapeau(String nom, PointPlan p1, PointPlan p2, PointPlan p3) {
        super(nom);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    

    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<Segment>();
        segments.add(new Segment(p1, p2));
        segments.add(new Segment(p2, p3));
        return segments;
    }
    
    public void deplacer(int dx, int dy){
        p1.deplacer(dx, dy);
        p2.deplacer(dx, dy);
        p3.deplacer(dx, dy);
    }
    
    public String typeForme() {
        return "C";
    }
    
   public String toString() {
        return super.toString()+ this.p1 + "-" + this.p2+ "-" + this.p3;
    }
    
public PointPlan getP1() {
		
		return this.p1;
	}
	
public PointPlan getP2() {
		
		return this.p2;
	}

public PointPlan getP3() {
		
		return this.p3;
	}

public void setP1(PointPlan point1) {
	this.p1=point1;

	
	}
public void setP2(PointPlan point2) {
	this.p2=point2;

	
	}
public void setP3(PointPlan point3) {
	this.p3=point3;
	
	}
}