package grupos.modelos;

import autores.modelos.Autor;
import java.util.ArrayList;
import java.util.Objects;

public class Grupo 
{
    private String nombre;
    private String descripcion;
    private ArrayList<MiembroEnGrupo> miembrosEnGrupo = new ArrayList<>();

    public Grupo(String nombre, String descripcion) 
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Grupo(String nombre, String descripcion, ArrayList<MiembroEnGrupo> miembrosEnGrupo) 
    {
        this(nombre, descripcion);
        this.miembrosEnGrupo = miembrosEnGrupo;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombre);
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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {//Compara nombres de grupos
            return false;
        }
        return true;
    }
        
    public void agregarMiembro (Autor autor, Rol rol) 
    {
        MiembroEnGrupo nuevoMiembro = new MiembroEnGrupo(autor, this, rol);
        if(!miembrosEnGrupo.contains(nuevoMiembro)){
            miembrosEnGrupo.add(nuevoMiembro);
            autor.agregarGrupo(this, rol);
        }
    }
    
    public void quitarMiembro (Autor miembro) 
    {
        MiembroEnGrupo borrarMiembro = new MiembroEnGrupo(miembro, this, null);
        if(miembrosEnGrupo.contains(borrarMiembro)){
            miembrosEnGrupo.remove(borrarMiembro);
        }
        miembro.quitarGrupo(this);
    }
    
    public void verMiembros () 
    {
        System.out.println("Miembros:");
        for (MiembroEnGrupo meg : miembrosEnGrupo) 
        {
            System.out.println(meg.getAutor().getApellidos() + ", " + meg.getAutor().getNombres());
            System.out.println(meg.getRol());
        }
    }
    
    public boolean esSuperAdministradores() 
    {
        if (this.nombre.equals("Super Administradores")) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public boolean tieneMiembros() 
    {
        if (this.miembrosEnGrupo.isEmpty()) 
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
    
    public void mostrar () 
    {
        System.out.println("Grupo: " + this.getNombre());
        System.out.println("Descripcion: " + this.getDescripcion());
        this.verMiembros();
    }
}
