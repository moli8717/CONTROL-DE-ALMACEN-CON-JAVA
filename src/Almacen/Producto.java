package Almacen;

//public class Producto {// Producto.java

public class Producto {
        private String codigo;
        private String nombre;
        private int stock;

        public Producto(String codigo, String nombre, int stock) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.stock = stock;
        }

        // Getters y setters
        public String getCodigo() {
            return codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        // Métodos para gestionar stock
        public void agregarStock(int cantidad) {
            this.stock += cantidad;
        }

        public void reducirStock(int cantidad) {
            if (this.stock >= cantidad) {
                this.stock -= cantidad;
            } else {
                System.out.println("Stock insuficiente.");
            }
        }
    }


