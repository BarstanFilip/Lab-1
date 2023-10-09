import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Ex1 <numar1> <numar2>");
            return;
        }

        Random random = new Random();

        int numar1 = Integer.parseInt(args[0]);
        int numar2 = Integer.parseInt(args[1]);
        
        int randomNum = random.nextInt(100); 
        
        // a
        int suma = numar1 + numar2;
        int produs = numar1 * numar2;
        
        // b
        int cat = numar1 / numar2; // Changed to integer division to get the quotient
        int rest = numar1 % numar2; // Modulus operator gives the remainder
        
        // c
        int nr1random = numar1 * randomNum;
        int nr2random = numar2 * randomNum;
        
        System.out.println("Suma este " + suma);
        System.out.println("Produsul este " + produs);
        System.out.println("Catul este " + cat);
        System.out.println("Restul este " + rest);
        System.out.println("nr1 este " + nr1random);
        System.out.println("nr2 este " + nr2random);
    }
}