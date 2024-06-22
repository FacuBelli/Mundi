package com.example.hotel.habitacion;

import com.example.hotel.habitacion.tipo.IHabitacionTipo;

public class HabitacionBuilder {
  Habitacion habitacion;

  HabitacionBuilder() {
    habitacion = new Habitacion();
  }

  public HabitacionBuilder clear() {
    habitacion = new Habitacion();
    return this;
  }

  public HabitacionBuilder identificador(int identificador) {
    habitacion.setIdentificador(identificador);
    return this;
  }

  public HabitacionBuilder tipo(IHabitacionTipo tipo) {
    habitacion.setTipo(tipo);
    return this;
  }

  public HabitacionBuilder capacidad(int capacidad) {
    habitacion.setCapacidad(capacidad);
    return this;
  }

  public HabitacionBuilder tarifa(double tarifa) {
    habitacion.setTarifa(tarifa);
    return this;
  }

  public HabitacionBuilder balcon(boolean balcon) {
    habitacion.setBalcon(balcon);
    return this;
  }

  public HabitacionBuilder descripcion(String descripcion) {
    habitacion.setDescripcion(descripcion);
    return this;
  }

  public Habitacion build() {
    return habitacion;
  }
}
