public class Cuillere extends Ustensile{
    private double longeur;
    public Cuillere(){}
    public Cuillere(int annee_fabrication,double longeur){
        super(annee_fabrication);
        this.longeur=longeur;

    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLongeur() {
        return longeur;
    }

    @Override
    public String toString() {
        return "lannee de fabrication est"+getAnnee_fabrication()+"la longuer est"+this.longeur;
    }
}
