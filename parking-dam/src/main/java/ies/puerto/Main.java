package ies.puerto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float tarifaHora = 1.50f;
        int totalVehiculos = 0;
        int totalHorasRegistradas = 0;
        int totalCalculosTarifa = 0;
        float importeTotalCalculado = 0f;
        int opcion = 0;
        System.out.println("================================" +
                           "           BIENVENIDO           " +
                           "================================");
        System.out.println("  Introduzca nombre de usuario: ");
        String nombre = teclado.nextLine();
        System.out.println("Bienvenid@, "+nombre+".");


        do {
            System.out.println("========================================");
            System.out.println("              Parking Menu              ");
            System.out.println("========================================");
            System.out.println("1.Registrar vehículos");
            System.out.println("2.Calcular tarifa de estacionamiento");
            System.out.println("3.Mostrar resumen del día");
            System.out.println("4.Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case(1):
                    System.out.println("a");
            }
            switch (opcion) {
                case(2):
                    System.out.println("b");
            }
            switch (opcion) {
                case(3):
                    System.out.println("c");
            }
        } while(opcion != 4);
        // 1. Leer el nombre del usuario.
        // 2. Repetir el menú con do-while.
        // 3. Resolver cada opción mediante switch.
        // 4. Llamar a tus métodos y actualizar acumuladores.
        // 5. Cerrar Scanner al salir.

        teclado.close();
    }

    // Escribe aquí tus métodos.
}