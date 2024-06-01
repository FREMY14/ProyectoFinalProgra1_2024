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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author usuario
 */
public class GestionprestamoydevolucionController implements Initializable {


    @FXML
    private TextField obtener_dias_prestamo;
    @FXML
    private TextField obtener_precio_multa_prestamo;
    @FXML
    private TableView<?> mostrar_datos_clientes_estado;
    @FXML
    private TextField obtener_dpi_cliente;
    @FXML
    private Button buscar_dpi_cliente_prestamo;
    @FXML
    private Button confirmar_dias_prestamo;
    @FXML
    private Button confirmar_precio_multa;
    @FXML
    private Button regresar_a_gestion_admin;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_buscar_dpi_cliente_prestamo(ActionEvent event) {
    }

    @FXML
    private void boton_confirmar_dias_prestamo(ActionEvent event) {
    }

    @FXML
    private void confirmar_precio_multa(ActionEvent event) {
    }

    @FXML
    private void boton_regresar_a_gestion_admin(ActionEvent event) {
    }

}
