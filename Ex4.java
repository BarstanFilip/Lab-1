import java.util.Scanner;
import java.lang.Math;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numar = scanner.nextDouble();

        double sin = Math.sin(numar);
        double cos = Math.cos(numar);
        double rad = Math.sqrt(numar);
        System.out.println("sin " + sin);
        System.out.println("cos " + cos);
        System.out.println("radical " + rad);

        scanner.close();
    }
}