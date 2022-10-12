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
    public Vendeur(int identifiant, String nom_emp, String adresse_emp, int nbr_heures, int tauxDeVente){
        super(identifiant, nom_emp, adresse_emp, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }
}
