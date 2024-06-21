public class HabitacionBuilder {
    private int identificador;
    private String tipo;
    private int capacidad;
    private double tarifa;
    private boolean balcon;
    private String descripcion;

    public HabitacionBuilder clear() {
        this.identificador = 0;
        this.tipo = null;
        this.capacidad = 0;
        this.tarifa = 0.0;
        this.balcon = false;
        this.descripcion = null;
        return this;
    }

    public HabitacionBuilder identificador(int identificador) {
        this.identificador = identificador;
        return this;
    }

    public HabitacionBuilder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public HabitacionBuilder capacidad(int capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    public HabitacionBuilder tarifa(double tarifa) {
        this.tarifa = tarifa;
        return this;
    }

    public HabitacionBuilder balcon(boolean balcon) {
        this.balcon = balcon;
        return this;
    }

    public HabitacionBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Habitacion build() {
        return new Habitacion(identificador, tipo, capacidad, tarifa, balcon, descripcion);
    }
}
