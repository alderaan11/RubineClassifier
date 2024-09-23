package algebre;

import java.util.ArrayList;

//matrices carrees
public class Matrice {
	private final double[][] m;
	private final int dimension;

	public Matrice(double[][] coefs) {
		dimension = coefs[0].length;
		m = new double[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				m[i][j] = coefs[i][j];
			}
		}
	}
	
	public static Matrice covariance(ArrayList<Matrice> l) {
		//todo
		return null; // à changer pour le résultat
	}
	
	public static Matrice computeAverageMatrixFromMatrixList(ArrayList<Matrice> l) {
		//todo
		return null; // à changer pour le résultat
	}

	private double get(int i, int j) {
		//todo
		return 0; // à changer pour le résultat	
	}
	
	public Vecteur getColumn(int k) {
		//todo
		return null; // à changer pour le résultat
	}

	static Matrice identity(int n) {
		//todo
		Matrice m = new Matrice(new double[n][n]);
		for (int i = 0; i < n; i++) {
			m.m[i][i] = 1;
		}
		return m;
	}

	public double max(Matrice m, int i) {
		double res = m.get(i,0);
  		for ( int j = 1; j < m.dimension-1; j++) {
			if (m.get(i,j) > res) {
				res = m.get(i,j);
			}
		}
		return null; // à changer pour le résultat
	}
	public Matrice inverse() {
		// todo -> calculer l'inverse de this, lorsqu'elle est inversible
		// retourner l'inverse lorsqu'elle existe et null lorsqu'elle n'existe pas.

		Matrice m = identity(this.dimension);

		for (int k =0; k < dimension; k++) {
			
		}

		return null; // à changer pour le résultat
	}

	private void computeDeterminant(int i, int j) {
		//todo -> calculer le déterminant et le conserver dans this.determinant
	}
}
