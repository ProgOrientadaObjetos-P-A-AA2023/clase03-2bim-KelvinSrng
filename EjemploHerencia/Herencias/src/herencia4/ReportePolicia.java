/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    private double promedioEdades;
    private ArrayList<Policia> lista;

    public ReportePolicia(String miCodigo, ArrayList<Policia> milista){
        super(miCodigo);
        lista = milista;
    }
    
    public double obtenerPromedioEdades() {
        return promedioEdades;
    }
    
    public ArrayList<Policia> obtenerLista() {
        return lista;
    }
    
    public void calcularPromedioEdades() {
        double suma = 0;
        for(int i = 0; i < lista.size(); i++ ){
            suma = suma + lista.get(i).getEdad();
        }
        promedioEdades = suma / lista.size();
    }
    
    public void establecerLista(ArrayList<Policia> x) {
        lista = x;
    }
    
    
    public String toString(){
        String cadena = "Reporte Policia\n";
        cadena = String.format("%sCODIGO:%s\n", cadena, codigo);
        cadena = String.format("%sLista de Policias:\n", cadena);
        
        for ( int i = 0; i < obtenerLista().size(); i++){
            Policia d = obtenerLista().get(i);
            cadena = String.format("%sNombre: %s - Edad: %d - Rango: %s\n"
            ,cadena, d.getNombre(), d.getEdad(), d.getRango());
        }
        
        cadena = String.format("%sEl promedio de "
                + "edades es: %.0f\n", cadena, obtenerPromedioEdades());
        
        
        return cadena;
    }
}
