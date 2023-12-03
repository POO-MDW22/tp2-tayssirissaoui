public class Assiette_Ronde extends Assiette {
    private double rayon;

    public Assiette_Ronde() {}

    public Assiette_Ronde(int annee_fabrication, double rayon) {
        super(annee_fabrication);
        this.rayon = rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return this.rayon;
    }

    public String toString() {
        return "L'année de fabrication est " + getAnnee_fabrication() + ". Le rayon est " + this.rayon;
    }
    public double calculerSurface() {
        return (3.14 * getRayon() * getRayon());
    }
}
