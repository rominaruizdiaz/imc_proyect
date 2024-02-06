package dev.rominaruiz.imc_proyect;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu peso en kilogramos:");
        double weight = scanner.nextDouble();

        System.out.println("Ingresa tu estatura en metros:");
        double height = scanner.nextDouble();

        Person person = new Person(weight, height);

        System.out.printf("El IMC de la persona es: %.2f\n", person.calculateImc());
        System.out.println("La categoría de peso de la persona es: " + person.determineWeight());

        scanner.close();
    }
}
