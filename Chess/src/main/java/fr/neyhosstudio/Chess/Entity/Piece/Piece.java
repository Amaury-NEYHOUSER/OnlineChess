package fr.neyhosstudio.Chess.Entity.Piece;

/**
 *Une piece aura:
 * -une valeur
 * -un non
 *
 * Pourra:
 * -etre vivant/mort
 * -se deplacer
 * -prendre une autre piece
 */

public abstract class Piece {

    protected int valeur;         //valeur de la piece
    protected String nomPiece;    //nom de la piece

    public int getValeur() {
        return valeur;
    }

    public String getNomPiece() {
        return nomPiece;
    }

}