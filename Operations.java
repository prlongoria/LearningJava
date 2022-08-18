import java.util.Scanner;

// public class Operations {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("dame un número ");
//         double primerNumero = input.nextDouble();
//         System.out.println("dame otro número ");
//         double segundoNumero = input.nextDouble();
//         double sumaNumeros = primerNumero + segundoNumero;
//         System.out.println("La suma es:" + sumaNumeros);
//     }
// }

// class Multiplicate {
//     public static void main(String args[]) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Introduce un número: ");
//         int number = input.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(number + " * " + i + " = " + (number * i));
//         }

//     }
// }
class Calculator {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer número; ");
        int primerNumero = input.nextInt();
        System.out.println("Introduce el segundo número; ");
        int segundoNumero = input.nextInt();
        System.out.println("Escoge la operación (+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        if (operator == '+') {
            int suma = primerNumero + segundoNumero;
            System.out.println (primerNumero + " + " + segundoNumero + " = " + suma);
        }
        if (operator == '-') {
            int resta = primerNumero - segundoNumero;
            System.out.println (primerNumero + " - " + segundoNumero + " = " + resta);
        }
        if (operator == '*') {
            int multiplicacion = primerNumero * segundoNumero;
            System.out.println (primerNumero + " * " + segundoNumero + " = " + multiplicacion);
        }
        if (operator == '/') {
            int division = primerNumero / segundoNumero;
            System.out.println (primerNumero + " / " + segundoNumero + " = " + division);
        }
    }
}