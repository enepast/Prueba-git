package idiomas.modelos;

public class Idioma 
{
    private String nombre;

    public Idioma(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String verNombre() 
    {
        return nombre;
    }

    public void asignarNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String toString() 
    {
        return "Idioma: " + this.nombre;
    }
    
    public void Mostrar() 
    {
        System.out.println(this.toString());
    }
}
