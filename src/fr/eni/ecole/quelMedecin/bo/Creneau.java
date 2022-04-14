package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Creneau {
    private LocalTime heureDebut;

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setMedecinGeneraliste(fr.eni.ecole.quelMedecin.bo.MedecinGeneraliste medecinGeneraliste) {
        MedecinGeneraliste = medecinGeneraliste;
    }

    private int duree;
    private MedecinGeneraliste MedecinGeneraliste;

    public MedecinGeneraliste getMedecinGeneraliste() { return MedecinGeneraliste;
    }
    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste MedecinGeneraliste) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.MedecinGeneraliste = MedecinGeneraliste;
        MedecinGeneraliste.ajouterCreneau(this);
    }
    public void afficher() {
        System.out.printf("%s - %s (%d minutes)%n",
                this.heureDebut.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), this.heureDebut.plusMinutes(this.duree).format( DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), this.duree);
    }

}
