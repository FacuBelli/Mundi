package com.example.hotel;


import com.example.hotel.usuario.Huesped;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField nombreField;
    @FXML
    private TextField apellidoField;
    @FXML
    private TextField dniField;
    @FXML
    private TextField telefonoField;
    @FXML
    private TextField emailField;

    private HuespedService huespedService = new HuespedService();

    @FXML
    private void handleCargarCliente(ActionEvent event) {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String dni = dniField.getText();
        String telefono = telefonoField.getText();
        String email = emailField.getText();

        Huesped huesped = new Huesped(nombre, apellido, dni, telefono, email);
        huespedService.cargarHuesped(huesped);

        // Limpia los campos después de cargar el cliente
        nombreField.clear();
        apellidoField.clear();
        dniField.clear();
        telefonoField.clear();
        emailField.clear();
    }

    // Otros manejadores de eventos...
}
