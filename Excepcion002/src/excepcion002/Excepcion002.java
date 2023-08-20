package excepcion002;

import Entities.Persona;

public class Excepcion002 {

    public static void main(String[] args) {

        Integer[] aux = {8, 12, 15};
        Persona p = new Persona(aux);

        try {
            System.out.println(p.getHijos()[3]);
        } catch (Exception e) {
            System.out.println("Fuera de rango");
        }
    }

}
