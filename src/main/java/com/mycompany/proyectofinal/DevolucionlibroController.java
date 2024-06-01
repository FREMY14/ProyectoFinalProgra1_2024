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
import javafx.scene.layout.AnchorPane;
/**
 * FXML Controller class
 *
 * @author usuario
 */
public class DevolucionlibroController implements Initializable {


    @FXML
    private AnchorPane fecha_devolucion;
    @FXML
    private TableView<?> tabla_muestra_libros_prestados;
    @FXML
    private Button devolucion_libro;
    @FXML
    private Button cancelar_devolucion_libro;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void registra_fecha_devolucion_libro(ActionEvent event) {
    }

    @FXML
    private void boton_confirma_devolucion_libro(ActionEvent event) {
    }

    @FXML
    private void boton_cancelar_devolucion_libro(ActionEvent event) {
    }

}
