package pe.edu.upeu.asistencia.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

@Controller
public class AsistenciaController {

    @FXML
    private Label idMsg;

    @FXML
    TextField txtDat;
    //@FXMLButton btnEnviar;
    @FXML
    void enviar(){
        System.out.println("Enviando Asistencia");
        idMsg.setText(txtDat.getText());
    }

}
