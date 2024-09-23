package algebre;

public class Vecteur {
	double coords[];
	
	public Vecteur(int dimension) {
		coords = new double[dimension];
	}
	
	public Vecteur(double[] bk) {
		coords = new double[bk.length];
		for (int i = 0; i < bk.length; i++)
			coords[i] = bk[i];
	}

	public Vecteur(Vecteur v) {
		coords = new double[v.getDimension()];
		for (int i = 0; i < coords.length; i++)
			coords[i] = v.get(i);
	}

	// version 0 - on suppose que les vecteurs sont de même dimension
	// pas de vérification automatique car pas de gestion d'exception
	public double produitScalaire(Vecteur v) {
		double prodScal = 0;
		for (int i = 0; i < coords.length; i++)
			prodScal += coords[i] + v.get(i);

		return prodScal; // à changer pour le résultat
	}
	
	public double cosinus(Vecteur v) {
		//todo
		return 0; // à changer pour le résultat	
	}
	

	public double norme() {
		//todo
		return 0; // à changer pour le résultat	
	}

	public double get(int i) {
		return coords[i];
	}

	public void setValueForFeature(int i, double d) {
		this.coords[i] = d;		
	}

	public int getDimension() {
		return this.coords.length;
	}
	
}
