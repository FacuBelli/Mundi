package com.example.hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.hotel.habitacion.Habitacion;
import com.example.hotel.habitacion.tipo.Suite;
import com.example.hotel.reserva.Reserva;
import com.example.hotel.usuario.Huesped;

import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FacadeHoteleriaTest {
  private FacadeHoteleria facade;

  @BeforeEach
  public void setUp() {
    facade = new FacadeHoteleria();
  }

  @Test
  public void testRegistrarHuesped() {
    Huesped huesped = facade.registrarHuesped("Juan", "Perez", "12345678", "555-1234", "juan.perez@example.com");
    assertNotNull(huesped);
    assertEquals("Juan", huesped.getNombre());
    assertEquals("Perez", huesped.getApellido());
  }

  @Test
  public void testCargarHabitacion() {
    Habitacion habitacion = facade.cargarHabitacion(1, new Suite(), 2, 150.0, true, "Habitación con vista al mar");
    assertNotNull(habitacion);
    assertEquals(1, habitacion.getIdentificador());
    assertEquals(Suite.class, habitacion.getTipo().getClass());
  }

  @Test
  public void testBuscarHabitacion() {
    facade.cargarHabitacion(1, new Suite(), 2, 150.0, true, "Habitación con vista al mar");
    List<Habitacion> habitaciones = facade.buscarHabitacion(new Suite(), 2);
    assertEquals(1, habitaciones.size());
    assertEquals(Suite.class, habitaciones.get(0).getTipo().getClass());
  }

  @Test
  public void testCrearReserva() {
    Huesped huesped = facade.registrarHuesped("Juan", "Perez", "12345678", "555-1234", "juan.perez@example.com");
    Habitacion habitacion = facade.cargarHabitacion(1, new Suite(), 2, 150.0, true, "Habitación con vista al mar");
    Reserva reserva = facade.crearReserva(1, huesped, habitacion, new Date(), new Date(), 300.0);
    assertNotNull(reserva);
    assertEquals(1, reserva.getId());
    assertEquals(huesped, reserva.getHuesped());
    assertEquals(habitacion, reserva.getHabitacion());
  }
}
