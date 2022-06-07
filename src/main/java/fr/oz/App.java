package fr.oz;

import fr.oz.exceptions.pasOperateurException;

/**
 * @author Romain
 * @version 0.1
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World!");
            double a = Calculatrice.calculer('+', 1, 2);
            double b = Calculatrice.calculer('-', 2078, 64);
            double c = Calculatrice.calculer('*', 15, 3);
            double d = Calculatrice.calculer('/', 42, -2);
            double e = Calculatrice.calculer(
                    '+',
                    Calculatrice.calculer('/', 15, 2),
                    Calculatrice.calculer('/', 2, 3));
        } catch (pasOperateurException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}