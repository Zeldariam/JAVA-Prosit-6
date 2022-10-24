package tn.tuniprod.gestionmagasin;

public class ProduitLegume extends ProduitAgricole{
    public ProduitLegume(int identifiant, String libelle, float quantite, String saisonRecolte) {
        super(identifiant, libelle, quantite, saisonRecolte);
    }

   /* @Override
    public String determinerTypeProduit() {
        return "Ce produi est un LEGUME";
    }*/
}

