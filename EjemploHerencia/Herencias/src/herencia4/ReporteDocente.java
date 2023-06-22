package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    private double promedioSueldos;
    private ArrayList<Docente> lista;
    
    public ReporteDocente(String miCodigo, ArrayList<Docente> milista){
        super(miCodigo);
        lista = milista;
    }

    
    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }
    
    public ArrayList<Docente> obtenerLista() {
        return lista;
    }
    
    public void calcularPromedioSueldos() {
        double suma = 0;
        for(int i = 0; i < lista.size(); i++ ){
            suma = suma + lista.get(i).getSueldo();
        }
        promedioSueldos = suma / lista.size();
    }
    
    public void establecerLista(ArrayList<Docente> x) {
        lista = x;
    }
    
    public String toString(){
        String cadena = "Reporte Docente\n";
        cadena = String.format("%sCODIGO:%s\n", cadena, codigo);
        cadena = String.format("%sLista de Docente:\n", cadena);
        
        for ( int i = 0; i < obtenerLista().size(); i++){
            Docente d = obtenerLista().get(i);
            cadena = String.format("%sNombre: %s - Sueldo: %.1f\n"
            ,cadena, d.getNombre(), d.getSueldo());
        }
        
        cadena = String.format("%sEl promedio de "
                + "sueldos es: %.3f\n", cadena, obtenerPromedioSueldos());
        
        
        return cadena;
    }
}
