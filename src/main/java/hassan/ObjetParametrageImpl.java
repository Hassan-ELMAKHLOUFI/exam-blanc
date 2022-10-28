package hassan;

import java.util.ArrayList;
import java.util.List;

public class ObjetParametrageImpl implements ObjetParametrage {

   private  int epaisseur;
   private int couleurCout;
   private int couleurRemp;
    List<Figure> figures = new ArrayList<>();

    @Override
    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    @Override
    public void addAllFigures(List<Figure> figures) {
        this.figures.addAll(figures);
    }

    @Override
    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public void notifyFigures() {
        for (Figure o : figures) {
            o.update(this);
        }
    }

    public int getEpaisseur() {
        return epaisseur;

    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
        notifyFigures();
    }

    public int getCouleurCout() {
        return couleurCout;
    }

    public void setCouleurCout(int couleurCout) {
        this.couleurCout = couleurCout;
        notifyFigures();
    }

    public int getCouleurRemp() {
        return couleurRemp;
    }

    public void setCouleurRemp(int couleurRemp) {
        this.couleurRemp = couleurRemp;
        notifyFigures();
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}