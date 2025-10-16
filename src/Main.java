import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
        int a = 12, b = 12, c = 12;

        if (a == b || b == c || a == c) {
            System.out.println("Hay numeros iguales");
        } else {
            //***** OPCION OPTIMIZADA *****
            int menor = Math.min(a, Math.min(b, c));
            int mayor = Math.max(a, Math.max(b, c));

            System.out.println("El menor numero es: " + menor);
            System.out.println("El mayor numero es: " + mayor);

        }

        //2
        int filas = 5;

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //3
        for (int i = 0; i < 4; i++) {
            System.out.print(" ".repeat(3 - i));
            System.out.println("*".repeat((2 * i) + 1));
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ".repeat(i + 1));
            System.out.println("*".repeat(5 - (2 * i)));
        }
        System.out.println();

        //4
        for (int i = 0; i < 4; i++) {
            System.out.print(" ".repeat(3 - i));
            System.out.print("*");
            if (i > 0) {
                System.out.print(" ".repeat((2 * i) - 1));
                System.out.println("*");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ".repeat(i + 1));
            System.out.print("*");
            if (i < 2) {
                System.out.print(" ".repeat(3 - (2 * i)));
                System.out.println("*");
            }
        }

        System.out.println("\n");

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
        System.out.println();

        //8
        System.out.println(decimalToRomano(1982));
        System.out.println();

        //11
        for (int i = 1; i <= 50; i++) {
            System.out.print(i * 2 + " ");
        }
        System.out.println();

        //12
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) continue;
            System.out.print(i + " ");
        }
    }


    public static String decimalToRomano(int numero) {
        int[] valoresDecimales = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolosRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valoresDecimales.length; i++) {
            while (numero >= valoresDecimales[i]) {
                numero -= valoresDecimales[i];
                resultado.append(simbolosRomanos[i]);
            }
        }
        return resultado.toString();
    }
}

