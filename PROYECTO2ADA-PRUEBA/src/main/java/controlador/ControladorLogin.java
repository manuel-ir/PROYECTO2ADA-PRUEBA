package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.GestorBD;
import vista.Login;
import vista.VistaPaginaPrincipal;

public class ControladorLogin implements ActionListener{
    
    private final Login vista;
    private final GestorBD modelo;

    public ControladorLogin(Login vista, GestorBD modelo) {
        this.vista = vista;
        this.modelo = modelo;

        // Listeners de los botones
        this.vista.getBtnLogin().addActionListener(this);
        this.vista.getBtnRegistro().addActionListener(this);
    }
    
    public void iniciarVista() {
        vista.setLocationRelativeTo(null);
        vista.setTitle("Login");
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // SI PULSA LOGIN
        if (e.getSource() == vista.getBtnLogin()) {
            abrirVentanaPrincipal();
        }
        
        // SI PULSA REGISTRO
        else if (e.getSource() == vista.getBtnRegistro()) {
             vista.mostrarMensaje("Aquí iría la ventana de registro.");
        }
    }

    private void abrirVentanaPrincipal() {
        // Cierra el login
        vista.dispose(); 
        
        // Crea y muestra la ventana principal
        VistaPaginaPrincipal vistaPrincipal = new VistaPaginaPrincipal();
        vistaPrincipal.setVisible(true);
        
        System.out.println("Se ha abierto la ventana principal");
    }
    
}
