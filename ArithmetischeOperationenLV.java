public class ArithmetischeOperationenLV {
    public static void main(String[] args) {

        // deklarieren und initialsieren variablen

        int a = 3;
        int b = 2;

        int result;

        // Addieren
        result = a + b;
        System.out.println("result = " + result);

        // Subtrahieren
        result = a - b;
        System.out.println("result = " + result);

        // multiplizieren
        result = a*b;
        System.out.println("Multiplikation: " + result);
        // auch Möglichkeit der Ausgabe: System.out.println("Multiplikation: " + (a*b));
        // erklärung: mit diesem Resultat könnten wir aus zeile oben ohne der zeile davor (bei dieser Vorgehensweise)
        // nicht weiterarbeiten >> da keine Zwischenspeicherung stattgefunden hat

        // dividieren
        result = a/b;
        System.out.println("Division: " + result);

        double div = (double) a / (double) b; // >> manuelle deklaration des Variablentyps
        // Andere Codevariante um korr. Berechn. zu gewährleisten: double div = a / (1.0 * b);

        System.out.println("Dividieren double: " + div);

        // Restwert Modulo
        result = a % b;
        System.out.println("Result Modulo " + result);

        // a++ (bedeutet a = a+1)
        System.out.println("a++ ");
        // ich erwarte mir 3
        System.out.println(a++);
        System.out.println("a = " + a); // ich erwarte mir 4

        // b++
        System.out.println("++b");
        System.out.println(++b); //ich erwarte mir 3
        System.out.println("b = " + b); // ich erwarte mir 3

        // entweder wir postinkrement ausgeführt  oder bzw. bevor es ausgelesen wird um +1 erhöht

    }
}

// Workaround über die Changelisten