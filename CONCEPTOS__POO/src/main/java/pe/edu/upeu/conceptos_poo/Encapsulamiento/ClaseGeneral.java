package pe.edu.upeu.conceptos_poo.Encapsulamiento;

public class ClaseGeneral{
    public void probar(){
        Persona p =new Persona();
        p.setNombre("Juan");
        p.setEdad(12);
        p.saludo();
    }
    public static void main(String[] args) {
        ClaseGeneral cg =new ClaseGeneral();
        cg.probar();

        Persona persona= new Persona();
        persona.setNombre("Josue");
        persona.setEdad(18);
        persona.saludo();
        System.out.println("Nombre: "+persona.getNombre()+" Edad: "+persona.getEdad());
    }
}
