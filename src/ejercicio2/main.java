package ejercicio2;

// Clase principal para probar el sistema
public class main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Juan Pérez", "12345678", "Calle Falsa 123", "Ninguna");

        // Crear una función
        Funcion funcion = new Funcion("Pelicula A", "18:00", 1, 50.0);

        // Crear una sala
        Sala sala = new Sala(1, 100);

        // Reservar algunos asientos
        Asiento asiento1 = sala.obtenerAsiento(0, 0);
        Asiento asiento2 = sala.obtenerAsiento(0, 1);
        asiento1.reservar();
        asiento2.reservar();

        // Crear una reserva
        Asiento[] asientosReservados = { asiento1, asiento2 };
        Reserva reserva = new Reserva(cliente, funcion, asientosReservados);

        // Mostrar detalles de la reserva
        System.out.println("Cliente: " + reserva.obtenerCliente().obtenerNombre());
        System.out.println("Pelicula: " + reserva.obtenerFuncion().obtenerPelicula());
        System.out.println("Hora de Inicio: " + reserva.obtenerFuncion().obtenerHoraInicio());
        System.out.println("Sala: " + reserva.obtenerFuncion().obtenerSala());
        System.out.println("Asientos reservados:");
        for (Asiento asiento : reserva.obtenerListaAsientos()) {
            System.out.println("Fila: " + asiento.obtenerFila() + ", Columna: " + asiento.obtenerColumna() + ", Estado: " + asiento.obtenerEstado());
        }
    }
}

