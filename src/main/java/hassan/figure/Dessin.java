package hassan.figure;

import hassan.traitement.Traitement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Dessin extends Figure implements Serializable {

     List<Figure> figures = new ArrayList<>();
     private Traitement traitement ;

    public Dessin(List<Figure> figures) {
        this.figures = figures;
    }
    public Dessin() {

    }
    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }



    @Override
    public double perimetre() {
        return 0;
    }

    @Override
    public double surface() {
        return 0;
    }

    @Override
    public void dessigner() {

    }

    public Dessin(List<Figure> figures, Traitement traitement) {
        this.figures = figures;
        this.traitement = traitement;
    }

    public Traitement getTraitement() {
        return traitement;
    }

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }

    public void ajouterDessin(Figure figure){
        figures.add(figure);
    }
    public void SupprimerDessin(Figure figure){
        figures.remove(figure);
    }
    public void serialisation () {
        System.out.println("serialisation du dessin");
    }
    public void traiter() {
        traitement.traiter();
    }

    @Override
    public void afficher() {
        System.out.println("-------------Le dessin -------------");
        for (int i = 0; i < figures.size(); i++) {
            figures.get(i).afficher();
        }
    }

    public void serialiser(String filePath) throws IOException {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(this.getFigures());
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
