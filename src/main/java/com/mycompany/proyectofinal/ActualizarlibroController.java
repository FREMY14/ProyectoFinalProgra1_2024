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
public class ActualizarlibroController implements Initializable {


    @FXML
    private Button buscar_libros_para_actualizar;
    @FXML
    private TextField obtener_busqueda_libro;
    @FXML
    private RadioButton buscar_por_titulo_actualizar;
    @FXML
    private RadioButton buscar_por_autor_actualizar;
    @FXML
    private RadioButton buscar_por_ISBN_actualizar;
    @FXML
    private TableView<?> tabla_muestra_resultados;
    @FXML
    private Button actualizar_datos_libros;
    @FXML
    private TextField obtener_ISBN_actualizar;
    @FXML
    private TextField obtener_cantidad_disponible_actualizar;
    @FXML
    private TextField obtener_editorial_actualizar;
    @FXML
    private TextField obtener_año_publicacion_actualizar;
    @FXML
    private TextField obtener_autor_actualizar;
    @FXML
    private TextField obtener_libro_actualizar;
    @FXML
    private Button regresar_gestion_libros;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_buscar_libros_para_actualizar(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_por_titulo_actualizar(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_por_autor_actualizar(ActionEvent event) {
    }

    @FXML
    private void boton_buscar_por_ISBN_actualizar(ActionEvent event) {
    }

    @FXML
    private void boton_actualizar_datos_libros(ActionEvent event) {
    }

    @FXML
    private void boton_regresar_gestion_libros(ActionEvent event) {
    }

}
