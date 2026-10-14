import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        int edad = 2026 - anioNacimiento;

        System.out.println("\n¡Hola, " + nombre + "!");
        System.out.println("Tienes (o cumplirás) " + edad + " años.");

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        scanner.close();
    }
}