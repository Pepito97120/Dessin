
abstract class Rectangle extends Figure{
	public Rectangle(int X, int Y, int R, int G, int B) {
		super(X, Y, R, G, B);
		// TODO Stub du constructeur généré automatiquement
	}

	@Override
	public void CalculerSurface() {
		System.out.println("Je suis un rectangle.");
		System.out.println("Ma surface se calcul selon la formule suivante:");
		System.out.println("A = L x l");
	}
}
