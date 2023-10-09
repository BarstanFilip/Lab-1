import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Ex2 <numar1> <numar2>");
            return;
        }

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numar1 = scanner.nextInt(); // Use the scanner to read numar1
        int numar2 = scanner.nextInt(); // Use the scanner to read numar2

        int randomNum = random.nextInt(100);

        // a
        int suma = numar1 + numar2;
        int produs = numar1 * numar2;

        // b
        int cat = numar1 / numar2; // Integer division to get the quotient
        int rest = numar1 % numar2; // Modulus operator to get the remainder

        // c
        int nr1random = numar1 * randomNum;
        int nr2random = numar2 * randomNum;

        scanner.close(); // Close the scanner when done with it

        System.out.println("Suma este " + suma);
        System.out.println("Produsul este " + produs);
        System.out.println("Catul este " + cat);
        System.out.println("Restul este " + rest);
        System.out.println("nr1 este " + nr1random);
        System.out.println("nr2 este " + nr2random);
	
	scanner.close();
    }
}