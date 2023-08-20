package excepcion005;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Excepcion005 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random ran = new Random();
        System.out.println("Adivine un número del 1 al 500");

        Integer adivinar = ran.nextInt(500) + 1;
        Integer cont = 0;
        Integer opc = 0;

        do {
            System.out.println("Ingrese un número para adivinar");
            try {
                cont++;
                opc = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Dato de entrada incorrecto");
                leer.next();
            } catch (Exception e){
                System.out.println("Error de sistema");
                leer.next();
            }

            System.out.println("Lleva " + cont + " intentos");

            if (!Objects.equals(adivinar, opc)) {
                System.out.println("Aún no adivinaste");
                if (opc < adivinar) {
                    System.out.println("Es más alto");
                } else {
                    System.out.println("Es más chico");
                }
            } else {
                System.out.println("Adivinaste!!!");
            }
        } while (!Objects.equals(adivinar, opc));

    }

}
