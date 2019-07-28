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

    private boolean isAlive;    //etat de la piece
    private int valeur;         //valeur de la piece
    private String nomPiece;    //nom de la piece

    public boolean isAlive() {
        return isAlive;
    }

    public int getValeur() {
        return valeur;
    }

    public String getNomPiece() {
        return nomPiece;
    }


}