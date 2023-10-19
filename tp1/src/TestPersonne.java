public class TestPersonne {

    public static void main(String[] args) {
        Personne person = new Personne();

        person.setName("Tayssir");
        person.setFirstName("issaoui");
        person.setDateNaiss(1, 1, 2022);

        System.out.println("Nom : " + person.name);
        System.out.println("Prénom : " + person.firstName);
        System.out.println("Date de naissance : " + person.dayNaiss + "/" + person.monthNaiss + "/" + person.yearNaiss);
        System.out.println("Age en 2023 : " + person.ageEn2023() + " ans");
    }
}