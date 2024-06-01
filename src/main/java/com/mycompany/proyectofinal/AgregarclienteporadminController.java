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
public class AgregarclienteporadminController implements Initializable {


    @FXML
    private TextField recibir_DPI;
    @FXML
    private TextField recibir_nombre_cliente;
    @FXML
    private TextField recibir_apellido_cliente;
    @FXML
    private TextField recibir_direccion_cliente;
    @FXML
    private TextField recibir_telefono_cliente;
    @FXML
    private TextField recibir_contraseña_cliente;
    @FXML
    private Button agregar_cliente;
    @FXML
    private Button regresar_a_gestion_clientes_admin;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_agregar_cliente_por_admin(ActionEvent event) {
    }

    @FXML
    private void boton_regresar_a_gestion_clientes_admin(ActionEvent event) {
    }

}
