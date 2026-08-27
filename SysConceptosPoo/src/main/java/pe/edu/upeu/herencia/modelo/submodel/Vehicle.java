package pe.edu.upeu.herencia.modelo.submodel;


import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public  class Vehicle{
    private String marca="Ford";

    public void sonido(){
        System.out.println("Tuut, tuut!");
    }
}
