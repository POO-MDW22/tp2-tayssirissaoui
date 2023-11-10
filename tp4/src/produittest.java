import java.util.Scanner;
import java.time.LocalDate;

public class produittest {
    public static void main(String[] args) {
        Scanner objetscan = new Scanner(System.in);

        newProduits p = new newProduits();

        System.out.println("Donner l'identifiant du produit");
        p.identifier = objetscan.nextInt();
        System.out.println("Donner le libellé du produit");
        p.libelle = objetscan.next();
        System.out.println("Donner la marque du produit");
        p.marque = objetscan.next();
        System.out.println("Donner le prix du produit");
        p.prix = objetscan.nextDouble();

        newProduits p1 = new newProduits(1021, "lait", "delice", 0, LocalDate.now());
        newProduits p2 = new newProduits(2510, "yaourt", "vitalait", 0, LocalDate.of(2021, 10, 23));
        newProduits p3 = new newProduits(3250, "tomate", "sicam", 1.200, LocalDate.of(2021, 10, 23));

        p1.affiche();
        p2.affiche();
        p3.affiche();
        p.affiche();

        p2.prix = 700;
        System.out.println("Le prix du produit modifié: " + p2.prix);

        System.out.println(p);

        p.setDate_ex(LocalDate.of(2023, 3, 30));
        p2.setDate_ex(LocalDate.of(2023, 8, 7));

        p.affiche();
        p2.affiche();

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        LocalDate specificDate = LocalDate.of(2023, 8, 7);
        System.out.println("Specific date: " + specificDate);
    }
}