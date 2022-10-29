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
    // ************************************ PROSIT 6 ************************************************** //
        // Q6+Q7 :
        //USES THROWS MagasinPleinException & PrixNegatifException IN METHOD SIGNATURE
        //HANDLES UNCHECKED EXCEPTIONS WITH MANUAL TRY CATCH APPROACH
            // produit 1
            try {
                ProduitFruit P1 = new ProduitFruit(1254, "Fraise", 12.3f, -10.5f,"Mars");
                try {
                    carrefour.ajouterProduit(P1);
                }catch (MagasinPleinException e){
                    System.out.println(e.getMessage());
                }
            }catch (PrixNegatifException ex){
                System.out.println("PRIX NEGATIF");
            }
            // produit 1
            try {
                ProduitFruit P2 = new ProduitFruit(1224, "Pasteque", 50f, 10.5f,"Juin");
                try {
                    carrefour.ajouterProduit(P2);
                }catch (MagasinPleinException e){
                    System.out.println(e.getMessage());
                }
            }catch (PrixNegatifException ex){
                System.out.println("PRIX NEGATIF");
            }
            // produit 3
            try {
                ProduitLegume P4 = new ProduitLegume(8521, "Artichauts", 14f, 10.5f,"Janvier");
                try {
                    carrefour.ajouterProduit(P4);
                }catch (MagasinPleinException e){
                    System.out.println(e.getMessage());
                }
            }catch (PrixNegatifException ex){
                System.out.println("PRIX NEGATIF");
            }
            // produit 4
            try {
                ProduitLegume P4 = new ProduitLegume(9650, "FA99OUSS", 14f, 10.5f,"OCTOBRE");
                try {
                    carrefour.ajouterProduit(P4);
                }catch (MagasinPleinException e){
                    System.out.println(e.getMessage());
                }
            }catch (PrixNegatifException ex){
                System.out.println("PRIX NEGATIF");
            }

        System.out.print(carrefour.afficherProduitsAlimentaires());
    }
}
