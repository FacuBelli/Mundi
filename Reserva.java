import java.util.Date;

public class Reserva {
    private int id;
    private Huesped huesped;
    private Habitacion habitacion;
    private Date fechaInicio;
    private Date fechaFin;
    private double costoTotal;

    public Reserva(int id, Huesped huesped, Habitacion habitacion, Date fechaInicio, Date fechaFin, double costoTotal) {
        this.id = id;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoTotal = costoTotal;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    // Métodos adicionales
}
