public class bureau {
    public int code;
    public String nom;
    public Recherche ch[];

    public bureau() {
    }

    public bureau(int code, String nom, Recherche ch[]) {
        this.code = code;
        this.nom = nom;
        this.ch = ch;
    }

    public void affiche() {
        System.out.println("Le code est: " + this.code + ", Le nom est: " + this.nom);
        for (int i = 0; i < ch.length; i++) {
            this.ch[i].affiche();
        }
    }

    public String toString() {
        String result = "Code: " + code + ", Nom: " + nom;
        for (int i = 0; i < ch.length; i++) {
            result += "\n" + ch[i].toString();
        }
        return result;
    }
}
