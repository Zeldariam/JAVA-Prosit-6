package tn.tuniprod.gestionmagasin;

public class ProduitFruit extends ProduitAgricole{
    public ProduitFruit(int identifiant, String libelle, float quantite, float prix, String saisonRecolte) throws PrixNegatifException {
        super(identifiant, libelle, quantite,prix, saisonRecolte);
    }
    /*@Override
    public String determinerTypeProduit() {
        return "Ce produit est un FRUIT";
    }*/
}
