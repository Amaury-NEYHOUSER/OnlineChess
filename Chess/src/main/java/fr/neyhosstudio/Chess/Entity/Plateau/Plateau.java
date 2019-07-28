package fr.neyhosstudio.Chess.Entity.Plateau;

import java.util.ArrayList;
import java.util.List;

/**
 * Le plateau d'échec est composé de :
 *      - 8 x 8 cases (64 cases)
 *      - les cases sont en alternance sombres/claires
 *      - la première case est sombre
 *
 *  Le plateau d'échec contient les pions :
 *      - pion : ligne 2 et 7, case 1 à 8
 *      - tour : ligne 1 et 8, case 1 et 8
 *      - cavalier : ligne 1 et 8, case 2 et 7
 *      - fou : ligne 1 et 8, case 3 et 6
 *      - reine : ligne 1 et 8,  case 4
 *      - roi : ligne 1 et 8, case 5 *
 */
public class Plateau {

    // Voici le plateau divisé en 8 lignes de 8 case
    private List<Case[]> plateau = new ArrayList<>();
                // T C F R K F C T
                // P P P P P P P P
                // 0 0 0 0 0 0 0 0
                // 0 0 0 0 0 0 0 0
                // 0 0 0 0 0 0 0 0
                // 0 0 0 0 0 0 0 0
                // P P P P P P P P
                // T C F R K F C T

    // Pions possible :
    private final String T = "Tour";
    private final String C = "Cavalier";
    private final String F = "Fou";
    private final String R = "Reine";
    private final String K = "Roi";
    private final String P = "Pion";
    private final String V = "Void";

    public Plateau(){
        this.plateau.add(initRow(true, T, C, F, R, K, F, C, T));
        this.plateau.add(initRow(false, P, P, P, P, P, P, P, P));
        this.plateau.add(initRow(true, V, V, V, V, V, V, V, V));
        this.plateau.add(initRow(false, V, V, V, V, V, V, V, V));
        this.plateau.add(initRow(true, V, V, V, V, V, V, V, V));
        this.plateau.add(initRow(false, V, V, V, V, V, V, V, V));
        this.plateau.add(initRow(true, P, P, P, P, P, P, P, P));
        this.plateau.add(initRow(false, T, C, F, R, K, F, C, T));
    }

    /**
     * Generate a row of chess
     * @param firstIsSombre the type of the case white / black
     * @param pieceNameCase1 the piece name in the case 1
     * @param pieceNameCase2 the piece name in the case 2
     * @param pieceNameCase3 the piece name in the case 3
     * @param pieceNameCase4 the piece name in the case 4
     * @param pieceNameCase5 the piece name in the case 5
     * @param pieceNameCase6 the piece name in the case 6
     * @param pieceNameCase7 the piece name in the case 7
     * @param pieceNameCase8 the piece name in the case 8
     * @return an array as row
     */
    private Case[] initRow(boolean firstIsSombre,
                           String pieceNameCase1,
                           String pieceNameCase2,
                           String pieceNameCase3,
                           String pieceNameCase4,
                           String pieceNameCase5,
                           String pieceNameCase6,
                           String pieceNameCase7,
                           String pieceNameCase8){

        return new Case[]{
                new Case( firstIsSombre, pieceNameCase1),
                new Case( ! firstIsSombre,pieceNameCase2),
                new Case( firstIsSombre, pieceNameCase3),
                new Case( ! firstIsSombre, pieceNameCase4),
                new Case( firstIsSombre, pieceNameCase5),
                new Case( ! firstIsSombre, pieceNameCase6),
                new Case( firstIsSombre, pieceNameCase7),
                new Case( ! firstIsSombre, pieceNameCase8)
        };
    }



    public List<Case[]> getPlateau(){
        return this.plateau;
    }


    public void DeplacerPionLigneCase(int rowFromIndex, int caseFromIndex, int rowToIndex, int caseToIndex) {



        // from case
        Case[] rowFrom = this.plateau.get(rowFromIndex);    // Row from index
        Case from = rowFrom[caseFromIndex];     // Case from index
        String nameFrom = from.getContainedPionName();

        // to case
        Case[] rowTo = this.plateau.get(rowToIndex);     // Row to index
        Case to = rowTo[caseToIndex];     // Case to index
        String nameTo = to.getContainedPionName();

        // from become
        rowFrom[caseFromIndex].setContainedPionName(nameTo);

        // to become
        rowTo[caseToIndex].setContainedPionName(nameFrom);

        // replace int plateau (x)
        this.plateau.set(rowFromIndex, rowFrom);
        this.plateau.set(rowToIndex, rowTo);

    }

    public void affichageDuPlateau(){
        // Affichage du plateau
        for (Case[] row : this.plateau
        ) {
            for (Case c : row
            ) {
                System.out.print(c.getContainedPionName().charAt(0) +" | ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
