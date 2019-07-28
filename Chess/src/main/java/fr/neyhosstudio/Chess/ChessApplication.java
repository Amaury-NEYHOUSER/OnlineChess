package fr.neyhosstudio.Chess;

import fr.neyhosstudio.Chess.Entity.Plateau.Plateau;
import org.springframework.boot.autoconfigure.SpringBootApplication;


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
        plateau.DeplacerPionLigneCase(0,1,2,0);

        // Afficher le plateau
		System.out.println("TOUR 2");
        plateau.affichageDuPlateau();




    }




}
