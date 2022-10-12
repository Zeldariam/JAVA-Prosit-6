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
    public Responsable (int identifiant, String nom_emp, String adresse_emp, int nbr_heures, int prime){
        super(identifiant, nom_emp, adresse_emp, nbr_heures);
        this.prime = prime;
    }
    
}
