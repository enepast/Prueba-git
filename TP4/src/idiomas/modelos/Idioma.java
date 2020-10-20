package idiomas.modelos;

public class Idioma 
{
    private String nombre;

    public Idioma(String nombre) 
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
    
    public String toString() 
    {
        return "Idioma: " + this.nombre;
    }
    
    public void Mostrar() 
    {
        System.out.println(this.toString());
    }
}
