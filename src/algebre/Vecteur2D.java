package algebre;

public class Vecteur2D extends Vecteur {
	public Vecteur2D(double x, double y) {
		super(2);
		coords[0] = x;
		coords[1] = y;
	}
	
// sinus de l'angle du vecteur i (axe des abscisses) à this
	public double sinus() {
		return coords[1] / norme();
	}
	
	public double sinus(Vecteur2D v) {
		return det(v) / (norme() * v.norme());
	}
	
	private double det(Vecteur2D v) {
		return 0;
	}

// cosinus de l'angle de i à this
	public double cosinus() {
		//todo		
		return 0; //à remplacer par le résultat
	}
	
// tangente de l'angle de i à this
// attention this ne doit pas être vertical...
	public double tangente() {
		//todo		
		return 0; //à remplacer par le résultat
	}
	
	public double angle() {
		//todo		
		return 0; //à remplacer par le résultat
	}

	public void setCoords(double x, double y) {
		this.coords[0] = x;
		this.coords[1] = y;
	}

	public double angle(Vecteur2D s2) {
		//todo		
		return 0; //à remplacer par le résultat
	}


}
