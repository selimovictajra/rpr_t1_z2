package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int SumaCifara (int n) {
        int suma = 0;
        if (n < 0) n *= -1;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Upisi n: ");
        int n = in.nextInt();
        System.out.println(SumaCifara(n));
    }
}