package pe.edu.upeu.conceptos_poo.Encapsulamiento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonaX {
    private String nombre;
    private int edad;

    public void saludar(){
        System.out.println("Hola soy"+ nombre+" y mi edad es "+edad);
    }
}
