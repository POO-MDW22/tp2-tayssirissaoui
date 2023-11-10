public class produitexercice2 {
    private int identifiant;
    private String adresse;
    private int capacite;
    private Produit[] produits;

    public produitexercice2(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = 0;
        this.produits = new Produit[50];
    }

    public void ajouterProduit(Produit produit) {
        if (this.capacite < 50) {
            this.produits[this.capacite] = produit;
            this.capacite++;
        }
    }

    public int getTotalProduits() {
        return this.capacite;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("identifiant : ").append(this.identifiant).append("\n");
        s.append("adresse : ").append(this.adresse).append("\n");
        s.append("capacite : ").append(this.capacite).append("\n");

        for (int i = 0; i < this.capacite; i++) {
            s.append(this.produits[i]).append("\n");
        }

        return s.toString();
    }
}

class Produit {
}