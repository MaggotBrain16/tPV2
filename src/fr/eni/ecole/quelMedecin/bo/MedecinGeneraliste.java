package fr.eni.ecole.quelMedecin.bo;

import java.util.Locale;

public class MedecinGeneraliste {

    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private static int tarif = 25;
    private Adresse adresse;
    private Creneau[] creneaux = new Creneau[15];

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone,Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;

    }

    public void setNom(String nom) {this.nom = nom;}

    public void setPrenom(String prenom) {this.prenom = prenom;}

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public static void setTarif(int tarif) {MedecinGeneraliste.tarif = tarif;}

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getNumeroDeTelephone() {
        return this.numeroDeTelephone;
    }

    public Adresse getAdresse() {return this.adresse;}

    public void setAdresse(Adresse adresse) {this.adresse = adresse; }

    public static int getTarif() {
        return tarif;
    }




    void ajouterCreneau(Creneau creneauAAjouter) {
        if (this != creneauAAjouter.getMedecinGeneraliste()) {
            System.err.println("Ce créneau ne peut être associé à ce médecin " + "car il est déjà associé à un autre");
        } else {
            int pos = 0;
            while (pos < this.creneaux.length && this.creneaux[pos] != null) pos++;
            if (pos == this.creneaux.length)
                System.err.println("Trop de créneaux sont affectés à ce médecin");
            else
                this.creneaux[pos] = creneauAAjouter;
        }
    }

    public  void afficher(){
        System.out.println(this.nom.toUpperCase(Locale.ROOT) +" "+this.prenom);
        System.out.println("Téléphone : "+ this.numeroDeTelephone);
        System.out.println("Tarif : " + tarif);
        System.out.println("Adresse :");
        this.adresse.afficher();
        System.out.println("Créneaux :");
        for(int i=0; i<this.creneaux.length; i++) if(this.creneaux[i]!=null)
            this.creneaux[i].afficher();
    }



}
