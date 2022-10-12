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
public class Magasin {

    int identifiant;
    String adresse;
    int capacite;
    
    ProduitAliementaire[] produits;
    Employe[] employes;
    int nbr_employe;
    String nom_magasin;
    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new ProduitAliementaire[50];
        this.employes = new Employe[20];
    }
    public Magasin (int identifiant,  String nom_magasin,String adresse){
        this.identifiant = identifiant;
        this.nom_magasin = nom_magasin;
        this.adresse = adresse;        
        this.produits = new ProduitAliementaire[50];
        this.employes = new Employe[20];
        this.nbr_employe = 0;
    }
    @Override
    public String toString() {
        String s = "";
        s += "||  IDENTIFENT  ||  NOM MAGASIN  || ADRESSE  || CAPACITE||\n";
        s += "||  "+this.identifiant+"           ||  "+this.nom_magasin+"     || "+this.adresse+" || "+this.capacite+"      ||\n";
        s += "=====================PRODUITS=================="+" \n";


        String products = "";
        for (int i = 0; i < this.capacite; i++) {
            products += this.produits[i];
        }
        s+=products+" \n";
        s += "=====================Employes=================="+" \n";
        String employees = "";
        for (int i = 0; i < this.nbr_employe; i++) {
            int emp_index =i+1;
            employees += "Employe n°"+emp_index+"\n"+this.employes[i]+"-------------------------------------"+"\n";
        }
        

        return s+employees;
    }
    public boolean chercherEmploye(Employe emp) {
        for (int i = 0; i < this.nbr_employe; i++) {
            if (this.employes[i].comparerEmp(emp)) {
                return true;
            }
        }
        return false;
    }
    public void ajouterCaissier (Caissier caissier){
        if(this.nbr_employe<20){
            if (!this.chercherEmploye(caissier)) {
                this.employes[nbr_employe] = caissier;
                this.nbr_employe++;
                System.out.println("AJOUT CAISSIER DONE!!");
            }
        }  
    }
    public void ajouterResponsable (Responsable responsable){
        if(this.nbr_employe<20){
            if (!this.chercherEmploye(responsable)) {
                 this.employes[nbr_employe] = responsable;
                this.nbr_employe++;
                System.out.println("AJOUT RESPONSABLE DONE!!");
            }
        }  
    }
    public void ajouterVendeur (Vendeur vendeur){
        if(this.nbr_employe<20){
            if (!this.chercherEmploye(vendeur)) {
                this.employes[nbr_employe] = vendeur;
                this.nbr_employe++;
                System.out.println("AJOUT VENDEUR DONE!!");
            }
        }  
    }
    
    public void ajouterProduit(ProduitAliementaire produit) {
        if (this.chercher(produit)) {
            System.out.println("Produit existant");
        } else {
            this.produits[capacite] = produit;
            this.capacite++;
        }
    }
    
    public int getIndexOfProduit(ProduitAliementaire produit){
        for(int i=0;i<this.capacite;i++){
            if(this.produits[i].comparer(produit)){
                return i;
            }
        }
        return -1;
    }
    
    public void supprimerProduit(ProduitAliementaire produit){
        int indexProduit = this.getIndexOfProduit(produit);
        if(indexProduit==-1){
            System.out.println("Produit inexistant");
        }
        else{
            for(int i=indexProduit;i<capacite;i++){
                this.produits[i]=this.produits[i+1];
                this.produits[capacite]=null;
                this.capacite--;
            }
        }
    }

    public int getTotalProduits() {
        return this.capacite;
    }

    public static boolean comparer(ProduitAliementaire produit, ProduitAliementaire produit2) {
        return produit2.getIdentifiant() == produit.getIdentifiant()
                && produit2.getPrix() == produit.getPrix()
                && produit2.getLibelle() == produit.getLibelle();
    }

    public boolean chercher(ProduitAliementaire produit) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(produit)) {
                return true;
            }
        }
        return false;
    }
    
    public  Magasin comparer(Magasin m){
        if(this.capacite>=m.capacite){
            return this;
        }
        else{
            return m;
        }
    }
 
}
