import hassan.figure.Cercle;
import hassan.figure.Dessin;
import hassan.figure.Rectangle;
import hassan.figure.point;
import hassan.parametrage.ObjetParametrageImpl;
import hassan.traitement.Traitement;
import hassan.traitement.TraitementV1;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

        Dessin dessin = new Dessin();


        Cercle cercle = new Cercle(1,2,3);
        Cercle cercle1 = new Cercle(2,3,4);
        Rectangle rectangle = new Rectangle(new point(5,2),2,1);
        dessin.ajouterDessin(cercle);
        dessin.ajouterDessin(cercle1);
        dessin.ajouterDessin(rectangle);
        dessin.afficher();


        ObjetParametrageImpl objetParametrage = new ObjetParametrageImpl() ;
        objetParametrage.addAllFigures(dessin.getFigures());
        objetParametrage.setCouleurRemp(25);


        Dessin dessin2 = new Dessin();
        dessin2.ajouterDessin(new Cercle(2,5,5));
        dessin2.ajouterDessin(new Rectangle(new point(2,2),5,4));


        dessin.ajouterDessin(dessin2);

        Traitement traitement = new TraitementV1();
        dessin.setTraitement(traitement);
        dessin.traiter();

        dessin.serialiser("./test");
        dessin.afficher();




    }
}
