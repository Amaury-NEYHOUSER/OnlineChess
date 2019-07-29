package fr.neyhosstudio.Chess.Entity.Piece;

/**
 * Fou herite de Piece.
 *
 * Le Fou pourra:
 * -Se deplacer en diagonale sur autant de case souhaite.
 * -Prendre une piece ennemie sur ses cases de deplacement.
 */
public class Fou extends Piece {

    public Fou(){
        this.valeur = 3;
        this.nomPiece = "Fou";
    }
}
