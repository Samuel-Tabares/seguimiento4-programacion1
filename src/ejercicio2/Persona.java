package ejercicio2;

// Clase Persona
class Persona {
    private String nombre;
    private String identificacion;
    private String direccion;

    public Persona(String nombre, String identificacion, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public String obtenerDireccion() {
        return direccion;
    }
}

// Clase Cliente (hereda de Persona)
class Cliente extends Persona {
    private String historialReservas;

    public Cliente(String nombre, String identificacion, String direccion, String historialReservas) {
        super(nombre, identificacion, direccion);
        this.historialReservas = historialReservas;
    }

    public String obtenerHistorialReservas() {
        return historialReservas;
    }
}

// Clase Funcion
class Funcion {
    private String pelicula;
    private String horaInicio;
    private int sala;
    private double precioEntrada;

    public Funcion(String pelicula, String horaInicio, int sala, double precioEntrada) {
        this.pelicula = pelicula;
        this.horaInicio = horaInicio;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public String obtenerPelicula() {
        return pelicula;
    }

    public String obtenerHoraInicio() {
        return horaInicio;
    }

    public int obtenerSala() {
        return sala;
    }

    public double obtenerPrecioEntrada() {
        return precioEntrada;
    }
}

// Clase Asiento
class Asiento {
    private int fila;
    private int columna;
    private String estado; // "disponible", "reservado", "ocupado"

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.estado = "disponible";
    }

    public int obtenerFila() {
        return fila;
    }

    public int obtenerColumna() {
        return columna;
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

// Clase Sala
class Sala {
    private int numero;
    private int capacidad;
    private Asiento[][] listaAsientos;

    public Sala(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.listaAsientos = new Asiento[capacidad / 10][10]; // Ejemplo de distribución de asientos

        // Inicializar los asientos
        for (int i = 0; i < listaAsientos.length; i++) {
            for (int j = 0; j < listaAsientos[i].length; j++) {
                listaAsientos[i][j] = new Asiento(i, j);
            }
        }
    }

    public int obtenerNumero() {
        return numero;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int fila, int columna) {
        if (fila < listaAsientos.length && columna < listaAsientos[0].length) {
            return listaAsientos[fila][columna];
        }
        return null;
    }
}

// Clase Reserva
class Reserva {
    private Cliente cliente;
    private Funcion funcion;
    private Asiento[] listaAsientos;

    public Reserva(Cliente cliente, Funcion funcion, Asiento[] listaAsientos) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.listaAsientos = listaAsientos;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Funcion obtenerFuncion() {
        return funcion;
    }

    public Asiento[] obtenerListaAsientos() {
        return listaAsientos;
    }
}
