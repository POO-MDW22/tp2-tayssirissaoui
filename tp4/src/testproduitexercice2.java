public class testproduitexercice2 {
    public static void main(String[] args) {
        produitexercice2 m1 = new produitexercice2(12345, "El Aouina");

        Produit produit1 = new Produit();
        Produit produit2 = new Produit();
        Produit produit3 = new Produit();
        Produit produit4 = new Produit();

        m1.ajouterProduit(produit1);
        m1.ajouterProduit(produit2);
        m1.ajouterProduit(produit3);
        m1.ajouterProduit(produit4);

        System.out.println(m1);
        System.out.println("Total des Produits : " + m1.getTotalProduits());
    }
}