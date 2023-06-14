package main;
import java.util.ArrayList;
import ardoise.*;


public class FormeComposee extends Forme {
    private ArrayList<Forme> formes;

    
    public FormeComposee() {
        super();
    }
    
    public FormeComposee(String nom) {
        super(nom);
        this.formes = new ArrayList<Forme>();
    }
    

    public void ajouterForme(Forme forme) {
    	this.formes.add(forme);
    }

    
    public void retirerForme(Forme forme) {
    	this.formes.remove(forme);
    }

    
    public ArrayList<Forme> getFormes() {
        return this.formes;
    }

    
    @Override
    public ArrayList<Segment> dessiner() {
    	
        ArrayList<Segment> segments = new ArrayList<>();
        for (Forme forme : this.formes) {
            segments.addAll(forme.dessiner());
        }
        return segments;
    }
    

    @Override
    public void deplacer(int dx, int dy) {
        for (Forme forme : this.formes) {
            forme.deplacer(dx, dy);
        }
    }

    @Override
    public String typeForme() {
    	return "GF";
    }

    @Override
    public String toString() {
        String result = super.toString() + ": ";
        for (int i = 0; i < this.formes.size(); i++) {
            result += this.formes.get(i).toString();
            if (i != this.formes.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }

}
