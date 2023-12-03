public abstract class Ustensile {
    private int annee_fabrication;

    public Ustensile() {}

    public Ustensile(int annee_fabrication) {
        this.annee_fabrication = annee_fabrication;
    }

    public void setAnnee_fabrication(int annee_fabrication) {
        this.annee_fabrication = annee_fabrication;
    }

    public int getAnnee_fabrication() {
        return annee_fabrication;
    }

    @Override
    public String toString() {
        return "L'année de fabrication est " + this.annee_fabrication;
    }

    public double calculerValeur(int anneeActuelle) {
        int age = (anneeActuelle - getAnnee_fabrication());
        double valeur = 0;
        if (age > 50) {
            valeur = age - 50;
        }
        return valeur;
    }
}
