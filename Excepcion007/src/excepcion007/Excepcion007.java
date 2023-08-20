package excepcion007;

public class Excepcion007 {

    public static void main(String[] args) {

        /*
        Dado el método metodoB de la clase B, indique:
        
        a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
        b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        
        class B {
        
            public void metodoB() {
        
                sentencia_b1
        
                try {
                    sentencia_b2
                } catch (MioException e){
                    sentencia_b3
                }
                finally
        
                sentencia_b4
            }
        }
        
        A)- Se ejecutan b1, b3 y b4
        B)- Se ejecutan b1, b2 y b4
        
        
         */
        Integer num = 10;

        try {
            System.out.println(num / 0); // b3 para a excepcion
            // System.out.println(num / 1); b3 normal
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir por 0");
        } finally {
        }

        System.out.println("FIN");

    }

}
