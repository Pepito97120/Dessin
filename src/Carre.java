
abstract class Carre extends Rectangle{
	public Carre(int X, int Y, int R, int G, int B) {
		super(X, Y, R, G, B);
		// TODO Stub du constructeur g�n�r� automatiquement
	}

	@Override
	public void CalculerSurface() {
		System.out.println("Je suis un carr� (un rectangle particulier).");
		System.out.println("Mon aire se calcul selon la formule suivante:");
		System.out.println("A = c�");
	}
}
