package ex1;

public class DivZero {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			  int numerateur = 10;
		        int denominateur = 0;

		        try {
		        	int resultat = numerateur / denominateur;
		            System.out.println("Résultat de la division : " + resultat);
		        } catch (ArithmeticException e) {
		        	System.out.println("Erreur : Division par zéro impossible !");
		        } finally {
		            System.out.println("Le programme s'est terminé correctement.");

		        }
		}

	}


