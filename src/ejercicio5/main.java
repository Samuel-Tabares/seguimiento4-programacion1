package ejercicio5;

public class main {
    public static void main(String[] args) {
        // Crear un avión
        Avion avion1 = new Avion("Boeing 737", 150);

        // Crear un vuelo
        Vuelo vuelo1 = new Vuelo("AA123", "New York - Los Angeles", "2024-08-25", "08:00", "11:00", avion1);

        // Crear un pasajero
        Pasajero pasajero1 = new Pasajero("Juan Pérez", "123456789", "juan@example.com");

        // Reservar un asiento
        Asiento asiento1 = avion1.obtenerAsiento(5);
        Reserva reserva1 = new Reserva(pasajero1, vuelo1, asiento1);
        pasajero1.agregarReserva(reserva1);

        // Mostrar detalles de la reserva
        System.out.println("Reserva realizada:");
        System.out.println("Pasajero: " + pasajero1.obtenerNombre());
        System.out.println("Vuelo: " + vuelo1.obtenerNumero() + " (" + vuelo1.obtenerRuta() + ")");
        System.out.println("Asiento: " + asiento1.obtenerNumero() + " - " + asiento1.obtenerClase());
        System.out.println("Estado del asiento: " + asiento1.obtenerEstado());
    }
}
