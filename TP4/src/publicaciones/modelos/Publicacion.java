package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

public class Publicacion 
{
    private String titulo;
    private LocalDate fechaPublicacion;
    private String enlace;
    private String resumen;
    private Tipo tipo;
    private Idioma idioma;
    private Lugar lugar;
    private MiembroEnGrupo miembroEnGrupo;
    private ArrayList<PalabraClave> palabrasClaves;

    public Publicacion(String titulo, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen) 
    {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.tipo = tipo;
        this.idioma = idioma;
        this.lugar = lugar;
        this.miembroEnGrupo = miembroEnGrupo;
        this.palabrasClaves = palabrasClaves;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() 
    {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) 
    {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEnlace() 
    {
        return enlace;
    }

    public void setEnlace(String enlace) 
    {
        this.enlace = enlace;
    }

    public String getResumen() 
    {
        return resumen;
    }

    public void setResumen(String resumen) 
    {
        this.resumen = resumen;
    }
    
    public Tipo getTipo() 
    {
        return tipo;
    }

    public void setTipo(Tipo tipo) 
    {
        this.tipo = tipo;
    }

    public Idioma getIdioma() 
    {
        return idioma;
    }

    public void setIdioma(Idioma idioma) 
    {
        this.idioma = idioma;
    }

    public Lugar getLugar() 
    {
        return lugar;
    }

    public void setLugar(Lugar lugar) 
    {
        this.lugar = lugar;
    }

    public ArrayList<PalabraClave> getPalabrasClaves() 
    {
        return palabrasClaves;
    }

    public void setPalabrasClaves(ArrayList<PalabraClave> palabrasClaves) 
    {
        this.palabrasClaves = palabrasClaves;
    }
    
    public MiembroEnGrupo getMiembroEnGrupo() 
    {
        return miembroEnGrupo;
    }

    public void setMiembroEnGrupo(MiembroEnGrupo miembroEnGrupo) 
    {
        this.miembroEnGrupo = miembroEnGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.titulo);
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
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {//Compara entre titulos
            return false;
        }
        return true;
    }

    public void mostrar() 
    {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.miembroEnGrupo.getAutor().getApellidos() + ", " + this.miembroEnGrupo.getAutor().getNombres());
        System.out.println("Grupo: " + this.miembroEnGrupo.getGrupo().getNombre());
        System.out.println("Rol: " + this.miembroEnGrupo.getRol().name());
        System.out.println("Fecha de publicacion: " + this.fechaPublicacion);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Idioma: " + this.idioma);
        System.out.println("Lugar: " + this.lugar);
        System.out.println("Palabras claves\n---------------");
        for(PalabraClave pc : palabrasClaves) 
        {
           System.out.println("\t" + pc); 
        }
        System.out.println("Enlace: " + this.enlace);
        System.out.println("Resumen: " + this.resumen);
    } 
}