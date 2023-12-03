public abstract class Assiette extends Ustensile {
    public Assiette(){}
    public Assiette(int annee_fabrication){
        super(annee_fabrication);
    }
    public abstract double calculerSurface();
}
