package com.example.hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.hotel.habitacion.Habitacion;
import com.example.hotel.habitacion.HabitacionBuilder;
import com.example.hotel.habitacion.tipo.IHabitacionTipo;
import com.example.hotel.reserva.Reserva;
import com.example.hotel.reserva.ReservaBuilder;
import com.example.hotel.usuario.Huesped;
import com.example.hotel.usuario.UserFactory;

public class FacadeHoteleria {
  private UserFactory userFactory;
  private HabitacionBuilder habitacionBuilder;
  private ReservaBuilder reservaBuilder;
  private List<Huesped> huespedes;
  private List<Habitacion> habitaciones;
  private List<Reserva> reservas;

  public FacadeHoteleria() {
    this.userFactory = new UserFactory();
    this.habitacionBuilder = new HabitacionBuilder();
    this.reservaBuilder = new ReservaBuilder();
    this.huespedes = new ArrayList<>();
    this.habitaciones = new ArrayList<>();
    this.reservas = new ArrayList<>();
  }

  public Huesped registrarHuesped(String nombre, String apellido, String dni, String telefono, String email) {
    Huesped huesped = userFactory.createHuesped(nombre, apellido, dni, telefono, email);
    huespedes.add(huesped);
    return huesped;
  }

  public Habitacion cargarHabitacion(int identificador, IHabitacionTipo tipo, int capacidad, double tarifa,
      boolean balcon,
      String descripcion) {
    Habitacion habitacion = habitacionBuilder.clear()
        .identificador(identificador)
        .tipo(tipo)
        .capacidad(capacidad)
        .tarifa(tarifa)
        .balcon(balcon)
        .descripcion(descripcion)
        .build();
    habitaciones.add(habitacion);
    return habitacion;
  }

  public List<Habitacion> buscarHabitacion(IHabitacionTipo tipo, int capacidad) {
    List<Habitacion> result = new ArrayList<>();
    for (Habitacion habitacion : habitaciones) {
      if (habitacion.getTipo().equals(tipo) && habitacion.getCapacidad() == capacidad) {
        result.add(habitacion);
      }
    }
    return result;
  }

  public Reserva crearReserva(int id, Huesped huesped, Habitacion habitacion, Date fechaInicio, Date fechaFin,
      double costoTotal) {
    Reserva reserva = reservaBuilder.clear()
        .id(id)
        .huesped(huesped)
        .habitacion(habitacion)
        .fechaInicio(fechaInicio)
        .fechaFin(fechaFin)
        .costoTotal(costoTotal)
        .build();
    reservas.add(reserva);
    return reserva;
  }

  
}
