package pe.edu.upeu.herencia.modelo;

import pe.edu.upeu.herencia.modelo.submodel.Vehicle;

//Aplicando el concepto de Herencia y relación de generalizacion
public class Car extends Vehicle {
    public Car() {
        super.setMarca("Nisan");
    }

}
