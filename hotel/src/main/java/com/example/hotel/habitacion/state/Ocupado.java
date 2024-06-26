package com.example.hotel.habitacion.state;

import com.example.hotel.habitacion.Habitacion;

public class Ocupado implements IHabitacionState {
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
