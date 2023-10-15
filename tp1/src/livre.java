public class livre {
    private String titre;
    String id;
    float prix;
    String auteur;
    static int count;
    public livre(String titre, String id, String auteur, float prix) {
        this.id=id;
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
        count++;
    }
    public void affiche () {
        System.out.println("id:"+ this.id + " titre: " + this.titre + "auteur:"+ this.auteur +"prix"+this.prix);

}
}
