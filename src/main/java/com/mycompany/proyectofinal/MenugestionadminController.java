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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
/**
 * FXML Controller class
 *
 * @author usuario
 */
public class MenugestionadminController implements Initializable {


    @FXML
    private MenuButton menu_grstion_admin;
    @FXML
    private MenuItem gestionar_cliente;
    @FXML
    private MenuItem gestionar_libro;
    @FXML
    private MenuItem historial_transacciones_clientes;
    @FXML
    private MenuItem gestion_prestamos_devoluciones;
    @FXML
    private Button salir_al_login_admin;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void boton_gestionar_cliente(ActionEvent event) {
    }

    @FXML
    private void boton_gestionar_libro(ActionEvent event) {
    }

    @FXML
    private void boton_historial_transaccion_clientes(ActionEvent event) {
    }

    @FXML
    private void boton_gestion_prestamos_devoluciones(ActionEvent event) {
    }

    @FXML
    private void boton_menu_gestion_admin(ActionEvent event) {
    }

    @FXML
    private void boton_salir_al_login_admin(ActionEvent event) {
    }

}
