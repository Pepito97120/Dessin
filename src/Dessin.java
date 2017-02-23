
public class Dessin { //changer en main
	private Figure figure;
	
	public Figure getFigure() {
		return this.figure;
	}
	public void setFigure(Figure figure) {
		this.figure = figure;
	}
	public static void Dessiner(Figure figure) {
		System.out.println("je suis une figure particulière de type  : "+figure);		
	}
}
