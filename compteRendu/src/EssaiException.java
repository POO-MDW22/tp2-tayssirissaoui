import java.util.Scanner;

public class EssaiException {
    public static void main(String[] args) {
        int a, b, res;
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrer le nombre a: ");
        a = clavier.nextInt();
        System.out.print("Entrer le nombre b: ");
        b = clavier.nextInt();

        try {
            res = a / b;
            System.out.println("Le résultat de " + a + " divisé par " + b + " est " + res);
        } catch (ArithmeticException e) {
            System.out.println("Oops! Un problème dans la division.");
            System.out.println("Le message officiel est " + e.getMessage());
        } finally {
            System.out.println("Le bloc finally sera toujours exécuté.");
            System.out.println("C'est là que l'on fermera, par exemple, les fichiers.");
        }

        System.out.println("Fin du programme");
    }
}


//1/Si vous saisissez une valeur nulle pour b, le programme ne s'exécutera pas correctement. Il vérifie si le diviseur b est différent de zéro avant de procéder à la division. Si b est zéro, le programme affichera "Division par zéro ! Impossible de calculer." et se terminera.
//
//2/Si vous avez saisi une valeur nulle pour b, le message "Fin du programme" ne sera pas affiché car le programme s'arrête avant d'atteindre cette ligne en cas de division par zéro.

//3/L'exception levée par la machine Java dans le cas d'une division par zéro est ArithmeticException.


//2.1/ Oui, le programme a affiché qu'il y avait un problème dans la division. Cela est dû à la ligne res = a / b; en dehors du bloc try-catch, où la division est effectuée sans être encapsulée dans une gestion d'exception.

//2.2/ Oui, le message "Fin du programme" est apparu deux fois, une fois après la première tentative de division et une fois à la fin du programme.

//2.3/ Le message d'erreur officiel correspondant à une telle exception est "ArithmeticException: / by zero". Cela signifie qu'une tentative de division par zéro a été effectuée, ce qui est une situation incorrecte en mathématiques et provoque une exception de type ArithmeticException.





//Le bloc finallya t-il été exécuté ?
//non

//L'exception a-t-elle été traitée ?
//oui
        //Pour terminer, vous allez maintenant relancer le programme en saisissant une lettre à la place d'un nombre. Que se passe-t-il ?
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//Quelle exception a été lancée ?
//Exception in thread "main" java.util.InputMismatchException
//at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//at java.base/java.util.Scanner.next(Scanner.java:1594)
//at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//at EssaiException.main(EssaiException.java:9)
