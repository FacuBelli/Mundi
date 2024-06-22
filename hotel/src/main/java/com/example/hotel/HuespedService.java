package com.example.hotel;

import java.util.ArrayList;
import java.util.List;

import com.example.hotel.usuario.Huesped;

public class HuespedService {
    private List<Huesped> huespedes = new ArrayList<>();

    public void cargarHuesped(Huesped huesped) {
        huespedes.add(huesped);
        // Aquí podrías agregar lógica para persistir el cliente en una base de datos
    }

    // Otros métodos de servicio...
}
