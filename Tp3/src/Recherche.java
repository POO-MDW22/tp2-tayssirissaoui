public class Recherche {
    private String nom;
    private String post;
    private int numord;
    static int nb;

    public Recherche() {
        nb++;
    }

    public Recherche(String n, String p, int no) {
        this.nom = n;
        this.post = p;
        this.numord = no;
        nb++;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public String getNom() {
        return this.nom;
    }

    public void setPost(String p) {
        this.post = p;
    }

    public String getPost() {
        return this.post;
    }

    public void setNumOrd(int o) {
        this.numord = o;
    }

    public int getNumOrd() {
        return this.numord;
    }

    public void affiche() {
        System.out.println("Le nom est: " + this.nom + ", La post est: " + this.post + ", Le numéro de machine est: " + this.numord);
    }

    @Override
    public String toString() {
        return "Le nom est: " + this.nom + ", La post est: " + this.post + ", Le numéro de machine est: " + this.numord;
    }

    public boolean comparer(Recherche ch) {
        return this.nom.equals(ch.nom) && this.numord == ch.numord && this.post.equals(ch.post);
    }
}