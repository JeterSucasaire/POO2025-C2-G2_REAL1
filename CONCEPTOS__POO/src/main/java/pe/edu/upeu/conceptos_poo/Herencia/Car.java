package pe.edu.upeu.conceptos_poo.Herencia;

public class Car extends Vehiculo{
    String modelo="Hylux";
    String color ="Blanco";

    void caracteristicas(){
        marca="Toyota";
        System.out.println("La marca del vehiculo es: "+marca);
        System.out.println("El modelo del vehiculo es: "+modelo);
        System.out.println("El color del vehiculo es: "+color);
        System.out.println("Y emite el sonido "+sonido());
    }


    public static void main(String[] args) {
        Car carro =new Car();
        carro.caracteristicas();

    }
}
