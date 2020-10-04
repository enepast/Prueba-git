/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import java.util.ArrayList;
import autores.modelos.Alumno;
import autores.modelos.Profesor;
import grupos.modelos.Grupo;
import idiomas.modelos.Idioma;
import java.util.List;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

public class ControladorPrincipal {
    public static void main(String[] args) {
        
        ArrayList<Alumno> allAlumnos = new ArrayList<>();
        
        for(int i=0; i<5; i++){
            allAlumnos.add(new Alumno());
        }
        allAlumnos.get(0).asignarNombres("Dario");
        allAlumnos.get(1).asignarNombres("Juan");
        allAlumnos.get(2).asignarNombres("Emilio");
        allAlumnos.get(3).asignarNombres("Carlos");
        allAlumnos.get(4).asignarNombres("Pedro");
        
        for(int x=0; x<allAlumnos.size();x++)
        {
            allAlumnos.get(x).mostrar();
        }
        
        //allAlumnos.stream().forEach(alumno -> alumno.mostrar());
        
        
        
        
    }
    
}