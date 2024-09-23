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
		return m[i][j];
	}
	
	public Vecteur getColumn(int k) {
		//todo
		return null; // à changer pour le résultat
	}

	public static Matrice identity(int n) {
		//todo
		Matrice m = new Matrice(new double[n][n]);
		for (int i = 0; i < n; i++) {
			m.m[i][i] = 1;
		}
		return m;
	}

	static Matrice exchange(Matrice m, int i, int j) {
		Matrice res = new Matrice(m.m);
		double[] temp = res.m[i];
		res.m[i] = res.m[j];
		res.m[j] = temp;
		return res;
	}

	public Matrice exchangeRows(Matrice m, int j) {
		double res = m.get(j,j);
		int change = j;
		for (int i = j; i < m.dimension; i++) {
			if (m.get(i,j) > res) {
				res = m.get(i,j);
				change = i;
			}
		}
		m = exchange(m, change,j);
		return m;
	}


	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				sb.append(m[i][j]);
				sb.append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public Matrice inverse() {
		// retourner l'inverse lorsqu'elle existe et null lorsqu'elle n'existe pas.

		Matrice m_identity = identity(this.dimension);
		Matrice res = new Matrice(this.m);

		for (int k =0; k < dimension; k++) {
			// passer la ligne avec le plus grand coefficient pour la colonne j à la ligne i tq i=j
			res = exchangeRows(res, k);

			if (this.get(k,k) == 0) {
				return null;
			}


			for (int i = 0; i < dimension; i++) { // pour chaque ligne
				if (i != k) {
					double coef = res.get(i,k) / res.get(k,k);
					for (int j = 0; j < dimension; j++) {
						res.m[i][j] = res.m[i][j] - coef * res.m[k][j];
						m_identity.m[i][j] = m_identity.m[i][j] - coef * m_identity.m[k][j];
					}
				}
			}
		}

		return res;
	}

	private void computeDeterminant(int i, int j) {
		//todo -> calculer le déterminant et le conserver dans this.determinant
	}
}
