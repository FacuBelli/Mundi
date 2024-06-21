public class Habitacion {
    private int identificador;
    private String tipo;
    private int capacidad;
    private double tarifa;
    private boolean balcon;
    private String descripcion;

    public Habitacion(int identificador, String tipo, int capacidad, double tarifa, boolean balcon, String descripcion) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.tarifa = tarifa;
        this.balcon = balcon;
        this.descripcion = descripcion;
    }

    // Getters
    public int getIdentificador() {
        return identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
