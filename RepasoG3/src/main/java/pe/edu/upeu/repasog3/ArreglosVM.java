package pe.edu.upeu.repasog3;

public class ArreglosVM {

    public static void meses(){
        String[] mes={"Enero", "Febrero", "Marzo", "Abril", "Mayo",
        "Junio", "Julio", "Agosto", "Setiembre",
                "Octubre", "Noviembre", "Diciembre"};

        System.out.println("Tamaño:"+mes.length);
        for (String m:mes){
            System.out.println(m);
        }


    }


    public static void main(String[] args) {
        meses();
    }
}
