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
    }
    @Override
    public String toString() {
        String s = "";
        s += "Identifiant : " + this.identifiant + " \n";
        // added nom_mag for prosit 4
        s += "Nom Magasin : " + this.nom_magasin + " \n";
        s += "Adresse : " + this.adresse + " \n";
        s += "Capacite : " + this.capacite + " \n";
        
        String prods = "";
        for (int i = 0; i < this.capacite; i++) {
            prods += this.produits[i];
        }

        return s + prods;
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
