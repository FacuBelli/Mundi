package com.example.hotel.reserva.state;

import com.example.hotel.reserva.Reserva;

public class Finalizado implements IReservaState {
  private Reserva reserva;

  public Finalizado(Reserva reserva) {
    this.reserva = reserva;
  }

  @Override
  public String estado() {
    return "Finalizado";
  }

  @Override
  public void siguiente() {
    reserva.setEstado(new Cancelado(reserva));
  }
}
