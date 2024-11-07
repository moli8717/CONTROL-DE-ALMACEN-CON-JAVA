package Almacen;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAlmacen {
    private ArrayList<Producto> productos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarProducto() {
        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Stock inicial: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        productos.add(new Producto(codigo, nombre, stock));
        System.out.println("Producto agregado.");
    }

    public void modificarProducto() {
        System.out.print("Código del producto a modificar: ");
        String codigo = scanner.nextLine();
        Producto producto = buscarProducto(codigo);

        if (producto != null) {
            System.out.print("Nuevo nombre: ");
            producto.setNombre(scanner.nextLine());
            System.out.print("Nuevo stock: ");
            producto.setStock(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Producto modificado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto() {
        System.out.print("Código del producto a eliminar: ");
        String codigo = scanner.nextLine();
        Producto producto = buscarProducto(codigo);

        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void registrarMovimiento() {
        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();
        Producto producto = buscarProducto(codigo);

        if (producto != null) {
            System.out.print("Ingrese '1' para entrada o '2' para salida: ");
            int tipo = scanner.nextInt();
            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            if (tipo == 1) {
                producto.agregarStock(cantidad);
                System.out.println("Entrada registrada.");
            } else if (tipo == 2) {
                producto.reducirStock(cantidad);
                System.out.println("Salida registrada.");
            } else {
                System.out.println("Movimiento no válido.");
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarStock() {
        System.out.println("\n--- Estado del Stock ---");
        for (Producto producto : productos) {
            System.out.printf("Código: %s, Nombre: %s, Stock: %d\n",
                    producto.getCodigo(), producto.getNombre(), producto.getStock());
        }
    }

    private Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }
}
