package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import java.util.ArrayList;

public abstract class Autor 
{
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private ArrayList<Grupo> grupos = new ArrayList<>();
    private ArrayList<MiembroEnGrupo> miembroEnGrupos = new ArrayList<>();
    private int flag = 0;

    public Autor(int dni, String apellidos, String nombres, String clave) 
    {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
    }

    public int getDni() 
    {
        return dni;
    }

    public void setDni(int dni) 
    {
        this.dni = dni;
    }

    public String getApellidos() 
    {
        return apellidos;
    }

    public void setApellidos(String apellidos) 
    {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) 
    {
        this.nombres = nombres;
    }

    public String getClave() 
    {
        return clave;
    }

    public void setClave(String clave) 
    {
        this.clave = clave;
    }

    //Ahora desde acá se compara para saber si son iguales por DNI
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 97 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    public void agregarGrupo (Grupo grupo, Rol rol) 
    {
        for (Grupo g : grupos) 
        {
            if(grupos.contains(grupo)) 
            {
                return;
            }
        }
        
        MiembroEnGrupo nuevoGrupo = new MiembroEnGrupo(this, grupo, rol);
        miembroEnGrupos.add(nuevoGrupo);
        grupos.add(grupo);
        grupo.agregarMiembro(this, rol);
    }
    
    public void quitarGrupo (Grupo grupo) 
    {
        for (Grupo g : grupos) {
            if(grupos.contains(grupo)) {
                grupos.remove(grupo);
            }
        }
        
        for (MiembroEnGrupo meg : miembroEnGrupos) 
        {
            if(meg.equalsGrupo(grupo)) 
            {
                miembroEnGrupos.remove(meg);
            }
        }
        
        System.out.println(this.grupos);
    }
    
    public void getGrupos () 
    {
        System.out.println("Grupos:");
        for (MiembroEnGrupo meg : miembroEnGrupos) 
        {
            System.out.println(meg.verGrupo().verNombre() + ", " +meg.verGrupo().verDescripcion());
            System.out.println(meg.verRol());
        }
    }
    
    public boolean esSuperAdministrador() 
    {
        for (Grupo g : grupos) {
            if(g.esSuperAdministradores()) 
            {
                return true;
            }
        }
        return false;
    }
    
    ////Metodo que van a heredar agregando solamente las variables diferentes entre Alumno y profesor
    public void mostrar() 
    {
        System.out.println("[" + this.getDni()+"] "+ this.getApellidos() +", "+this.getNombres());
        this.getGrupos();
    }
}