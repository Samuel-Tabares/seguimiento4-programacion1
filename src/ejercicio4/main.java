package ejercicio4;

public class main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Laptop", "Laptop de alto rendimiento", 1500.00, 10);
        ProductoPerecedero productoPerecedero1 = new ProductoPerecedero("Leche", "Leche entera 1L", 1.50, 100, "2024-09-01");

        // Mostrar detalles de los productos
        System.out.println(producto1);
        System.out.println(productoPerecedero1);

        // Modificar stock
        producto1.modificarStock(5); // Aumentar stock
        productoPerecedero1.modificarStock(-10); // Reducir stock

        // Mostrar detalles actualizados de los productos
        System.out.println("Después de modificar el stock:");
        System.out.println(producto1);
        System.out.println(productoPerecedero1);

        // Lógica para agregar, modificar y eliminar productos
        // Aquí podrías implementar métodos adicionales para gestionar una lista de productos.
    }
}
