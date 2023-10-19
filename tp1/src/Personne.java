public class Personne {
    String name;
    String firstName;
    int dayNaiss;
    int monthNaiss;
    int yearNaiss;

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateNaiss(int day, int month, int year) {
        dayNaiss = day;
        monthNaiss = month;
        yearNaiss = year;
    }

    public int ageEn2023() {
        return 2023 - yearNaiss;

    }
}
