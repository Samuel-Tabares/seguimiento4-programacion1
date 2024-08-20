package ejercicio3;

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
    private String historialCompras;

    public Cliente(String nombre, String identificacion, String direccion, String historialCompras) {
        super(nombre, identificacion, direccion);
        this.historialCompras = historialCompras;
    }

    public String obtenerHistorialCompras() {
        return historialCompras;
    }
}

// Clase Asiento
class Asiento {
    private int numero;
    private String estado; // "disponible", "reservado", "ocupado"

    public Asiento(int numero) {
        this.numero = numero;
        this.estado = "disponible";
    }

    public int obtenerNumero() {
        return numero;
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

// Clase Vagón
class Vagon {
    private String tipo; // Ejemplo: "clase económica", "clase turista"
    private int capacidad;
    private Asiento[] listaAsientos;

    public Vagon(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.listaAsientos = new Asiento[capacidad];

        // Inicializar los asientos
        for (int i = 0; i < capacidad; i++) {
            listaAsientos[i] = new Asiento(i + 1);
        }
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public Asiento obtenerAsiento(int numero) {
        if (numero <= capacidad) {
            return listaAsientos[numero - 1];
        }
        return null;
    }
}

// Clase Tren
class Tren {
    private String numero;
    private String ruta;
    private Vagon[] listaVagones;

    public Tren(String numero, String ruta, Vagon[] listaVagones) {
        this.numero = numero;
        this.ruta = ruta;
        this.listaVagones = listaVagones;
    }

    public String obtenerNumero() {
        return numero;
    }

    public String obtenerRuta() {
        return ruta;
    }

    public Vagon obtenerVagon(String tipo) {
        for (Vagon vagon : listaVagones) {
            if (vagon.obtenerTipo().equals(tipo)) {
                return vagon;
            }
        }
        return null;
    }
}

// Clase Viaje
class Viaje {
    private String fecha;
    private String horaSalida;
    private String horaLlegada;
    private Tren tren;

    public Viaje(String fecha, String horaSalida, String horaLlegada, Tren tren) {
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.tren = tren;
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

    public Tren obtenerTren() {
        return tren;
    }
}

// Clase Boleto
class Boleto {
    private Cliente cliente;
    private Viaje viaje;
    private Asiento asiento;

    public Boleto(Cliente cliente, Viaje viaje, Asiento asiento) {
        this.cliente = cliente;
        this.viaje = viaje;
        this.asiento = asiento;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Viaje obtenerViaje() {
        return viaje;
    }

    public Asiento obtenerAsiento() {
        return asiento;
    }
}