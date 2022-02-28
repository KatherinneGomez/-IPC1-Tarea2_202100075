
package tarea2_login;


public class Usuario {
    private String nombre;
    private String apellido;
    private String carnet;
    private String user;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String carnet, String user, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.user = user;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
