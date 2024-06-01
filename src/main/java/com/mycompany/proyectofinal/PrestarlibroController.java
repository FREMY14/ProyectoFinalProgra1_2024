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
import javafx.scene.control.DatePicker;
/**
 * FXML Controller class
 *
 * @author usuario
 */
public class PrestarlibroController implements Initializable {


    @FXML
    private DatePicker registro_fecha_prestamo_libro;
    @FXML
    private Button confirmar_prestamo_libro;
    @FXML
    private Button cancelar_prestamo_libro;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_registro_fecha_prestamo_libro(ActionEvent event) {
    }

    @FXML
    private void boton_confirmar_prestamo(ActionEvent event) {
    }

    @FXML
    private void boton_cancelar_prestamo_libro(ActionEvent event) {
    }

}
