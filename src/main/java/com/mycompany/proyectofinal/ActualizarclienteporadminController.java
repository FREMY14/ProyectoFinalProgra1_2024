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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author usuario
 */
public class ActualizarclienteporadminController implements Initializable {


    @FXML
    private Button buscar_cliente_actualizar;
    @FXML
    private TextField obtener_datos_cliente_actualizar;
    @FXML
    private RadioButton buscar_cliente_por_nombre_actualizar;
    @FXML
    private RadioButton buscar_cliente_por_DPI_actualizar;
    @FXML
    private TableView<?> mostrar_clientes_actualizar;
    @FXML
    private Button actualizar_datos_cliente;
    @FXML
    private Button regresar_gestion_clientes_admin;
    @FXML
    private TextField obtener_DPI_actualizar;
    @FXML
    private TextField obtener_nombre_actualizar;
    @FXML
    private TextField obtener_apellido_actualizar;
    @FXML
    private TextField obtener_direccion_actualizar;
    @FXML
    private TextField obtener_telefono_actualizar;
    @FXML
    private TextField obtener_contraseña_actualizar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_buscar_cliente_actualizar(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_cliente_por_nombre_actualizar(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_cliente_por_DPI_actualizar(ActionEvent event) {
    }

    @FXML
    private void boton_actualizar_datos_cliente(ActionEvent event) {
    }

    @FXML
    private void boton_regresar_gestion_clientes_admin(ActionEvent event) {
    }

}
