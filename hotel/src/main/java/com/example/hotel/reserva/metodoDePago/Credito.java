package com.example.hotel.reserva.metodoDePago;

public class Credito extends MetodoDePago {
  @Override
  public Boolean validarMetodo() {
    return true;
  }
}
