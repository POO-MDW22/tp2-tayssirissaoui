public class Address {
    public String ville;
    public String gouvernorat;
    public int codepostal;

    public Address() {
        this.gouvernorat = "";
        this.ville = "";
        this.codepostal = 0;
    }

    public Address(String g, String v, int c) {
        this.gouvernorat = g;
        this.ville = v;
        this.codepostal = c;
    }

    public void affiche() {
        System.out.println("La ville est: " + this.ville + ", gouvernorat est: " + this.gouvernorat + ", le code postal est: " + this.codepostal);
    }

    @Override
    public String toString() {
        return "Gouvernorat: " + this.gouvernorat + ", Ville est: " + this.ville + ", Code postal est: " + this.codepostal;
    }
}
