package com.example.hotel.habitacion.state;

import com.example.hotel.habitacion.Habitacion;

public class Disponible implements IHabitacionState {
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
