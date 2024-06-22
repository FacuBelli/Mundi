package com.example.hotel.usuario;

import java.util.List;

public class Huesped extends User {
  private List<MetodoDePago> metodosDePago;
  private Boolean contactoSMS;
  private Boolean contactoWhatsApp;
  private Boolean contactoEmail;

  public Huesped(String dni, String nombre, String apellido, String telefono, String email) {
    super(dni, nombre, apellido, telefono, email);
  }  
}
