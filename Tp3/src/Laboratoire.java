public class Laboratoire {

    public Address a;
    public String nom;
    public String specialite;
    public bureau[] b;

    public Laboratoire(String specialite, String nom, bureau[] b, Address a) {
        this.specialite = specialite;
        this.nom = nom;
        this.b = b;
        this.a = a;
    }

    public void affiche() {
        System.out.println("Le nom est: " + this.nom + ", spécialité est: " + this.specialite);
        for (int i = 0; i < b.length; i++) {
            this.b[i].affiche();
        }
    }

    public String toString() {
        String result = "Nom: " + nom + ", Spécialité: " + specialite + ", Adresse: " + a.toString();
        for (int i = 0; i < b.length; i++) {
            result += b[i].toString();
        }
        return result;
    }
}
