package main;
import ardoise.*;

import java.util.ArrayList;

//important

public class Triangle extends Forme {

    // Attributs
    private PointPlan a;
    private PointPlan b;
    private PointPlan c;

    // Constructeurs
    public Triangle() {
    	super();
    }

    public Triangle(String nom, PointPlan a, PointPlan b, PointPlan c) {
        super(nom);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters et setters
    public PointPlan getA() {
        return this.a;
    }

    public void setA(PointPlan a) {
        this.a = a;
    }

    public PointPlan getB() {
        return this.b;
    }

    public void setB(PointPlan b) {
        this.b = b;
    }

    public PointPlan getC() {
        return this.c;
    }

    public void setC(PointPlan c) {
        this.c = c;
    }

    // Méthodes
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.add(new Segment(a, b));
        segments.add(new Segment(a, c));
        segments.add(new Segment(b, c));

        return segments;
    }
    

    public void deplacer(int dx, int dy) {
    	this.a.deplacer(dx, dy);
    	this.b.deplacer(dx, dy);
    	this.c.deplacer(dx, dy);
    }

    public String typeForme() {
        return "T";
    }

    public String toString() {
        return super.toString() + ", avec les points A(" + a.getAbscisse() + "," + this.a.getOrdonnee() + "), B(" + this.b.getAbscisse() + "," + this.c.getOrdonnee()
                + ") et C(" + c.getAbscisse() + "," + c.getOrdonnee() + ")";
    }

}