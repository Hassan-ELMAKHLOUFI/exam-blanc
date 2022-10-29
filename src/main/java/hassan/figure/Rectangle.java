package hassan.figure;

import java.io.Serializable;

public class Rectangle extends Figure implements Serializable {

    private point coinGauche =new point();

    private double L ;
    private double H ;

    public Rectangle(point coinGauche, double l, double h) {
        this.coinGauche = coinGauche;
        L = l;
        H = h;
    }
    public Rectangle() {

    }



    public point getCoinGauche() {
        return coinGauche;
    }

    public void setCoinGauche(point coinGauche) {
        this.coinGauche = coinGauche;
    }

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    @Override
    public double perimetre() {
        return L*H;
    }

    @Override
    public double surface() {
        return 2*(L+H);
    }

    @Override
    public void dessigner() {

    }


    @Override
    public void afficher() {
        System.out.println("------------------");
        System.out.println("le figure est un rectangle de Longuer "+L+" du hauteur "+H);
        System.out.println("le perimetre est :"+ perimetre());
        System.out.println("la surface  est :"+ surface());

    }


}
