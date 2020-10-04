/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author Chuba
 */
public class Alumno {
    
    //Atributos
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private String cx;

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }

    public int verDni() {
        return dni;
    }

    public String verApellidos() {
        return apellidos;
    }

    public String verNombres() {
        return nombres;
    }

    public String verClave() {
        return clave;
    }

    public String verCx() {
        return cx;
    }
    
    public void mostrar(){
        System.out.println("nombres = " + nombres);
        System.out.println("apellidos = " + apellidos);
        System.out.println("dni = " + dni);
        System.out.println("cx = " + cx);
        System.out.println("clave = " + clave);
    }
    
    
    
}
