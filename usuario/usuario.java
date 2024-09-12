package usuario;
public class usuario{
    
    private String apellido;
    private String nombre;
    private int documento;
    private String nombreUsuario;
    private String contrasenia;
    
    public usuario () {

    }

    public usuario (String apellido, String nombre, int documento, String nombreUsuario, String contrasenia){
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }
    

    public String getApellido(){
        return apellido;
    }

    public String getNombre(){
        return nombre;
    }

    public int getDocumento(){
        return documento;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }


    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDocumento(int documento){
        this.documento = documento;
    }

    public void setContrasenia(String contrasenia){
        this.contrasenia = contrasenia;
    }
}