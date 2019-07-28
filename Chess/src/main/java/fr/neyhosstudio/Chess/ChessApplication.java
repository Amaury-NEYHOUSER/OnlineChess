package fr.neyhosstudio.Chess;

import fr.neyhosstudio.Chess.Entity.Plateau.Case;
import fr.neyhosstudio.Chess.Entity.Plateau.Plateau;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ChessApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ChessApplication.class, args);

        // Creation du plateau
        Plateau jeu = new Plateau();
        List<Case[]> plateau = jeu.getAllRows();

        jeu.DeplacerPionLigneCase(1,2,3,1);

        // Parcour des lignes
        for (Case[] row : plateau
        ) {
            // parcour des case
            for (Case c : row
            ) {
                System.out.print(
                        String.valueOf(c.getContainedPionName().charAt(0)) +
                                " | "
                );
            }
            System.out.print("\n");
        }

        System.out.println();

    }


}
