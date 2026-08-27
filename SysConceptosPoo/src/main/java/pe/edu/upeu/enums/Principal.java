package pe.edu.upeu.enums;




public class Principal {

    enum GENERO{Masculino, Femenino}

    public static void main(String[] args) {
        System.out.println(GENERO.Femenino);
        for (GENERO a:GENERO.values()){
            System.out.println(a);
        }
        for (Mes m: Mes.values()){
            System.out.println(m);
        }

        for (Estado e:Estado.values()){
            System.out.println(e.getDescripcion()+"\t"+e.name());
        }
        System.out.println("");
        for (DiasSemana x:DiasSemana.values()){
            System.out.println(x.getNombreDias());
        }


    }
}
