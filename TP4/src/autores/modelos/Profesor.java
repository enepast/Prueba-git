package autores.modelos;

public class Profesor extends Autor
{
    private Cargo cargo;

    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) 
    {
        //Solucionado (solo se agrega cargo, el resto se obtiene con super())
        super(dni, apellidos, nombres, clave);
        this.cargo = cargo;
    }

    public Cargo getCargo() 
    {
        return cargo;
    }

    public void setCargo(Cargo cargo) 
    {
        this.cargo = cargo;
    }

    @Override
    public void mostrar() 
    {
        super.mostrar();
        System.out.println("Cargo: " + this.getCargo()+ "\n");
    }
}
