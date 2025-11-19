import controlador.ControladorLogin;
import modelo.GestorBD;
import vista.Login;

public class Main {
    
    public static void main(String[] args) {
        try {
            
            GestorBD modelo = new GestorBD();
            Login vistaLogin = new Login();
            
            ControladorLogin controlador = new ControladorLogin(vistaLogin, modelo);
            controlador.iniciarVista();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
