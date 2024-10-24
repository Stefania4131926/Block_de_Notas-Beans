/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package block_de_notasbeans;

/**
 *
 * @author dam2
 */
public class Block_De_NotasBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModeloConfig MiConfiguracion = new ModeloConfig();
        VentanaBlock miVistaPrincipal = new VentanaBlock();
        ControlBlock controlador = new ControlBlock(MiConfiguracion, miVistaPrincipal);
        controlador.iniciandoControl();
    }
    
}
