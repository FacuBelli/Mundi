import java.util.List;

public class Habitacion {
    private int identificador;
    private HabitacionTipo tipo;
    private HabitacionState estado;
    private int capacidad;
    private double tarifa;
    private String descripcion;
    private List<Extra> extras;

    public Habitacion(int identificador, HabitacionTipo tipo, int capacidad, double tarifa, String descripcion, List<Extra> extras) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.tarifa = tarifa;
        this.descripcion = descripcion;
        this.extras = extras;
        this.estado = new Disponible(this); // Estado inicial
    }

    public void setEstado(HabitacionState estado) {
        this.estado = estado;
    }

    public HabitacionState getEstado() {
        return estado;
    }

    // Getters and setters for other fields as needed
}
