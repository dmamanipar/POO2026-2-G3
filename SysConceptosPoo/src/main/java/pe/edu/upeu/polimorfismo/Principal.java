package pe.edu.upeu.polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Animal l=new Loro();
        l.sonidoAnimal();

        l=new Perro();
        l.sonidoAnimal();
    }
}
