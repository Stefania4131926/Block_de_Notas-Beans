/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package block_de_notasbeans;

/**
 *
 * @author dam2
 */
public class VentanaBlock extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBlock
     */
    public VentanaBlock() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEstado = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        panelBotonera = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        MitemNuevo = new javax.swing.JMenuItem();
        MitemSalir = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        MitemCopiar = new javax.swing.JMenuItem();
        MitemCortar = new javax.swing.JMenuItem();
        MitemPegar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelEstado.setText("Iniciando..");
        getContentPane().add(labelEstado, java.awt.BorderLayout.PAGE_END);

        panelCentral.setLayout(new java.awt.BorderLayout());

        panelBotonera.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\dam2\\Desktop\\iconos\\anadir.png")); // NOI18N
        btnNuevo.setText("Nuevo");
        panelBotonera.add(btnNuevo);

        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\dam2\\Desktop\\iconos\\cerrar-sesion (1).png")); // NOI18N
        btnSalir.setText("Salir");
        panelBotonera.add(btnSalir);

        panelCentral.add(panelBotonera, java.awt.BorderLayout.PAGE_START);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panelCentral.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        menuArchivo.setText("Archivo");

        MitemNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\dam2\\Desktop\\iconos\\anadir.png")); // NOI18N
        MitemNuevo.setText("Nuevo");
        menuArchivo.add(MitemNuevo);

        MitemSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\dam2\\Desktop\\iconos\\cerrar-sesion (1).png")); // NOI18N
        MitemSalir.setText("Salir");
        menuArchivo.add(MitemSalir);

        jMenuBar1.add(menuArchivo);

        menuEditar.setText("Editar");

        MitemCopiar.setText("Copiar");
        menuEditar.add(MitemCopiar);

        MitemCortar.setText("Cortar");
        menuEditar.add(MitemCortar);

        MitemPegar.setText("Pegar");
        menuEditar.add(MitemPegar);

        jMenuBar1.add(menuEditar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MitemCopiar;
    private javax.swing.JMenuItem MitemCortar;
    private javax.swing.JMenuItem MitemNuevo;
    private javax.swing.JMenuItem MitemPegar;
    private javax.swing.JMenuItem MitemSalir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JPanel panelBotonera;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
