public class livretest {
    public static void main(String[] args) {
        livre L1 = new livre("pc", "45745", "bill gates", 1550);
        livre L2 = new livre("prog", "45745", "bill gates*", 1730);
        livre L3 = new livre("poo", "45745", "bill gates", 1500);
        L1.affiche();
        System.out.println(L1.count);
    }
}
