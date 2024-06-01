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
public class AgregarlibroController implements Initializable {


    @FXML
    private TextField recibir_ISBN;
    @FXML
    private TextField recibir_nombre_libro;
    @FXML
    private TextField recibir_autor;
    @FXML
    private TextField recibir_año_publicacion;
    @FXML
    private TextField recibir_editorial;
    @FXML
    private TextField recibir_cantidad_disponible;
    @FXML
    private Button agregar_libro;
    @FXML
    private Button regresar_a_gestion_libro;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_agregar_libro(ActionEvent event) {
    }

    @FXML
    private void boton_regresar_a_gestion_libro(ActionEvent event) {
    }

}
