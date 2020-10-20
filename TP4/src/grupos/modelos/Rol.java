package grupos.modelos;

public enum Rol 
{
    ADMINISTRADOR,
    COLABORADOR;
    
    public static Rol getADMINISTRADOR() 
    {    
        return ADMINISTRADOR;
    }

    public static Rol getCOLABORADOR() 
    {
        return COLABORADOR;
    }
}
