package autores.modelos;

import javax.swing.DefaultComboBoxModel;

public class ModeloComboCargos extends DefaultComboBoxModel
{

    public ModeloComboCargos() 
    {
        for (Cargo cargo : Cargo.values()) {
            this.addElement(cargo);
        }
    }
    
    public Cargo getCargo() 
    {
        return (Cargo)this.getSelectedItem();
    }
    
    public void seleccionarCargo (Cargo cargo) 
    {
        this.setSelectedItem(cargo);
    }
    
}
