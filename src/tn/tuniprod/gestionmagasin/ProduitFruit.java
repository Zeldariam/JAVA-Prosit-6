package tn.tuniprod.gestionmagasin;

public class ProduitFruit extends ProduitAgricole{
    public ProduitFruit(int identifiant, String libelle, float quantite, String saisonRecolte) {
        super(identifiant, libelle, quantite, saisonRecolte);
    }
    @Override
    public String determinerTypeProduit() {
        return "Ce produit est un FRUIT";
    }
}
