package com.example.hotel.reserva.metodoDePago;

public class Efectivo extends MetodoDePago {
  @Override
  public Boolean validarMetodo() {
    return true;
  }
}
