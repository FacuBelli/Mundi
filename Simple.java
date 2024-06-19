public class Simple implements HabitacionTipo {
    private final String nombre = "Simple";

    @Override
    public String getNombre() {
        return nombre;
    }
}
