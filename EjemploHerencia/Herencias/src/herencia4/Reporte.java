package herencia4;

/**
 *
 * @author reroes
 */
public class Reporte {
   protected String codigo;
   
   public Reporte(String c){
       codigo = c;
   }
   
   public void establecerLista(String x) {
        codigo = x;
    }
   
   public String obtenerCodigo(){
       return codigo;
   }
   
}
