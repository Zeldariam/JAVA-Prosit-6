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
//SOME OF THE ABOVE PRINTS REQUIRE A toString CHANGE IN RESPECTIVE CLASS, MAINLY Magasin CLASS.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MagasinPleinException {

        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah 6");


            ProduitFruit P1 = new ProduitFruit(1254, "Fraise", 12.3f, "Mars");
            ProduitFruit P2 = new ProduitFruit(1224, "Pasteque", 50f, "Juin");
            ProduitFruit P3 = new ProduitFruit(7896, "Mandarine", 25.6f, "Decembre");
            ProduitLegume P4 = new ProduitLegume(8521, "Artichauts", 14f, "Janvier");

    // Q6 :
        // uses THROWS MagasinPleinException in method Signature
        carrefour.ajouterProduit(P1);
        carrefour.ajouterProduit(P2);
        carrefour.ajouterProduit(P3);
        carrefour.ajouterProduit(P4);
        /* OR :
            try{
                carrefour.ajouterProduit(P1);
                carrefour.ajouterProduit(P2);
                carrefour.ajouterProduit(P3);
                carrefour.ajouterProduit(P4);
            }catch(MagasinPleinException e){

            }
        */
        System.out.println(carrefour.afficherProduitsAlimentaires());

    }
    // ************************************ PROSIT 6 ************************************************** //

}
