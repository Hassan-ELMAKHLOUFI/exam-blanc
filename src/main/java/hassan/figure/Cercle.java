package hassan.figure;

import hassan.traitement.Traitement;

import java.io.Serializable;

public class Cercle extends Figure implements Serializable {

    private point centre =new point();
    private double rayon=2 ;
    private Traitement traitement ;


    public Cercle(int x, int y, double rayon) {
        this.centre = new point(x,y);
        this.rayon = rayon;
    }

    public Cercle() {

    }
    @Override
    public double perimetre() {
        return rayon*3.14;
    }

    @Override
    public double surface() {
        return 2*3.14*rayon;
    }

    @Override
    public void dessigner() {

    }



    @Override
    public void afficher() {
        System.out.println("------------------");
        System.out.println("le figure est une circle de rayon "+rayon+"du centre X "+centre.X+" Y "+centre.Y);
        System.out.println("le perimetre est : "+ perimetre());
        System.out.println("la surface  est : "+ surface());

    }
}
