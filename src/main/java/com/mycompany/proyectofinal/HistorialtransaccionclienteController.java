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
/**
 * FXML Controller class
 *
 * @author usuario
 */
public class HistorialtransaccionclienteController implements Initializable {


    @FXML
    private TableView<?> tabla_muestra_historial_transaccion;
    @FXML
    private Button regresar_al_menu_transaccion;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_regresar_al_menu_transaccion(ActionEvent event) {
    }

}
