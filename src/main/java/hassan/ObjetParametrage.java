package hassan;

import java.util.List;

public interface ObjetParametrage {

    public void addFigure(Figure figure) ;
    public void addAllFigures(List<Figure> figures);
    public void removeFigure(Figure figure) ;
    public void notifyFigures() ;
}
