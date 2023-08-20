package excepcion003;

import Entities.DivisionNumero;
import java.util.Scanner;

public class Excepcion003 {

    public static void main(String[] args) {
        
        DivisionNumero dn = new DivisionNumero();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese número 1");
        dn.setNum1(leer.next()); 
        System.out.println("Ingrese número ");
        dn.setNum2(leer.next());
        
        try {
            Integer num1 = Integer.parseInt(dn.getNum1());
            Integer num2 = Integer.parseInt(dn.getNum2());
            
            Integer res = num1/num2;
            
            System.out.println(num1+" dividido "+num2+" es "+res);
        } catch (IllegalArgumentException e){
            System.out.println("No se puede convertir a número entero corto");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }

    }

}
