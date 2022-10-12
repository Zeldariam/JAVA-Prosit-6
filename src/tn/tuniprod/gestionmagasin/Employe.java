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
public class Employe {
    int identifiant;
    String nom_emp;
    String adresse_emp;
    int nb_heures;
    
    public Employe (int identifiant, String nom_emp, String adresse_emp, int nb_heures){
        this.identifiant = identifiant;
        this.nom_emp = nom_emp;
        this.adresse_emp = adresse_emp;
        this.nb_heures = nb_heures;
    }
    public boolean comparerEmp(Employe employe){
        return this.identifiant==employe.identifiant&&
                this.nom_emp==employe.nom_emp&&
                this.adresse_emp==employe.adresse_emp&&
                this.nb_heures==employe.nb_heures;
    }
    
}
