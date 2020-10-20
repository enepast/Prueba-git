package lugares.modelos;

import java.util.Objects;

public class Lugar 
{
    private String nombre;

    public Lugar(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lugar other = (Lugar) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {//Compara nombre de lugares
            return false;
        }
        return true;
    }

    public String toString() {
        return "Lugar: " + this.nombre;
    }
    
    public void Mostrar() {
        System.out.println(this.toString());
    }
}
