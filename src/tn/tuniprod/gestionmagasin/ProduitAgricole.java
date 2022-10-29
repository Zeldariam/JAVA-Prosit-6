package tn.tuniprod.gestionmagasin;

public class ProduitAgricole extends ProduitAliementaire{
    String SaisonRecolte;

    public ProduitAgricole(int identifiant, String libelle, float quantite, float prix, String saisonRecolte) throws PrixNegatifException {
        super(identifiant,libelle,quantite,prix);
        SaisonRecolte = saisonRecolte;
    }

    /*@Override
    public String determinerTypeProduit() {
        return "ceci est un Produit Agricole";
    }*/
}
