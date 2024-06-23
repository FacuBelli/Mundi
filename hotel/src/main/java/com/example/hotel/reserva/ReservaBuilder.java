package com.example.hotel.reserva;

import java.util.Date;

import com.example.hotel.habitacion.Habitacion;
import com.example.hotel.usuario.Huesped;

public class ReservaBuilder {
  Reserva reserva;

  public ReservaBuilder clear() {
    this.reserva = new Reserva();
    return this;
  }

  public ReservaBuilder huesped(Huesped huesped) {
    reserva.setHuesped(huesped);
    return this;
  }

  public ReservaBuilder habitacion(Habitacion habitacion) {
    reserva.setHabitacion(habitacion);
    return this;
  }

  public ReservaBuilder fechaInicio(Date fechaInicio) {
    reserva.setFechaInicio(fechaInicio);
    return this;
  }

  public ReservaBuilder fechaFin(Date fechaFin) {
    reserva.setFechaFin(fechaFin);
    return this;
  }

  public Reserva build() {
<<<<<<< HEAD
    return new Reserva(huesped, habitacion, fechaInicio, fechaFin, null, costoTotal); // Aca cambie costoTotal por IReservaState a ver que pasaba
=======
    return reserva;
>>>>>>> 7131b73ef82cd144e47d50bbd3aa20f1e235621a
  }
}
