package ejercicio5;

import java.util.ArrayList;
import java.util.List;

// Clase Persona
class Persona {
    private String nombre;
    private String identificacion;
    private String contacto;

    public Persona(String nombre, String identificacion, String contacto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public String obtenerContacto() {
        return contacto;
    }
}

// Clase Pasajero (hereda de Persona)
class Pasajero extends Persona {
    private List<Reserva> historialReservas;

    public Pasajero(String nombre, String identificacion, String contacto) {
        super(nombre, identificacion, contacto);
        this.historialReservas = new ArrayList<>();
    }

    public List<Reserva> obtenerHistorialReservas() {
        return historialReservas;
    }

    public void agregarReserva(Reserva reserva) {
        historialReservas.add(reserva);
    }
}

// Clase Asiento
class Asiento {
    private int numero;
    private String clase;
    private String estado; // "disponible", "reservado", "ocupado"

    public Asiento(int numero, String clase) {
        this.numero = numero;
        this.clase = clase;
        this.estado = "disponible";
    }

    public int obtenerNumero() {
        return numero;
    }

    public String obtenerClase() {
        return clase;
    }

    public String obtenerEstado() {
        return estado;
    }

    public void reservar() {
        if (estado.equals("disponible")) {
            estado = "reservado";
        }
    }

    public void ocupar() {
        if (estado.equals("reservado")) {
            estado = "ocupado";
        }
    }
}

// Clase Avion
class Avion {
    private String modelo;
    private int capacidad;
    private List<Asiento> listaAsientos;

    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.listaAsientos = new ArrayList<>();

        for (int i = 1; i <= capacidad; i++) {
            // Por simplicidad, todos los asientos son clase económica
            listaAsientos.add(new Asiento(i, "económica"));
        }
    }

    public String obtenerModelo() {
        return modelo;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int numero) {
        if (numero > 0 && numero <= capacidad) {
            return listaAsientos.get(numero - 1);
        }
        return null;
    }
}

// Clase Vuelo
class Vuelo {
    private String numero;
    private String ruta;
    private String fecha;
    private String horaSalida;
    private String horaLlegada;
    private Avion avion;

    public Vuelo(String numero, String ruta, String fecha, String horaSalida, String horaLlegada, Avion avion) {
        this.numero = numero;
        this.ruta = ruta;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.avion = avion;
    }

    public String obtenerNumero() {
        return numero;
    }

    public String obtenerRuta() {
        return ruta;
    }

    public String obtenerFecha() {
        return fecha;
    }

    public String obtenerHoraSalida() {
        return horaSalida;
    }

    public String obtenerHoraLlegada() {
        return horaLlegada;
    }

    public Avion obtenerAvion() {
        return avion;
    }
}

// Clase Reserva
class Reserva {
    private Pasajero pasajero;
    private Vuelo vuelo;
    private Asiento asiento;

    public Reserva(Pasajero pasajero, Vuelo vuelo, Asiento asiento) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
        asiento.reservar();
    }

    public Pasajero obtenerPasajero() {
        return pasajero;
    }

    public Vuelo obtenerVuelo() {
        return vuelo;
    }

    public Asiento obtenerAsiento() {
        return asiento;
    }
}
