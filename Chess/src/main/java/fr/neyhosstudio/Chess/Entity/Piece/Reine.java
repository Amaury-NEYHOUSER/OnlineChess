package fr.neyhosstudio.Chess.Entity.Piece;

/**
 * Reine herite de Piece.
 *
 * La Reine pourra:
 * -Se deplacer dans toutes les directions sur autant de cases souhaite.
 * -Prendre une piece ennemie sur ses cases de deplacement.
 */
public class Reine extends Piece {

    public Reine(){
        this.valeur = 9;
        this.nomPiece = "Reine";
    }
}
