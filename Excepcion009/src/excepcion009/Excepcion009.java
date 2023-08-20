package excepcion009;

public class Excepcion009 {

    public static void main(String[] args) {

        /*
        
        Dado el método metodoC de la clase C, indique:
        
        a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
        b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
        
        class C {
            void metodoC() throws TuException{
        
                sentencia_c1
        
                try {
                    sentencia_c2
                    sentencia_c3
                } catch (MioException e){
                    sentencia_c4
                } catch (TuException e){
                    sentencia_c5
                    throw (e)
                }
                finally
                    sentencia_c6
            }
        }
        
        A)- c1, c4, c6
        B)- c1, c2, c3, c6
        C)- c1, c5, c6
        
         */
    }

}
