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
    private Case[] row1;     // T C F R K F C T
    private Case[] row2;     // P P P P P P P P
    private Case[] row3;     // 0 0 0 0 0 0 0 0
    private Case[] row4;     // 0 0 0 0 0 0 0 0
    private Case[] row5;     // 0 0 0 0 0 0 0 0
    private Case[] row6;     // 0 0 0 0 0 0 0 0
    private Case[] row7;     // P P P P P P P P
    private Case[] row8;     // T C F R K F C T

    // Pions possible :
    private final String T = "Tour";
    private final String C = "Cavalier";
    private final String F = "Fou";
    private final String R = "Reine";
    private final String K = "Roi";
    private final String P = "Pion";
    private final String V = "Void";

    public Plateau(){
        this.row1 = initRow(true, T, C, F, R, K, F, C, T);
        this.row2 = initRow(false, P, P, P, P, P, P, P, P);
        this.row3 = initRow(true, V, V, V, V, V, V, V, V);
        this.row4 = initRow(false, V, V, V, V, V, V, V, V);
        this.row5 = initRow(true, V, V, V, V, V, V, V, V);
        this.row6 = initRow(false, V, V, V, V, V, V, V, V);
        this.row7 = initRow(true, P, P, P, P, P, P, P, P);
        this.row8 = initRow(false, T, C, F, R, K, F, C, T);
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

    /**
     * Return the list of 8 rows with 8 cases inside
     * @return the plateau
     */
    public List<Case[]> getAllRows(){
        List <Case[]> list = new ArrayList<>();
            list.add(this.row1);
            list.add(this.row2);
            list.add(this.row3);
            list.add(this.row4);
            list.add(this.row5);
            list.add(this.row6);
            list.add(this.row7);
            list.add(this.row8);

        return list;
    }

    public Case[] getRow1() {
        return row1;
    }
    public void setRow1(Case[] row1) {
        this.row1 = row1;
    }
    public Case[] getRow2() {
        return row2;
    }
    public void setRow2(Case[] row2) {
        this.row2 = row2;
    }
    public Case[] getRow3() {
        return row3;
    }
    public void setRow3(Case[] row3) {
        this.row3 = row3;
    }
    public Case[] getRow4() {
        return row4;
    }
    public void setRow4(Case[] row4) {
        this.row4 = row4;
    }
    public Case[] getRow5() {
        return row5;
    }
    public void setRow5(Case[] row5) {
        this.row5 = row5;
    }
    public Case[] getRow6() {
        return row6;
    }
    public void setRow6(Case[] row6) {
        this.row6 = row6;
    }
    public Case[] getRow7() {
        return row7;
    }
    public void setRow7(Case[] row7) {
        this.row7 = row7;
    }
    public Case[] getRow8() {
        return row8;
    }
    public void setRow8(Case[] row8) {
        this.row8 = row8;
    }


    public void DeplacerPionLigneCase(int rowFromIndex, int caseFromIndex, int rowToIndex, int caseToIndex) {

        // get the plateau
        List<Case[]> x = getAllRows();

        // from case
        Case[] rowFrom = x.get(rowFromIndex);    // Row from index
        Case from = rowFrom[caseFromIndex];     // Case from index
        String nameFrom = from.getContainedPionName();

        // to case
        Case[] rowTo = x.get(rowToIndex);     // Row to index
        Case to = rowTo[caseToIndex];     // Case to index
        String nameTo = to.getContainedPionName();

        // from become
        rowFrom[caseFromIndex].setContainedPionName(nameTo);

        // to become
        rowTo[caseToIndex].setContainedPionName(nameFrom);

        // replace int plateau (x)
        x.set(rowFromIndex, rowFrom);
        x.set(rowToIndex, rowTo);

    }

    public void affichageDuPlateau(){
        // Affichage du plateau
        for (Case[] row : this.getAllRows()
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
