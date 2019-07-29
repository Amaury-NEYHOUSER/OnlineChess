package fr.neyhosstudio.Chess;

import fr.neyhosstudio.Chess.Entity.Plateau.Plateau;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class ChessApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ChessApplication.class, args);

        // Creation du plateau
        Plateau plateau = new Plateau();

        // Afficher le plateau
        System.out.println("TOUR 1");
        plateau.affichageDuPlateau();

        // Deplacer un pion
        plateau.deplacerPionLigneCase(0, 1, 2, 0);

        // Afficher le plateau
        System.out.println("TOUR 2");
        plateau.affichageDuPlateau();

        tourParTour(plateau);
        plateau.affichageDuPlateau();

    }


    public static void tourParTour(Plateau plateau) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre nom Joueur A : ");
        String joueurA = sc.next();

        System.out.println("Entrez votre nom Joueur B : ");
        String joueurB = sc.next();

        boolean isJoueurA = false;
        while (true) {
            tour(plateau,!isJoueurA, joueurA, joueurB);
            isJoueurA = !isJoueurA;
            plateau.affichageDuPlateau();
        }
    }

    public static void tour(Plateau plateau, boolean isJoueurA, String joueurAname, String JoueurBname) {
        Scanner sc = new Scanner(System.in);

        String joueur;
        if (isJoueurA) {
            joueur = joueurAname;
        } else {
            joueur = JoueurBname;
        }

        System.out.println("Joueur " + joueur + " à toi de jouer");
        System.out.println("Choisis la position du pion à bouger (ligne puis colone) :");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Choisis l'arrivé du pion à bouger (ligne puis colone) :");
        int i = sc.nextInt();
        int j = sc.nextInt();

        plateau.deplacerPionLigneCase(x -1, y -1, i -1, j -1);
    }


}



