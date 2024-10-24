/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block_de_notasbeans;

/**
 *
 * @author dam2
 */
public class ControlBlock {
    
    private ModeloConfig MiConfig;
    private VentanaBlock MiVentanaBlock;

    public ControlBlock(ModeloConfig MiConfig, VentanaBlock MiVentanaBlock) {
        this.MiConfig = MiConfig;
        this.MiVentanaBlock = MiVentanaBlock;
        
        MiConfig.setTitulo("Titulo Dinámico");
    }
    
    public void iniciandoControl(){
    
        MiVentanaBlock.setTitle(MiConfig.getTitulo());
        MiVentanaBlock.setVisible(true);
    
    }
    
    
}
