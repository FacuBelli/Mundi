package com.example.hotel.reserva;

import java.util.Date;

import com.example.hotel.habitacion.Habitacion;
import com.example.hotel.usuario.Huesped;

public class ReservaBuilder {
  private int id;
  private Huesped huesped;
  private Habitacion habitacion;
  private Date fechaInicio;
  private Date fechaFin;
  private double costoTotal;

  public ReservaBuilder clear() {
    this.id = 0;
    this.huesped = null;
    this.habitacion = null;
    this.fechaInicio = null;
    this.fechaFin = null;
    this.costoTotal = 0.0;
    return this;
  }

  public ReservaBuilder id(int id) {
    this.id = id;
    return this;
  }

  public ReservaBuilder huesped(Huesped huesped) {
    this.huesped = huesped;
    return this;
  }

  public ReservaBuilder habitacion(Habitacion habitacion) {
    this.habitacion = habitacion;
    return this;
  }

  public ReservaBuilder fechaInicio(Date fechaInicio) {
    this.fechaInicio = fechaInicio;
    return this;
  }

  public ReservaBuilder fechaFin(Date fechaFin) {
    this.fechaFin = fechaFin;
    return this;
  }

  public ReservaBuilder costoTotal(double costoTotal) {
    this.costoTotal = costoTotal;
    return this;
  }

  public Reserva build() {
    return new Reserva(huesped, habitacion, fechaInicio, fechaFin, null, costoTotal); // Aca cambie costoTotal por IReservaState a ver que pasaba
  }
}
