import hassan.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Dessin dessin = new Dessin();
        Scanner scanner = new Scanner(System.in);
        String str ;
        for (int i = 0; i < 3; i++) {
            System.out.println("--------------------");
            System.out.println("Donnez le nom de l'implimentation ");
            str =scanner.nextLine();
            Figure  figure= (Figure) Class.forName("hassan."+str).newInstance();
            dessin.ajouterDessin(figure);
        }
        ObjetParametrageImpl objetParametrage = new ObjetParametrageImpl() ;
        objetParametrage.addAllFigures(dessin.getFigures());

        objetParametrage.setCouleurRemp(25);
        objetParametrage.setEpaisseur(2);
        objetParametrage.setCouleurCout(15);

        Dessin dessin2 = new Dessin();
        dessin2.ajouterDessin(new Cercle(2,5,5));
        dessin2.ajouterDessin(new Rectangle(new point(2,2),5,4));
        dessin.ajouterDessin(dessin2);

        Traitement traitement = new TraitementV1();
        dessin.setTraitement(traitement);
        dessin.traiter();
        dessin.afficher();




    }
}
