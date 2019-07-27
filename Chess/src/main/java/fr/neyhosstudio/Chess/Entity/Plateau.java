package fr.neyhosstudio.Chess.Entity;

import lombok.Getter;
import lombok.Setter;

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
        this.row3 = initRow(false, V, V, V, V, V, V, V, V);
        this.row4 = initRow(false, V, V, V, V, V, V, V, V);
        this.row5 = initRow(false, V, V, V, V, V, V, V, V);
        this.row6 = initRow(false, V, V, V, V, V, V, V, V);
        this.row7 = initRow(false, P, P, P, P, P, P, P, P);
        this.row8 = initRow(false, T, C, F, R, K, F, C, T);
    }

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

    public List<Case[]> getAllRows(){
        List <Case[]> list = new ArrayList<Case[]>();
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


}
