package tn.tuniprod.gestionmagasin;

public class ProduitAgricole extends ProduitAliementaire{
    String SaisonRecolte;

    public ProduitAgricole(int identifiant, String libelle, float quantite, String saisonRecolte) {
        super(identifiant, libelle, quantite);
        SaisonRecolte = saisonRecolte;
    }

    @Override
    public String determinerTypeProduit() {
        return "ceci est un Produit Agricole";
    }
}
