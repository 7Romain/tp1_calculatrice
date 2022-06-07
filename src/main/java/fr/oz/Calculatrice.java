package fr.oz;

import fr.oz.exceptions.pasOperateurException;

public class Calculatrice {
    public static final String FORMAT_SORTIE = "%2.2f %s %2.2f = %2.2f \n ";

    public static double calculer(char operateur, double var1, double var2) throws pasOperateurException {
        double resultat = 0;

        if (operateur != '+' && operateur != '-' && operateur != '*' && operateur != '/') {
            throw new pasOperateurException();
        } else {
            switch (operateur) {
                case '+':
                    resultat = var1 + var2;
                    System.out.printf(FORMAT_SORTIE, var1, operateur, var2, resultat);
                    break;

                case '-':
                    resultat = var1 - var2;
                    System.out.printf(FORMAT_SORTIE, var1, operateur, var2, resultat);
                    break;

                case '*':
                    resultat = var1 * var2;
                    System.out.printf(FORMAT_SORTIE, var1, operateur, var2, resultat);
                    break;

                case '/':
                    if (var2 != 0) {
                        resultat = var1 / var2;
                        System.out.printf(FORMAT_SORTIE, var1, operateur, var2, resultat);

                    } else {
                        System.out.println("On ne divise pas par zéro si facilement!");

                    }
                    break;

            }
            return resultat;
        }
    }

}
