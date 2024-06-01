/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author usuario
 */
public class UsuarioclienteController implements Initializable {


    @FXML
    private TextField obtenerusuariocliente;
    @FXML
    private TextField obtenercontraseñacliente;
    @FXML
    private Button iniciarsesioncliente;
    @FXML
    private TextField obtener_nombre_cliente;
    @FXML
    private TextField obtener_apellido_cliente;
    @FXML
    private TextField obtener_direccion_cliente;
    @FXML
    private TextField obtener_telefono_cliente;
    @FXML
    private TextField obtener_dpi_cliente;
    @FXML
    private Button registrar_nuevo_cliente;
    @FXML
    private TextField obtener_contraseña_creada_cliente;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void botoniniciosesioncliente(ActionEvent event) {
    }

    @FXML
    private void boton_registrar_nuevo_cliente(ActionEvent event) {
    }

}
