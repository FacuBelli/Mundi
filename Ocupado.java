public class Ocupado implements HabitacionState {
    private Habitacion habitacion;

    public Ocupado(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String estado() {
        return "Ocupado";
    }

    @Override
    public void siguiente() {
        habitacion.setEstado(new Mantenimiento(habitacion));
    }
}