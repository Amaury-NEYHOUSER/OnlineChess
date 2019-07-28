package fr.neyhosstudio.Chess.Entity.Plateau;

/**
 * Une case peut-être :
 * - sombre ou claire
 * - contenir une piece, un pion ou rien (idée : un piege etc)
 */
public class Case {

    private boolean isSombre;
    private String containedPionName;

    public Case(boolean isSombre, String containedPionName){
        this.isSombre = isSombre;
        this.containedPionName = containedPionName;
    }

    public boolean isSombre() {
        return isSombre;
    }

    public void setSombre(boolean sombre) {
        isSombre = sombre;
    }

    public String getContainedPionName() {
        return containedPionName;
    }

    public void setContainedPionName(String containedPionName) {
        this.containedPionName = containedPionName;
    }
}
