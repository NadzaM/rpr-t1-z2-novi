package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    private static int sumaCifara(int prviBroj) {
        int suma = 0;
        // int p = 10;
        while (prviBroj > 0) {
            suma += prviBroj % 10;
            prviBroj /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        // write your code here
        int n;
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i);
        }


    }
}
