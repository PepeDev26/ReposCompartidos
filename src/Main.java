/**
 * Esta clase es el Main
 *
 * @Author: José Aguilar Alanís
 * @Version; 2024.03
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora Simple");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = calculadora.sumar(num1, num2);
                break;
            case 2:
                resultado = calculadora.restar(num1, num2);
                break;
            case 3:
                resultado = calculadora.multiplicar(num1, num2);
                break;
            case 4:
                try {
                    resultado = calculadora.dividir(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
