package studentlife.core.characters;

import static studentlife.Config.STAT_APPRECIATION;

/**
 *Un Professeur est une personne qui a une Stat appreciation.
 Cette stat est en lien avec l'utilisateur, c'est la relation/appréciation entre le professeur
 et l'étudiant. Sa valeur sera modifiée selon les choix que l'étudiant fera.
 Plus l'étudiant ira au cours d'un Professeur, plus cette valeur augmentera.
 *@see Personne
 * */
public class Professeur extends Personne {

    /** la stat appréciation du professeur*/
    private final Stat appreciation;

    /**
     * le constructeur de professeur
     * @param nom nom du professeur
     * @param prenom prénom du professeur
     * */
    public Professeur(String nom, String prenom){
        super(nom, prenom); //affecte le nom et prénom via le constructeur de la super-classe
        this.appreciation = new Stat(STAT_APPRECIATION, 50); //initialisation à une valeur neutre
    }

    /**
     * ce getter retourne l'appréciation d professeur envers l'étudiant
     * @return Stat appreciation
     * */
    public Stat getAppreciation() { return appreciation; }

    /**
     * Retourne l'information concernant le professeur
     * @return String nom, prénom et appréciation
     * */
    @Override
    public String toString() {
        return (super.toString() + ": " + this.appreciation.getValue() + "/100");
    }
}


