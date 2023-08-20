package excepcion004;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion004 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese número 1");
        String num1 = leer.next();
        System.out.println("Ingrese número ");
        String num2 = leer.next();

        try {
            Integer num01 = Integer.parseInt(num1);
            Integer num02 = Integer.parseInt(num2);

            Integer res = num01 / num02;

            System.out.println(num1 + " dividido " + num2 + " es " + res);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        } catch (InputMismatchException e) {
            System.out.println("Dato de entrada incorrecto");
        } catch (NumberFormatException e){
            System.out.println("No se puede convertir a tipo de dato Integer");
        }

    }

}
