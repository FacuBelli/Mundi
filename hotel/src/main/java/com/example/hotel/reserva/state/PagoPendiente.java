package com.example.hotel.reserva.state;

import com.example.hotel.reserva.Reserva;

public class PagoPendiente implements IReservaState {
  private Reserva reserva;

  public PagoPendiente(Reserva reserva) {
    this.reserva = reserva;
  }

  @Override
  public String estado() {
    return "Pago Pendiente";
  }

  @Override
  public void siguiente() {
    reserva.setEstado(new Confirmado(reserva));
  }
}
