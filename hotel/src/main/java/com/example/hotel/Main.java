package com.example.hotel;

import java.util.List;
import java.util.Scanner;

import com.example.hotel.habitacion.Habitacion;
import com.example.hotel.habitacion.tipo.IHabitacionTipo;
import com.example.hotel.habitacion.tipo.Simple;
import com.example.hotel.habitacion.tipo.Suite;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FacadeHoteleria facade = new FacadeHoteleria();

    while (true) {
      System.out.println("1. Registrar Huesped");
      System.out.println("2. Cargar Habitacion");
      System.out.println("3. Buscar Habitacion");
      System.out.println("4. Salir");
      System.out.print("Seleccione una opción: ");
      int opcion = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (opcion) {
        case 1:
          System.out.print("Nombre: ");
          String nombre = scanner.nextLine();
          System.out.print("Apellido: ");
          String apellido = scanner.nextLine();
          System.out.print("DNI: ");
          String dni = scanner.nextLine();
          System.out.print("Teléfono: ");
          String telefono = scanner.nextLine();
          System.out.print("Email: ");
          String email = scanner.nextLine();
          facade.registrarHuesped(nombre, apellido, dni, telefono, email);
          System.out.println("Huesped registrado con éxito.");
          break;
        case 2:
          System.out.print("Identificador: ");
          int id = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Tipo: ");
          String tipo = scanner.nextLine();
          IHabitacionTipo tipoConcreto = tipo.toLowerCase() == "suite" ? new Suite()
              : tipo.toLowerCase() == "simple" ? new Simple() : null;
          System.out.print("Capacidad: ");
          int capacidad = scanner.nextInt();
          System.out.print("Tarifa: ");
          double tarifa = scanner.nextDouble();
          System.out.print("Balcon (true/false): ");
          boolean balcon = scanner.nextBoolean();
          scanner.nextLine();
          System.out.print("Descripción: ");
          String descripcion = scanner.nextLine();
          facade.cargarHabitacion(id, tipoConcreto, capacidad, tarifa, balcon, descripcion);
          System.out.println("Habitación cargada con éxito.");
          break;
        case 3:
          System.out.print("Tipo: ");
          String tipoBusqueda = scanner.nextLine();
          IHabitacionTipo tipoBusquedaConcreto = tipoBusqueda.toLowerCase() == "suite" ? new Suite()
              : tipoBusqueda.toLowerCase() == "simple" ? new Simple() : null;
          System.out.print("Capacidad: ");
          int capacidadBusqueda = scanner.nextInt();
          List<Habitacion> habitaciones = facade.buscarHabitacion(tipoBusquedaConcreto, capacidadBusqueda);
          System.out.println("Habitaciones encontradas:");
          for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion.getIdentificador() + " - " + habitacion.getTipo() + " - "
                + habitacion.getCapacidad() + " personas");
          }
          break;
        case 4:
          System.out.println("Saliendo...");
          scanner.close();
          return;
        default:
          System.out.println("Opción no válida.");
      }
    }
  }
}
