/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

/**
 *
 * @author Zeldariam
 */
public class Responsable extends Employe {
    private int prime;
    static float salaireHeure = 10;
    static float tauxHeureBonus = 0.2f;
    public Responsable (int identifiant, String nom_emp, String adresse_emp, int nbr_heures, int prime){
        super(identifiant, nom_emp, adresse_emp, nbr_heures);
        this.prime = prime;
    }
    @Override
    public String toString() {
        String s = "";
        s += "Identifiant : " + this.identifiant + " \n";
        // added nom_mag for prosit 4
        s += "Nom employe: " + this.nom_emp + " \n";
        s += "Adresse employe: " + this.adresse_emp + " \n";
        s += "Nbr heures : " + this.nb_heures + " \n";

        return s;
    }

    public float salaireResponsable(){
        if (nb_heures>160){
            System.out.println("HEURE SUPPLEMENTAIRE");
            // (nbr d'heure x salaireHeure ) + PRIME + (HEURE SUPLEMENTRE + 20% SALAIRE HORAIRE)
            return (nb_heures*salaireHeure)+this.prime+( (this.nb_heures-160) * (salaireHeure+(salaireHeure*tauxHeureBonus)) );
        }else{
            return (nb_heures*salaireHeure)+this.prime ;
        }
    }
}
