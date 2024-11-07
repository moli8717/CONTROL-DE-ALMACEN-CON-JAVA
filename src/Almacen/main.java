package Almacen;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SistemaAlmacen sistema = new SistemaAlmacen();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- Menú del Sistema de Almacén ---");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Modificar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Registrar Movimiento de Stock");
            System.out.println("5. Mostrar Stock");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    sistema.agregarProducto();
                    break;
                case 2:
                    sistema.modificarProducto();
                    break;
                case 3:
                    sistema.eliminarProducto();
                    break;
                case 4:
                    sistema.registrarMovimiento();
                    break;
                case 5:
                    sistema.mostrarStock();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
