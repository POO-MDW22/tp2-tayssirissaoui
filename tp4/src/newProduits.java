import java.time.LocalDate;

public class newProduits {
    LocalDate date_ex;
    int identifier;
    String libelle;
    String marque;
    double prix;

    public newProduits() {
    }

    public newProduits(int identifier, String libelle, String marque, double prix, LocalDate d) {
        this.identifier = identifier;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.date_ex = d;
    }

    public void affiche() {
        System.out.println("Identifier: " + identifier);
        System.out.println("Libellé: " + libelle);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix);
        System.out.println("Date d'expiration: " + date_ex);
    }

    public String toString() {
        return "Identifier: " + identifier + "\nLibellé: " + libelle + "\nMarque: " + marque + "\nPrix: " + prix;
    }

    public void setDate_ex(LocalDate d) {
        this.date_ex = d;
    }
}