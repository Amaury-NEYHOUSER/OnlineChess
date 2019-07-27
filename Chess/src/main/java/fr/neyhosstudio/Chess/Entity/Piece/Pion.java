package fr.neyhosstudio.Chess.Entity.Piece;


/**
 * Pion herite de Piece.
 * <p>
 * Le pion pourra:
 * -Se deplacer d'1 a 2 cases vers l'avant lors de son premier deplacement puis d une seul case par tour.
 * -Prendre les pieces aui se trouve en diagonale devant lui a une distance d'1 case.
 * -Etre promu en une autre piece au choix si il atteint le bout de sa colonne.
 */

public class Pion extends Piece {

    /**
     * @param nomPiece nom de la piece qui remplacera le pion
     * @return la piece choisis
     */
    public Piece promote(String nomPiece) {
        switch (nomPiece) {
            case "Cavalier":
                return null;
            case "Fou":
                return null;
            case "Tour":
                return null;
            case "Reine":
                return null;
            case "Roi":
                return null;
            default:
                return null;
        }
    }
}
