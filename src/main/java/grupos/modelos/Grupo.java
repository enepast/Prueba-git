/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

/**
 *
 * @author Chuba
 */
public class Grupo {
    
    private String nombre;
    private String descripcion;

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String verNombre() {
        return nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }
    
    public void mostrar(){
        System.out.println("nombre = " + nombre);
        System.out.println("descripcion = " + descripcion);
    }
    
}
