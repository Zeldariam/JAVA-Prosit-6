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
public class Vendeur extends Employe{
    private int tauxDeVente;
    static float salaireVendeur = 450f;
    public Vendeur(int identifiant, String nom_emp, String adresse_emp, int nbr_heures, int tauxDeVente){
        super(identifiant, nom_emp, adresse_emp, nbr_heures);
        this.tauxDeVente = tauxDeVente;
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
    public float salaireVendeur(){
        return salaireVendeur * (this.tauxDeVente/100) ;
    }

}
