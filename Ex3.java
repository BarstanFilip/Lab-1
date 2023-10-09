import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citim un număr de 4 cifre
        System.out.println("Introduceti un nr de 4 cifre:");
        int numar = scanner.nextInt();

        // Afișăm meniul
        System.out.println("Meniu:");
        System.out.println("1. Afisare paritate ultima cifra");
        System.out.println("2. Afisare paritate prima cifra");
        System.out.println("3. Afisare suma cifrelor");
        System.out.print("Alegeti un nr  (1, 2, 3) ");
        
        int optiune = scanner.nextInt();

        switch (optiune) {
            case 1:
                // Afișare paritate ultima cifră
                int ultimaCifra = numar % 10;
                if (ultimaCifra % 2 == 0) {
                    System.out.println("Ultima cifra este para");
                } else {
                    System.out.println("Ultima cifra este impar ");
                }
                break;

            case 2:
                // Afișare paritate prima cifra
                int primaCifra = numar / 1000;
                if (primaCifra % 2 == 0) {
                    System.out.println(" este para.");
                } else {
                    System.out.println(" este impara.");
                }
                break;

            case 3:
                // Afisare suma cifrelor
                int ultimaCifraSum = numar % 10;
                int primaCifraSum = numar / 1000;
                int sumacifrelor = ultimaCifraSum + primaCifraSum;
                System.out.println("Suma cifrelor este " + sumacifrelor);
                break;

            case 4:
                // inchidere program
                System.out.println("Programul se inchide.");
                scanner.close();
                System.exit(0);
                break;

            default:
                System.out.println("Nu a functionat");
                break;
        }
    }
}
