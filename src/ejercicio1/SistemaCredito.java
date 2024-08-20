package ejercicio1;

public class SistemaCredito {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Juan Pérez", "12345678", "Calle Falsa 123", "Bueno", 50000);

        // Crear una solicitud de crédito personal
        SolicitudCredito solicitudPersonal = new SolicitudCredito(cliente, "personal", 10000, 12, 5.0);

        // Crear un crédito personal
        Credito creditoPersonal = new Credito(solicitudPersonal);

        // Aprobar el crédito personal
        creditoPersonal.aprobar();

        // Mostrar detalles del crédito personal
        System.out.println("Crédito Personal:");
        System.out.println("Cliente: " + creditoPersonal.obtenerSolicitudCredito().obtenerCliente().obtenerNombre());
        System.out.println("Monto: " + creditoPersonal.obtenerSolicitudCredito().obtenerMonto());
        System.out.println("Estado: " + creditoPersonal.obtenerEstado());

        // Crear una propiedad
        Propiedad propiedad = new Propiedad("Calle Falsa 456", 200000);

        // Crear una solicitud de crédito hipotecario
        SolicitudCredito solicitudHipotecario = new SolicitudCredito(cliente, "hipotecario", 150000, 240, 3.5);

        // Crear un crédito hipotecario
        CreditoHipotecario creditoHipotecario = new CreditoHipotecario(solicitudHipotecario, propiedad);

        // Rechazar el crédito hipotecario
        creditoHipotecario.rechazar();

        // Mostrar detalles del crédito hipotecario
        System.out.println("\nCrédito Hipotecario:");
        System.out.println("Cliente: " + creditoHipotecario.obtenerSolicitudCredito().obtenerCliente().obtenerNombre());
        System.out.println("Monto: " + creditoHipotecario.obtenerSolicitudCredito().obtenerMonto());
        System.out.println("Estado: " + creditoHipotecario.obtenerEstado());
        System.out.println("Propiedad: " + creditoHipotecario.obtenerPropiedad().obtenerDireccion());
    }
}
