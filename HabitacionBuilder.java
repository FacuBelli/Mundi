import java.util.ArrayList;
import java.util.List;

public class HabitacionBuilder {
    private int identificador;
    private HabitacionTipo tipo;
    private int capacidad;
    private double tarifa;
    private boolean balcon;
    private String descripcion;
    private List<Extra> extras = new ArrayList<>();

    public HabitacionBuilder clear() {
        identificador = 0;
        tipo = null;
        capacidad = 0;
        tarifa = 0.0;
        balcon = false;
        descripcion = "";
        extras.clear();
        return this;
    }

    public HabitacionBuilder identificador(int identificador) {
        this.identificador = identificador;
        return this;
    }

    public HabitacionBuilder tipo(HabitacionTipo tipo) {
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

    public HabitacionBuilder addExtra(Extra extra) {
        this.extras.add(extra);
        return this;
    }

    public Habitacion build() {
        return new Habitacion(identificador, tipo, capacidad, tarifa, descripcion, extras);
    }
}
