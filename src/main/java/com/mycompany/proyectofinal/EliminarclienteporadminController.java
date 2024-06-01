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
public class EliminarclienteporadminController implements Initializable {


    @FXML
    private Button eliminar_datos_clientes;
    @FXML
    private Button regresar_gestion_clientes;
    @FXML
    private Button buscar_cliente_eliminar;
    @FXML
    private TextField obtener_datos_cliente_eliminar;
    @FXML
    private RadioButton buscar_cliente_por_nombre_eliminar;
    @FXML
    private RadioButton buscar_cliente_por_DPI_eliminar;
    @FXML
    private TableView<?> mostrar_clientes_eliminar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_eliminar_datos_clientes(ActionEvent event) {
    }

    @FXML
    private void boton_regresar_gestion_clientes(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_cliente_eliminar(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_cliente_por_nombre_eliminar(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_cliente_por_DPI_eliminar(ActionEvent event) {
    }

}
