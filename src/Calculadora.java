/**
 * Esta clase...
 *
 * @Author: José Aguilar Alanís
 * @Version; 2024.03
 */

//Hazme una clase de calculadora
public class Calculadora {
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }
}

