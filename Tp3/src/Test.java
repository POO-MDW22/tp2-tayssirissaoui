public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Address a1 = new Address();
        a1.gouvernorat = "tunis";
        a1.ville = "ariana";
        a1.codepostal = 2004;
        System.out.println(a1);
        a1.codepostal = 2074;
        a1.affiche();
        Address a2 = new Address("tunis", "sidibouzid", 9100);
        a2.ville = "sfax";
        a2.affiche();
        Recherche ch1 = new Recherche();
        ch1.setNom("ali");
        ch1.setPost("mdw");
        ch1.setNumOrd(55);
        ch1.affiche();
        System.out.println(ch1.toString());
        System.out.println(Recherche.nb);
        Recherche ch2 = new Recherche("ahmed", "resaux", 20);
        if (ch1.comparer(ch2)) {
            System.out.println("C'est le même chercheur");
        }

        Recherche[] ch = new Recherche[]{ch1, ch2};
        bureau b1 = new bureau(100, "b", ch);
        bureau b2 = new bureau(50, "a", ch);
        bureau[] bt = new bureau[]{b1, b2};
        Laboratoire lab = new Laboratoire("l1", "info", bt, a1);
        lab.affiche();
    }
}
