package autores.modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Chuba
 */
public class Profesor {
    
     //Atributos
    int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private String cargo;
    
    

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

    public void asignarCargo(String cargo) {
        this.cargo = cargo;
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

    public String verCargo() {
        return cargo;
    }
    
    public void mostrar(){
        System.out.println("nombres = " + nombres);
        System.out.println("apellidos = " + apellidos);
        System.out.println("dni = " + dni);
        System.out.println("cargo = " + cargo);
        System.out.println("clave = " + clave);
    }
    
    
}
