package tn.tuniprod.gestionmagasin;

public class ProduitLegume extends ProduitAgricole{
    public ProduitLegume(int identifiant, String libelle, float quantite, float prix, String saisonRecolte) throws PrixNegatifException {
        super(identifiant, libelle, quantite,prix, saisonRecolte);
    }

   /* @Override
    public String determinerTypeProduit() {
        return "Ce produi est un LEGUME";
    }*/
}

