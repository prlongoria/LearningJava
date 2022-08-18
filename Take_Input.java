import java.util.Scanner;

class take_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creo un objeto con lo que Scanner recoge de la consola (el valor que escriben en ella)

        System.out.println("Enter your name: "); //para que el usuario sepa qué tiene que escribir en la pantalla (valor que le pido)
        String name = input.nextLine(); //almaceno en esta variable tipo String el valor que recogí con el Scanner. El método  nextInt() es el que captura ese valor
        System.out.println("Your name is: " + name);
    }
}