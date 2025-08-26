package pe.edu.upeu.asistencia.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.Modelo.Estudiante;
import pe.edu.upeu.asistencia.Servicio.EstudianteServicioY;

@Controller
public class AsistenciaController {
    @Autowired
    EstudianteServicioY estudianteServicioY;

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
    @FXML
    void regEstudiante(){
        Estudiante estudiante=new Estudiante();
        estudiante.setNombre(new SimpleStringProperty("Josue"));
        estudiante.setNombre();

        EstudianteServicioY.saveEntidad(Estudiante);
        ListarEstudiantes();
    }

}