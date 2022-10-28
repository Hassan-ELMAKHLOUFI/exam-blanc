package hassan.figure;

import hassan.parametrage.ObjetParametrage;
import hassan.parametrage.ObjetParametrageImpl;

public abstract class Figure
{

    int epaisseur;
    int couleurCout ;
    int couleurRemp;
    ObjetParametrage objetParametrage ;

    public  void update (ObjetParametrage objetParametrage){
        couleurCout =((ObjetParametrageImpl) objetParametrage).getCouleurCout();
        epaisseur =((ObjetParametrageImpl) objetParametrage).getEpaisseur(); ;
        couleurRemp = ((ObjetParametrageImpl) objetParametrage).getCouleurRemp();
    }
   public  abstract double perimetre();
    public  abstract double surface();
    public  abstract void dessigner();

    public abstract  void afficher() ;
}
