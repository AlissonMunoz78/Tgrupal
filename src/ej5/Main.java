package ej5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Golpear golpeo = new Golpear();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia a la portería (en metros): ");
        double distancia = scanner.nextDouble();
        golpeo.setDistancia(distancia);

        System.out.print("Ingrese el ángulo de lanzamiento (en grados): ");
        double angulo = scanner.nextDouble();
        golpeo.setAngulo(angulo);

        System.out.print("Ingrese el tiempo para que el balón llegue (en segundos): ");
        double tiempo = scanner.nextDouble();
        golpeo.setTiempo(tiempo);

        // Mostrar el resultado de la velocidad calculada
        golpeo.mostrarResultado();

        scanner.close();
    }
}
