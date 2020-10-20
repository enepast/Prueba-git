package autores.modelos;

public class Alumno extends Autor  
{
    private String cx;

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) 
    {
        //Solucionado
        super(dni, apellidos, nombres, clave);
        this.cx = cx;
    }
   
    public String getCx() 
    {
        return cx;
    }

    public void setCx(String cx) 
    {
        this.cx = cx;
    }
    
    @Override
    public void mostrar() 
    {
        super.mostrar();
        System.out.println("CX: " + this.getCx());
    }
}
