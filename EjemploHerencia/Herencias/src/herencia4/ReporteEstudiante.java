/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String miCodigo, ArrayList<Estudiante> milista){
        super(miCodigo);
        lista = milista;
    }

    
    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }
    
    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }
    
    public void calcularPromedioMatriculas() {
        double suma = 0;
        for(int i = 0; i < lista.size(); i++ ){
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma / lista.size();
    }
    
    public void establecerLista(ArrayList<Estudiante> x) {
        lista = x;
    }
    
    public String toString(){
        String cadena = "Reporte Estudiante\n";
        cadena = String.format("%sCODIGO:%s\n", cadena, codigo);
        cadena = String.format("%sLista de Estudiantes:\n", cadena);
        
        for ( int i = 0; i < obtenerLista().size(); i++){
            Estudiante d = obtenerLista().get(i);
            cadena = String.format("%sNombre: %s - Matricula: %.1f\n"
            ,cadena, d.getNombre(), d.getMatricula());
        }
        
        cadena = String.format("%sEl promedio de "
                + "matriculas es: %.3f\n", cadena, obtenerPromedioMatriculas());
        
        
        return cadena;
    }
}
