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
public class Caissier extends Employe {
    private int numeroDeCaisse;
    static float salaireHeure = 5;
    static float tauxHeureBonus = 0.15f;
    public Caissier (int identifiant, String nom_emp, String adresse_emp, int nb_heures, int numeroDeCaisse){
        super(identifiant, nom_emp, adresse_emp, nb_heures);
        this.numeroDeCaisse = numeroDeCaisse;
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
    public float salaireCaissier(){
        if (nb_heures>160){
            System.out.println("HEURE SUPPLEMENTAIRE");
            // (nbr d'heure x salaireHeure ) + (HEURE SUPLEMENTRE + 15% SALAIRE HORAIRE)
            return (nb_heures*salaireHeure)+( (this.nb_heures-160) * (salaireHeure+(salaireHeure*tauxHeureBonus)) );
        }else{
            return nb_heures*salaireHeure ;
        }
    }
}
