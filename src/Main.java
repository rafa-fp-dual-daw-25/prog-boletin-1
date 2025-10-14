import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        int a = 12, b = 3, c = 9;

        if (a == b || b == c || a == c) {
            System.out.println("Hay numeros iguales");
        } else {
            //***** OPCION OPTIMIZADA (CHAT GPT) *****
            int menor = Math.min(a, Math.min(b, c));
            int mayor = Math.max(a, Math.max(b, c));

            System.out.println("El menor numero es: " + menor);
            System.out.println("El mayor numero es: " + mayor);

            /*if (a < b && a < c) {
                System.out.println("El menor numero es: " + a);
            } else if (b < a && b < c) {
                System.out.println("El menor numero es: " + b);
            } else {
                System.out.println("El menor numero es: " + c);
            }
            if (a > b && a > c) {
                System.out.println("El mayor numero es: " + a);
            } else if (b > a && b > c) {
                System.out.println("El mayor numero es: " + b);
            } else if (c > a && c > b) {
                System.out.println("El mayor numero es: " + c);
            }*/
        }

        //2
        int filas = 5;

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //3
        /*do {
            for (int i = 3; i >= 0; i--) {
                System.out.print(" ");
            }
            multiplicador++;
            System.out.println();
        } while (multiplicador <= 10);

        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
        }*/

        //6
        int multiplicador = 1;
        do {
            System.out.println("Tabla del " + multiplicador);
            System.out.println("*************");
            for (int i = 1; i <= 10; i++) {
                System.out.println(multiplicador + " x " + i + " = " + (multiplicador * i));
            }

            multiplicador++;
            System.out.println();
        } while (multiplicador <= 10);

        //7
        Random rnd = new Random();
        int valor = rnd.nextInt(101) + 100;

        if (valor % 2 == 0) {
            System.out.println("El valor " + valor + " es par.");
        } else {
            System.out.println("El valor " + valor + " es impar.");
        }

        //8
        String[] simbolosRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valoresDecimales = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    }
}