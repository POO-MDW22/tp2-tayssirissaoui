public class Assiette_Carree extends Assiette{
    private double cote;
    public Assiette_Carree(){}
    public Assiette_Carree(double cote,int annee_fabrication){
        super(annee_fabrication);
        this.cote=cote;

    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public String toString() {
        return "lannee de fabrication est"+getAnnee_fabrication()+"la cote est"+this.cote;
    }
    public double calculerSurface() {
        return (getCote() * getCote());
    }
    public double calculerValeur(int anneeActuelle) {
        double valeur = 5 * super.calculerValeur(anneeActuelle);
        return valeur;
    }

}
