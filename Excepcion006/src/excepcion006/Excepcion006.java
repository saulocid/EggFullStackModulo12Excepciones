package excepcion006;

public class Excepcion006 {

    public static void main(String[] args) {
        
        /*
        Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        
class A {
        
    public void metodoA() {
        
        sentencia_a1
        sentencia_a2
        
        try {
            sentencia_a3
            sentencia_a4
        } catch (MioException e){
            sentencia_a6
        }
        
        sentencia_a5
    }
} 
        
        A)- Se ejecutan a1, a2, a6 y a5
        B)- Se ejecutan a1, a2, a3, a4 y a5
        
        */
        
        Integer num1 = 5;
        Integer num2 = 2;
        
        try {
            System.out.println((double)num1/num2); // sentencia a3 Válida
            //System.out.println(num1/0); // sentencia a3 con Excepción
            System.out.println(num1*num2);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }
        
        System.out.println("FIN");

    }

}
