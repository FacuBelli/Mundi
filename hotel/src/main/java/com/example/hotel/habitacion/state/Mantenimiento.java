package com.example.hotel.habitacion.state;

import com.example.hotel.habitacion.Habitacion;

public class Mantenimiento implements IHabitacionState {
  private Habitacion habitacion;

  public Mantenimiento(Habitacion habitacion) {
    this.habitacion = habitacion;
  }

  @Override
  public String estado() {
    return "Mantenimiento";
  }

  @Override
  public void siguiente() {
    habitacion.setEstado(new Disponible(habitacion));
  }
}
