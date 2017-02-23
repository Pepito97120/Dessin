
public abstract class Cercle extends Figure{
	public Cercle(int X, int Y, int R, int G, int B) {
		super(X, Y, R, G, B);
		// TODO Stub du constructeur généré automatiquement
	}

	@Override
	public void CalculerSurface() {
		System.out.println("Je suis un Cercle!");
		System.out.println("Mon aire se calcul selon la formule suivante:");
		System.out.println("A = pi * r ²");
	}
}
