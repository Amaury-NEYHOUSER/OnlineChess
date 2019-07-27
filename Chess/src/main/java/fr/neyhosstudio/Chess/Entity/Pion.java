package fr.neyhosstudio.Chess.Entity;


/**
 * Pion herite de Piece.
 *
 * Le pion pourra:
 * -Se deplacer d'1 a 2 cases vers l'avant lors de son premier deplacement puis d une seul case par tour.
 * -Prendre les pieces aui se trouve en diagonale devant lui a une distance d'1 case.
 *-Etre promu en une autre piece au choix si il atteint le bout de sa colonne.
 */

public class Pion extends Piece {

    /**
     * @param nomPiece nom de la piece qui remplacera le pion
     * @return la piece choisis
     */
    public Piece promote(String nomPiece) {
        switch (nomPiece) {
            case "Cavalier":
                break;
            case "Fou":
                break;
            case "Tour":
                break;
            case "Reine":
                break;
            case "Roi":
                break;
        }
    }
}
