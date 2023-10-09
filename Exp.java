import java.util.Scanner;
import java.util.Random;

public class Exp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citim cele două numere întregi de la linia de comandă
        System.out.print("Introduceți primul număr întreg: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduceți al doilea număr întreg: ");
        int num2 = scanner.nextInt();

        // a) Suma și produsul
        int suma = num1 + num2;
        int produs = num1 * num2;
        System.out.println("Suma: " + suma);
        System.out.println("Produsul: " + produs);

        // b) Câtul și restul împărțirii întregi
        int catul = num1 / num2;
        int restul = num1 % num2;
        System.out.println("Câtul: " + catul);
        System.out.println("Restul: " + restul);

        // c) Valoarea rezultată după înmulțirea fiecărui număr cu un număr aleator
        Random random = new Random();
        int numarAleator = random.nextInt(100); // Generăm un număr aleator între 0 și 99
        int rezultat1 = num1 * numarAleator;
        int rezultat2 = num2 * numarAleator;
        System.out.println("Rezultat după înmulțirea primului număr cu numărul aleator: " + rezultat1);
        System.out.println("Rezultat după înmulțirea celui de-al doilea număr cu numărul aleator: " + rezultat2);

        scanner.close();
    }
}