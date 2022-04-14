package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Patient {

    private String nom;
    private String prenom;
    private String numeroDeTelephone; private char sexe;
    private long numSecu;
    private LocalDate dateNaissance;
    private String commentaires;
    private Adresse adresse;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe,
                   long numSecu, LocalDate dateNaissance, String commentaires,Adresse adresse) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone; this.sexe = sexe;
        this.numSecu = numSecu;
        this.dateNaissance = dateNaissance;
        this.commentaires = commentaires;
        this.adresse =adresse;
    }

    public  String getCommentaires() {
        return this.commentaires;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroDeTelephone() {
        return this.numeroDeTelephone;
    }

    public LocalDate getDateNaissance() {
        return this.dateNaissance;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public char getSexe() {
        return this.sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public long getNumSecu() {
        return this.numSecu;
    }

    public void setNumSecu(long numSecu) {
        this.numSecu = numSecu;
    }

    public void setDateNaissanceu(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Adresse getAdresse() {return this.adresse;}

    public void setAdresse(Adresse adresse) {this.adresse = adresse;}



    public void afficher() {
            System.out.printf("%s %s%nTéléphone : %s%nSexe : %s%n" +
                              "Numéro de Sécurité sociale : %d%nDate de naissance : %s%nCommentaires : %s%n",
                                this.nom,
                                this.prenom,
                                this.numeroDeTelephone,
                                this.sexe == 'F' ? "Féminin" : "Masculin",
                                this.numSecu,
                                this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                                this.commentaires != null ? this.commentaires : "[aucun commentaire]");
            System.out.println("Adresse :");
            if(adresse.getComplementAdresse() != null && adresse.getComplementNumero() != null){
                System.out.println(adresse.getComplementAdresse());
                System.out.println(adresse.getNumero()+adresse.getComplementNumero().toUpperCase()+" "+adresse.getRue());
                System.out.println(adresse.getCp()+" "+adresse.getVille().toUpperCase());
            }else if (adresse.getComplementAdresse() != null){
                System.out.println(adresse.getComplementAdresse());
                System.out.println(adresse.getNumero()+" "+adresse.getRue());
                System.out.println(adresse.getCp()+" "+adresse.getVille().toUpperCase());
            }else if(adresse.getComplementNumero() != null ){
                System.out.println(adresse.getNumero()+adresse.getComplementNumero().toUpperCase()+" "+adresse.getRue());
                System.out.println(adresse.getCp()+" "+adresse.getVille().toUpperCase());
            }else{
                System.out.println(adresse.getNumero()+" "+adresse.getRue());
                System.out.println(adresse.getCp()+" "+adresse.getVille().toUpperCase());
            }
    }



}
