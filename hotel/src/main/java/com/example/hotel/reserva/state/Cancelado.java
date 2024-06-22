package com.example.hotel.reserva.state;

import com.example.hotel.reserva.Reserva;

public class Cancelado implements IReservaState {
  private Reserva reserva;

  public Cancelado(Reserva reserva) {
    this.reserva = reserva;
  }

  @Override
  public String estado() {
    return "Cancelado";
  }

  @Override
  public void siguiente() {
    reserva.setEstado(new Pendiente(reserva));
  }
}
