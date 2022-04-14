package fr.eni.ecole.quelMedecin.bo;

// de mentions complémentaires éventuelles (comme l’appartement, l’étage, l’escalier, « chez... », le bâtiment ou la résidence) ;
// du numéro dans la voie (éventuellement suivi d’un complément de numéro tel bis, ter, quater, etc.) immédiatement suivi (sans virgule) du type de voie (rue, avenue, etc.) et du nom de celle-ci ;
// du code postal de cinq chiffres sans séparation suivi du nom de la commune en lettres capitales.
//Cette classe doit posséder deux constructeurs : l’un avec toutes les informations et le second sans les mentions complémentaires, qui sont alors initialisées avec la valeur null.
//Cette classe doit également posséder une méthode d’instance afficher().

import java.util.Locale;

public class Adresse {
    private String complementAdresse;
    private int numero;
    private String complementNumero;
    private String rue;
    private int cp;
    private String ville;


    public Adresse(String complementAdresse, int numero, String complementNumero, String rue, int cp, String ville) {
        this.complementAdresse = complementAdresse;
        this.numero = numero;
        this.complementNumero = complementNumero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    public Adresse(int numero, Object o, String rue, int cp, String ville) {
        this( null,  numero,  null,  rue,  cp,  ville);
    }

    public String getComplementAdresse() {
        return complementAdresse;
    }

    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    public String getComplementNumero() {
        return complementNumero;
    }

    public void setComplementNumero(String complementNumero) {
        this.complementNumero = complementNumero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void afficher(){

       if(complementAdresse != null && complementNumero != null){
           System.out.println(this.complementAdresse);
           System.out.println(this.numero+complementNumero.toUpperCase()+" "+this.rue);
           System.out.println(this.cp+" "+this.ville.toUpperCase());
       }else if (complementAdresse != null){
           System.out.println(this.complementAdresse);
           System.out.println(this.numero+" "+this.rue);
           System.out.println(this.cp+" "+this.ville.toUpperCase());
       }else if(complementNumero != null ){
           System.out.println(this.numero+complementNumero.toUpperCase()+" "+this.rue);
           System.out.println(this.cp+" "+this.ville.toUpperCase());
       }else{
           System.out.println(this.numero+" "+this.rue);
           System.out.println(this.cp+" "+this.ville.toUpperCase());
       }

    }
}
