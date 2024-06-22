package com.example.hotel.reserva.state;

import com.example.hotel.reserva.Reserva;

public class Confirmado implements IReservaState {
  private Reserva reserva;

  public Confirmado(Reserva reserva) {
    this.reserva = reserva;
  }

  @Override
  public String estado() {
    return "Confirmado";
  }

  @Override
  public void siguiente() {
    reserva.setEstado(new Finalizado(reserva));
  }
}
