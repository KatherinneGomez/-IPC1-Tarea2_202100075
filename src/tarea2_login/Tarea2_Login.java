
package tarea2_login;


public class Tarea2_Login {

    static Usuario usuario;
    
    public static void main(String[] args) {
        crearUsuario();
        FrmLogin login = new FrmLogin(usuario);
        login.setTitle("Login");
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
    public static void crearUsuario(){
        String nombre = "Katherinne Gabriela";
        String apellido = "Gómez Marroquin";
        String carnet = "202100075";
        
        usuario = new Usuario(nombre,apellido,carnet,nombre,carnet);
    }
}
