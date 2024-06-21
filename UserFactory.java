public class UserFactory {
    public Huesped createHuesped(String nombre, String apellido, String dni, String telefono, String email) {
        return new Huesped(nombre, apellido, dni, telefono, email);
    }
}
