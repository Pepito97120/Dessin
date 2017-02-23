
public abstract class Figure implements Dessinable{
	private int X, Y;
	private int R, G, B;
	
	//constructeurs
	public Figure() {
		this.setX(0);
		this.setY(0);
		this.setR(0);
		this.setG(0);
		this.setB(0);
	}
	public Figure(Figure fig) {
		this.setX(fig.getX());
		this.setY(fig.getY());
		this.setR(fig.getR());
		this.setG(fig.getG());
		this.setB(fig.getB());
		
	}
	public Figure (int X, int Y, int R, int G, int B) {
		this.setX(X);
		this.setY(Y);
		this.setR(R);
		this.setG(G);
		this.setB(B);
	}
	
	//implémentation des méthodes de Positionnable - Dessinable
	public int getX() {
		return this.X;
	}
	public int getY() {
		return this.Y;
	}
	public void setX(int X) {
		this.X = X;
	}
	public void setY(int Y) {
		this.Y = Y;
	}
	
	//méthodes de Coloriable
	public int getR() {
		return this.R;
	}
	public int getG() {
		return this.G;
	}
	public int getB() {
		return this.B;
	}
	public void setR(int R) {
		this.R = R;
	}
	public void setG(int G) {
		this.G = G;
	}
	public void setB(int B) {
		this.B = B;
	}
	
	public abstract void CalculerSurface();
}
