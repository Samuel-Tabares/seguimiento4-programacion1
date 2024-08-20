package ejercicio3;

public class main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Juan Pérez", "12345678", "Calle Falsa 123", "Ninguna");

        // Crear vagones
        Vagon vagonEconomico = new Vagon("Clase Económica", 100);
        Vagon vagonTurista = new Vagon("Clase Turista", 50);

        // Crear un tren
        Vagon[] vagones = {vagonEconomico, vagonTurista};
        Tren tren = new Tren("T123", "Ciudad A - Ciudad B", vagones);

        // Crear un viaje
        Viaje viaje = new Viaje("2024-08-20", "08:00", "12:00", tren);

        // Reservar un asiento en clase económica
        Asiento asiento = vagonEconomico.obtenerAsiento(10);
        asiento.reservar();

        // Crear un boleto
        Boleto boleto = new Boleto(cliente, viaje, asiento);

        // Mostrar detalles del boleto
        System.out.println("Cliente: " + boleto.obtenerCliente().obtenerNombre());
        System.out.println("Viaje: " + boleto.obtenerViaje().obtenerTren().obtenerRuta());
        System.out.println("Asiento: " + boleto.obtenerAsiento().obtenerNumero() + " en " + vagonEconomico.obtenerTipo());
        System.out.println("Estado del Asiento: " + boleto.obtenerAsiento().obtenerEstado());
    }
}
