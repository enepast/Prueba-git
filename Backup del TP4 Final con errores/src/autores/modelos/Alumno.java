package autores.modelos;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.cx);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
        {
            if(obj instanceof Alumno)
            {
                return Objects.equals(this.cx, ((Alumno)obj).getCx());
            }
            else
                return false;
        }
        return true;
    }
    
    
    
    @Override
    public void mostrar() 
    {
        super.mostrar();
        System.out.println("CX: " + this.getCx());
    }
}
