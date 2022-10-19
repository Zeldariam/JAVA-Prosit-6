/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

import java.util.Date;

/**
 *
 * @author Zeldariam
 */
public class TuniProdGestionMagasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProduitAliementaire produit1 = new ProduitAliementaire();
        ProduitAliementaire produit2 = new ProduitAliementaire(1021, "Lait", "Delice");
        ProduitAliementaire produit3 = new ProduitAliementaire(2510, "yaourt", "Vitalait");
        ProduitAliementaire produit4 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);
        ProduitAliementaire produit44 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);

//        produit2.afficher();
//        
        produit2.affecterPrix(0.7f);
//        
//        produit2.afficher();
//        
//        System.out.println( produit2.toString());
//        System.out.println(produit2);
//        
//        produit2.affecterDateExpiration(new Date(1377249026));
//        System.out.println(produit2.dateExpriration.toString());

//---------------------------------------
        Magasin m1 = new Magasin(12345, "El Aouina");
        Magasin m2 = new Magasin(44445, "ARIANA");
//        System.out.println(m1);

        m1.ajouterProduit(produit1);
        m1.ajouterProduit(produit2);
        m1.ajouterProduit(produit3);
        m1.ajouterProduit(produit4);
        m2.ajouterProduit(produit3);
        m2.ajouterProduit(produit4);
        
       // m1.ajouterProduit(produit44);
        
        
        
//        System.out.println(m1);
//        
//        System.out.println("Total des Produits  " + m1.getTotalProduits() );
//---------------------------------------

//        System.out.println(produit44.comparer(produit4));
//      System.out.println("============  QUESTION 6: ==================");  
//        System.out.println("QUESTION 6: Magasin ayant nbre de produits superieur entre M1 et M2"+m1.comparer(m2));
//        
        
//        m1.supprimerProduit(new ProduitAliementaire(98798, "qsd", "qsd"));
        //System.out.println(m1);
// ************************************ PROSIT 4 ************************************************** //        
    // Q1 : 
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah 6");
        
    // Q2 :
        // MAGASIN 1 CARREFOUR
        Caissier caissierCarrefour1 = new Caissier(1, "C1 sofiene rigouta", "ariana", 11, 111);
        Caissier caissierCarrefour2 = new Caissier(2, "C2 mounir do5an", "bardo", 22, 222);
        Vendeur vendeurCarrefour = new Vendeur(3,"VendeurCar 1","centre ville", 33,333);
        Responsable responsableCarrefour = new Responsable(4, "3ezdine gzez CARREFOUR", "ghazela", 170, 44);
        carrefour.ajouterCaissier(caissierCarrefour1);
        carrefour.ajouterCaissier(caissierCarrefour2);
        carrefour.ajouterVendeur(vendeurCarrefour);
        carrefour.ajouterResponsable(responsableCarrefour);
        // MAGASIN 2 MONOPRIX
        Caissier caissierMonoprix1 = new Caissier(5, "CAISSIER MONOPRIX", "55", 55, 555);
        Vendeur vendeurMonoprix1 = new Vendeur(6,"VENDEUUR MONOPRIX 1","66 ville", 66,666);
        Vendeur vendeurMonoprix2 = new Vendeur(7,"VENDEUR MONOPRIX 2","77 GHAZELA", 77,777);
        Vendeur vendeurMonoprix3 = new Vendeur(8,"VENDEUR MONOPRIX 3"," 88 BARDO ", 88,888);
        Responsable responsableMonoprix = new Responsable(9, "3ezdine gzez MONOPRIX", " 99 ghazela", 99, 999);
        monoprix.ajouterCaissier(caissierMonoprix1);
/*        monoprix.ajouterVendeur(vendeurMonoprix1);
        monoprix.ajouterVendeur(vendeurMonoprix2);
        monoprix.ajouterVendeur(vendeurMonoprix3);
        monoprix.ajouterResponsable(responsableMonoprix);
    // Q3+4+5 :
        carrefour.ajouterProduit(produit1);
        carrefour.ajouterProduit(produit2);
        carrefour.ajouterProduit(produit3);
        carrefour.ajouterProduit(produit4);
        monoprix.ajouterProduit(produit3);
        monoprix.ajouterProduit(produit4);*/
        /*System.out.println("\n###################### MAGASIN 1 ####################");
        System.out.println(carrefour);
        System.out.println("###################### MAGASIN 2 ####################");
        System.out.println(monoprix);
    // Q6 :
        System.out.println("Salaire RESPONSABLE CARREFOUR: "+responsableCarrefour.salaireResponsable());
        System.out.println("Salaire RESPONSABLE MONOPRIX: "+responsableMonoprix.salaireResponsable());

        System.out.println("Salaire VENDEUR MONOPRIX: "+ vendeurMonoprix1.salaireVendeur());

        System.out.println("Salaire CAISSIER MONOPRIX: "+ caissierMonoprix1.salaireCaissier());*/

// ************************************ PROSIT 5 ************************************************** //
    //Q2 :
        ProduitFruit P1 = new ProduitFruit(1254,"Fraise",12.3f, "Mars");
        ProduitFruit P2 = new ProduitFruit(1224,"Pasteque", 50f, "Juin");
        ProduitFruit P3 = new ProduitFruit(7896,"Mandarine",25.6f, "Decembre");
        ProduitLegume P4 = new ProduitLegume(8521,"Artichauts",14f, "Janvier");
    //Q3 :
        carrefour.ajouterProduit(P1);
        carrefour.ajouterProduit(P2);
        carrefour.ajouterProduit(P3);
        carrefour.ajouterProduit(P4);
        System.out.println(carrefour.afficherProduitsAlimentaires());
    //Q4 :
        System.out.println(P1.determinerTypeProduit());
        System.out.println(P4.determinerTypeProduit());
    //Q5 :
    //STOPPED AT CALCULSTOCK
        // need to change maasin toString to accomodate PROSIT5 ==> show QUANTITE AND SAISONRECOLTE
        
    }
}
