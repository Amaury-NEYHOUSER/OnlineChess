package fr.neyhosstudio.Chess.Entity.Piece;

/**
 * Roi herite de Piece.
 *
 * Le Roi pourra:
 * -Se deplacer dans toutes les directions d'1 seule case.
 * -Prendre une piece ennemie sur ses cases de deplacement.
 */
public class Roi extends Piece {

    public Roi(){
        this.valeur = 11;
        this.nomPiece = "Roi";
    }
}
