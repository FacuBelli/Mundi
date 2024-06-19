public class Disponible implements HabitacionState {
    private Habitacion habitacion;

    public Disponible(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String estado() {
        return "Disponible";
    }

    @Override
    public void siguiente() {
        habitacion.setEstado(new Ocupado(habitacion));
    }
}
