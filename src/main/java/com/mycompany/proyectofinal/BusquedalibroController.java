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
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author usuario
 */
public class BusquedalibroController implements Initializable {


    @FXML
    private TextField obtener_datos_del_libro;
    @FXML
    private RadioButton buscar_por_titulo;
    @FXML
    private RadioButton buscar_por_autor;
    @FXML
    private RadioButton buscar_por_ISBN;
    @FXML
    private TableView<?> tabla_muestra_resultados;
    @FXML
    private Button prestar_libro;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_buscar_libro(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_por_titulo(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_por_autor(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_por_ISBN(ActionEvent event) {
    }

    
    @FXML
    private void boton_prestar_libro(ActionEvent event) {
    }

}
