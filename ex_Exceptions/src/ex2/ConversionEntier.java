package ex2;

public class ConversionEntier {
	
	 public static void convertirEnEntier(String nombre) {
	        
		 try {
	            int resultat = Integer.parseInt(nombre);
	            System.out.println("Conversion réussie : " + resultat);
	        } catch (NumberFormatException e) {
	            System.out.println("Erreur : La saisie '" + nombre + "' n'est pas un nombre valide.");
	        } finally {
	            System.out.println("Bloc finally : Conversion terminée.");
	        }
	    }

	    public static void main(String[] args) {
	    	
	        String saisie1 = "123";
	        String saisie2 = "abc";

	        System.out.println("Test avec la saisie : " + saisie1);
	        convertirEnEntier(saisie1);

	        System.out.println("\nTest avec la saisie : " + saisie2);
	        convertirEnEntier(saisie2);
	    }

}
